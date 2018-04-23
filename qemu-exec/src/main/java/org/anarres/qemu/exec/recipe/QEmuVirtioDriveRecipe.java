/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.recipe;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuDriveOption;
import org.anarres.qemu.exec.QEmuDriveOption.Cache;
import org.anarres.qemu.exec.host.disk.Disk;
import org.anarres.qemu.exec.host.disk.FileDisk;
import org.anarres.qemu.exec.util.QEmuIdAllocator;
import org.anarres.qemu.exec.util.QEmuOptionsList;
import org.anarres.qemu.image.QEmuImage;
import org.anarres.qemu.image.QEmuImageFormat;

/**
 *
 * @author shevek
 */
public class QEmuVirtioDriveRecipe extends QEmuOptionsList implements QEmuRecipe {

    // file=/var/tmp/qemu/sys-1/vda,if=none,id=drive-virtio-disk0,format=raw,cache=unsafe,aio=native
    // public final QEmuDeviceOption.VirtioScsi busOption;
    public final QEmuDriveOption driveOption;
    // virtio-blk-pci,scsi=off,bus=pci.0,addr=0x5,drive=drive-virtio-disk0,id=virtio-disk0,bootindex=1
    public final QEmuDeviceOption.VirtioBlock deviceOption;

    public QEmuVirtioDriveRecipe(@Nonnegative int index, @Nonnull Disk disk) {
        // busOption = new QEmuDeviceOption.VirtioScsi();
        // add(busOption);
        driveOption = new QEmuDriveOption(index, disk)
                .withInterface(QEmuDriveOption.Interface.none)
                .withId("backend-disk-" + index)
                .withAio(QEmuDriveOption.Aio._native)
                .withCache(Cache.none);
        add(driveOption);
        // virtio-blk-pci,scsi=off,bus=pci.0,addr=0x5,drive=drive-virtio-disk0,id=virtio-disk0,bootindex=1
        deviceOption = new QEmuDeviceOption.VirtioBlock();
        deviceOption
                .withId("virtio-disk-" + index)
                .withProperty("scsi", "off")
                .withProperty("drive", driveOption.id);
        add(deviceOption);
    }

    public QEmuVirtioDriveRecipe(@Nonnegative int index, @Nonnull QEmuImage image) {
        this(index, new FileDisk(image));
    }

    public QEmuVirtioDriveRecipe(@Nonnegative int index, @Nonnull String path) {
        this(index, new FileDisk(path));
    }

    public QEmuVirtioDriveRecipe(@Nonnegative QEmuIdAllocator allocator, @Nonnull Disk disk) {
        this(allocator.newDriveIndex(), disk);
    }

    public QEmuVirtioDriveRecipe(@Nonnegative QEmuIdAllocator allocator, @Nonnull QEmuImage image) {
        this(allocator.newDriveIndex(), new FileDisk(image));
    }

    public QEmuVirtioDriveRecipe(@Nonnegative QEmuIdAllocator allocator, @Nonnull String path) {
        this(allocator.newDriveIndex(), new FileDisk(path));
    }

    @Nonnull
    public QEmuVirtioDriveRecipe withFormat(@Nonnull QEmuImageFormat format) {
        driveOption.withFormat(format);
        return this;
    }

    @Nonnull
    public QEmuVirtioDriveRecipe withCache(@Nonnull QEmuDriveOption.Cache cache) {
        driveOption.withCache(cache);
        return this;
    }

    @Nonnull
    public QEmuVirtioDriveRecipe withAio(@Nonnull QEmuDriveOption.Aio aio) {
        driveOption.withAio(aio);
        return this;
    }

    @Nonnull
    public QEmuVirtioDriveRecipe withPciAddress(@Nonnull String address) {
        deviceOption.withPciAddress(address);
        return this;
    }

    @Nonnull
    public QEmuVirtioDriveRecipe withPciAddress(@Nonnull QEmuIdAllocator allocator) {
        deviceOption.withPciAddress(allocator);
        return this;
    }

    @Nonnull
    public QEmuVirtioDriveRecipe withProperty(@Nonnull String key, @Nonnull String value) {
        deviceOption.withProperty(key, value);
        return this;
    }
}
