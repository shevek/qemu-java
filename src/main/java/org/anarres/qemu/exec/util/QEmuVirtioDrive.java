/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import java.io.File;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuDriveOption;
import org.anarres.qemu.exec.QEmuOption;

/**
 *
 * @author shevek
 */
public class QEmuVirtioDrive implements QEmuOption {
    // file=/var/tmp/qemu/sys-1/vda,if=none,id=drive-virtio-disk0,format=raw,cache=unsafe,aio=native

    public final QEmuDriveOption driveOption;
    // virtio-blk-pci,scsi=off,bus=pci.0,addr=0x5,drive=drive-virtio-disk0,id=virtio-disk0,bootindex=1
    public final QEmuDeviceOption.VirtioBlock deviceOption;

    public QEmuVirtioDrive(@Nonnegative int index, @Nonnull File file) {
        int id = System.identityHashCode(this);
        driveOption = new QEmuDriveOption(index, file)
                .withInterface(QEmuDriveOption.Interface.none)
                .withId("drive-virtio-disk" + id)
                .withAio(QEmuDriveOption.Aio._native);
        // virtio-blk-pci,scsi=off,bus=pci.0,addr=0x5,drive=drive-virtio-disk0,id=virtio-disk0,bootindex=1
        deviceOption = new QEmuDeviceOption.VirtioBlock();
        deviceOption
                .withId("virtio-disk" + id)
                .withProperty("scsi", "off")
                .withProperty("drive", driveOption.id);
    }

    public QEmuVirtioDrive(@Nonnegative int index, @Nonnull String file) {
        this(index, new File(file));
    }

    @Nonnull
    public QEmuVirtioDrive withFormat(@Nonnull QEmuDriveOption.Format format) {
        driveOption.withFormat(format);
        return this;
    }

    @Nonnull
    public QEmuVirtioDrive withCache(@Nonnull QEmuDriveOption.Cache cache) {
        driveOption.withCache(cache);
        return this;
    }

    @Nonnull
    public QEmuVirtioDrive withAio(@Nonnull QEmuDriveOption.Aio aio) {
        driveOption.withAio(aio);
        return this;
    }

    @Nonnull
    public QEmuVirtioDrive withAddress(@Nonnull String address) {
        deviceOption.withAddress(address);
        return this;
    }

    @Nonnull
    public QEmuVirtioDrive withAddress(@Nonnull QEmuPciAllocator allocator) {
        deviceOption.withAddress(allocator);
        return this;
    }

    @Nonnull
    public QEmuVirtioDrive withProperty(@Nonnull String key, @Nonnull String value) {
        deviceOption.withProperty(key, value);
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        driveOption.appendTo(line);
        deviceOption.appendTo(line);
    }
}
