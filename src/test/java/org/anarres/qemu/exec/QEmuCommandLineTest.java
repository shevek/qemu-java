/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.anarres.qemu.exec.dev.BrailleHostDevice;
import org.anarres.qemu.exec.dev.LinuxParportDeviceHostDevice;
import org.anarres.qemu.exec.dev.TcpHostDevice;
import org.anarres.qemu.exec.disk.IScsiDisk;
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