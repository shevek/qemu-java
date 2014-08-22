/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.util.QEmuIdAllocator;

/**
 *
 * @author shevek
 */
public class QEmuDeviceOption extends AbstractQEmuOption {

    public static final String PROP_ID = "id";
    public static final String PROP_BUS = "bus";
    public static final String PROP_ADDR = "addr";
    private final String name;
    private final Map<String, String> properties = new HashMap<String, String>();

    public QEmuDeviceOption(@Nonnull String name) {
        this.name = name;
    }

    @Nonnull
    public QEmuDeviceOption withProperties(@Nonnull Map<String, String> properties) {
        this.properties.putAll(properties);
        return this;
    }

    @Nonnull
    public QEmuDeviceOption withProperty(@Nonnull String key, @Nonnull String value) {
        properties.put(key, value);
        return this;
    }

    @Nonnull
    public QEmuDeviceOption withProperty(@Nonnull String key) {
        properties.put(key, null);
        return this;
    }

    @Nonnull
    public QEmuDeviceOption withId(@Nonnull String id) {
        return withProperty(PROP_ID, id);
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder(name);
        appendTo(buf, properties);
        add(line, "-device", buf);
    }

    public static class Pci extends QEmuDeviceOption {

        // virtio-balloon-pci,id=balloon0,bus=pci.0,addr=0x6
        public Pci(@Nonnull String name) {
            super(name);
            withBus("pci.0");
        }

        @Override
        public Pci withId(@Nonnull String id) {
            super.withId(id);
            return this;
        }

        @Nonnull
        public Pci withBus(@Nonnull String bus) {
            withProperty(PROP_BUS, bus);
            return this;
        }

        @Nonnull
        public Pci withAddress(@Nonnull String address) {
            withProperty(PROP_ADDR, address);
            return this;
        }

        @Nonnull
        public Pci withAddress(@Nonnull QEmuIdAllocator allocator) {
            withProperty(PROP_ADDR, allocator.newPciAddress());
            return this;
        }
    }

    public static class VirtioBalloon extends Pci {

        public VirtioBalloon() {
            super("virtio-balloon-pci");
        }
    }

    public static class VirtioNet extends Pci {

        // virtio-net-pci,netdev=hostnet0,id=net0,mac=fa:16:3e:13:ff:1f,bus=pci.0,addr=0x3
        public static final String PROP_NETDEV = "netdev";
        public static final String PROP_MAC = "mac";

        public VirtioNet() {
            super("virtio-net-pci");
        }

        @Nonnull
        public VirtioNet withMac(String mac) {
            withProperty(PROP_MAC, mac);
            return this;
        }
    }

    public static class VirtioBlock extends Pci {
        // virtio-blk-pci,scsi=off,bus=pci.0,addr=0x5,drive=drive-virtio-disk0,id=virtio-disk0,bootindex=1

        public static final String PROP_SCSI = "scsi";
        public static final String PROP_DRIVE = "drive";
        public static final String PROP_BOOTINDEX = "bootindex";

        public VirtioBlock() {
            super("virtio-blk-pci");
        }

        @Nonnull
        public VirtioBlock withDrive(String id) {
            withProperty(PROP_DRIVE, id);
            return this;
        }

        @Nonnull
        public VirtioBlock withDrive(QEmuDriveOption option) {
            return withDrive(option.id);
        }
    }

    public static class Piix3Usb extends Pci {

        // piix3-usb-uhci,id=usb,bus=pci.0,addr=0x1.0x2
        public Piix3Usb() {
            super("piix3-usb-uhci");
            withId("usb");
        }

        @Override
        public Piix3Usb withAddress(@Nonnull QEmuIdAllocator allocator) {
            withProperty(PROP_ADDR, allocator.newPciAddresses(2, "."));
            return this;
        }
    }

    public static class Isa extends QEmuDeviceOption {

        public Isa(String name) {
            super(name);
        }

        @Override
        public Isa withId(@Nonnull String id) {
            super.withId(id);
            return this;
        }
    }

    public static class IsaSerial extends Isa {
        // isa-serial,chardev=charserial0,id=serial0

        public static final String PROP_CHARDEV = "chardev";

        public IsaSerial() {
            super("isa-serial");
        }

        @Override
        public IsaSerial withId(@Nonnull String id) {
            super.withId(id);
            return this;
        }

        @Nonnull
        public IsaSerial withChardev(String id) {
            withProperty(PROP_CHARDEV, id);
            return this;
        }
    }
}
