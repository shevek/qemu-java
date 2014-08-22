/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.UUID;
import org.anarres.qemu.exec.host.dev.BrailleHostDevice;
import org.anarres.qemu.exec.host.dev.LinuxParportDeviceHostDevice;
import org.anarres.qemu.exec.host.dev.TcpHostDevice;
import org.anarres.qemu.exec.host.disk.IScsiDisk;
import org.anarres.qemu.exec.util.QEmuOptionsList;
import org.anarres.qemu.exec.util.QEmuPciAllocator;
import org.anarres.qemu.exec.util.QEmuVirtioDrive;
import org.anarres.qemu.exec.util.QEmuVirtioNet;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class QEmuCommandLineTest {

    private static final Logger LOG = LoggerFactory.getLogger(QEmuCommandLineTest.class);

    @Test
    public void testLibvirtCommandLine() {

        QEmuOptionsList defaultOptions = new QEmuOptionsList(
                QEmuMiscOptions.ENABLE_KVM,
                QEmuMiscOptions.NO_USER_CONFIG,
                QEmuMiscOptions.NO_DEFAULTS,
                QEmuMiscOptions.NO_SHUTDOWN,
                QEmuMiscOptions.NO_ACPI,
                new QEmuRtcOption().withBase(QEmuRtcOption.Base.utc),
                null);

        QEmuPciAllocator allocator = new QEmuPciAllocator();
        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64, QEmuMachine.pc_1_3);
        commandLine.addOptions(
                defaultOptions,
                new QEmuIdOption(UUID.randomUUID(), "sys-1"),
                new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA),
                new QEmuCpusOption(2).withSockets(2).withCores(1).withThreads(1),
                new QEmuDisplayOption(QEmuDisplayOption.DisplayType.vnc).withVncDisplay(new VncDisplay.Socket(null, 0)),
                // mon
                new QEmuDeviceOption.Piix3Usb().withAddress(allocator),
                new QEmuVirtioDrive(0, "/var/tmp/qemu/sys-1/vda").withAddress(allocator).withFormat(QEmuDriveOption.Format.raw).withCache(QEmuDriveOption.Cache.unsafe).withProperty("bootindex", "1"),
                new QEmuVirtioNet().withAddress(allocator).withMac("fa:16:3e:13:ff:00"),
                new QEmuVirtioNet().withAddress(allocator).withMac("fa:16:3e:13:ff:01"),
                new QEmuKernelOption("/var/tmp/qemu/sys-1/kernel").withInitrd("/var/tmp/qemu/sys-1/initrd").withAppend("root=/dev/vda2 console=ttyS0"),
                null);
        // -chardev socket,id=charmonitor,path=/var/lib/libvirt/qemu/sys-1.monitor,server,nowait

        LOG.info("Command is " + commandLine.toCommandWords());
    }

    @Test
    public void testCommandLine() throws Exception {
        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        commandLine.addOptions(new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA).withPrealloc(true));
        commandLine.addOptions(new QEmuQMPOption(new TcpHostDevice(4444)));
        commandLine.addOptions(new QEmuDriveOption(0, "/home/shevek/sda.img"));
        commandLine.addOptions(new QEmuDriveOption(1, "/home/shevek/sdb.img").withInterface(QEmuDriveOption.Interface.scsi));
        commandLine.addOptions(new QEmuDriveOption(2, new IScsiDisk(InetAddress.getByName("localhost"), "iqn.foo", 5)));
        commandLine.addOptions(new QEmuKeyboardOption(QEmuKeyboardOption.Layout.en_gb));
        commandLine.addOptions(new QEmuDisplayOption(QEmuDisplayOption.DisplayType.vnc));
        commandLine.addOptions(new QEmuSerialPortOption(new TcpHostDevice(new InetSocketAddress(123))));
        commandLine.addOptions(new QEmuSerialPortOption(new LinuxParportDeviceHostDevice(4)));
        commandLine.addOptions(new QEmuSerialPortOption(new BrailleHostDevice()));
        LOG.info("Command is " + commandLine.toCommandWords());
    }
}