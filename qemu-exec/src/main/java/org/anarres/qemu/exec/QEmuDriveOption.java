/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.host.disk.Disk;
import org.anarres.qemu.exec.host.disk.FileDisk;
import org.anarres.qemu.exec.recipe.QEmuVirtioDriveRecipe;
import org.anarres.qemu.exec.util.QEmuIdAllocator;
import org.anarres.qemu.image.QEmuImageFormat;

/**
 * A disk device backend, usually paired with a {@link QEmuDeviceOption} frontend.
 *
 * @see QEmuVirtioDriveRecipe
 * @see QEmuDeviceOption
 * @author shevek
 */
public class QEmuDriveOption extends AbstractQEmuOption {

    // file=file,index=0,media=disk
    public static enum Interface {

        ide, scsi, sd, mtd, floppy, pflash, virtio, none
    }

    public static enum Media {

        disk, cdrom
    }

    public static enum Cache {

        none, writeback, unsafe, directsync, writethrough
    }

    public static enum Aio {

        threads("threads"),
        _native("native");
        private final String text;
        /* pp */ Aio(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public static enum Discard {

        off, on
    }

    public static enum ErrorAction {

        ignore, stop, report, enospc
    }

    public static enum CopyOnRead {

        off, on
    }
    public Disk disk;
    // bus, unit
    public String id;
    public int index;
    public Interface iface;
    // bus=, unit=
    // addr= for virtio only?
    public QEmuImageFormat format;
    public Media media;
    // cyls=c,heads=h,secs=s[,trans=t]
    // snapshot=on|off
    public Cache cache;
    public Aio aio;
    public Discard discard;
    public ErrorAction werror;
    public ErrorAction rerror;
    public boolean readonly;
    public CopyOnRead copyOnRead;

    public QEmuDriveOption() {
    }

    public QEmuDriveOption(int index, Disk disk) {
        this.disk = disk;
        this.index = index;
    }

    public QEmuDriveOption(int index, File file) {
        this(index, new FileDisk(file));
    }

    public QEmuDriveOption(int index, String path) {
        this(index, new FileDisk(path));
    }

    public QEmuDriveOption(@Nonnull QEmuIdAllocator allocator, Disk disk) {
        this(allocator.newDriveIndex(), disk);
    }

    public QEmuDriveOption(@Nonnull QEmuIdAllocator allocator, File file) {
        this(allocator, new FileDisk(file));
    }

    public QEmuDriveOption(@Nonnull QEmuIdAllocator allocator, String path) {
        this(allocator, new FileDisk(path));
    }

    @Nonnull
    public QEmuDriveOption withDisk(@Nonnull Disk disk) {
        this.disk = disk;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withFile(@Nonnull File file) {
        return withDisk(new FileDisk(file));
    }

    @Nonnull
    public QEmuDriveOption withId(@Nonnull String id) {
        this.id = id;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withIndex(@Nonnegative int index) {
        this.index = index;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withIndex(@Nonnegative QEmuIdAllocator allocator) {
        return withIndex(allocator.newDriveIndex());
    }

    @Nonnull
    public QEmuDriveOption withInterface(@Nonnull Interface iface) {
        this.iface = iface;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withFormat(@Nonnull QEmuImageFormat format) {
        this.format = format;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withMedia(@Nonnull Media media) {
        this.media = media;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withCache(@Nonnull Cache cache) {
        this.cache = cache;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withAio(@Nonnull Aio aio) {
        this.aio = aio;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withDiscard(@Nonnull Discard discard) {
        this.discard = discard;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withWriteErrorAction(@Nonnull ErrorAction action) {
        this.werror = action;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withReadErrorAction(@Nonnull ErrorAction action) {
        this.rerror = action;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withReadOnly(boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withCopyOnRead(@Nonnull CopyOnRead copyOnRead) {
        this.copyOnRead = copyOnRead;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder();
        appendTo(buf, "file", disk);
        appendTo(buf, "index", index);
        appendTo(buf, "id", id);
        appendTo(buf, "if", iface);
        appendTo(buf, "format", format);
        appendTo(buf, "media", media);
        appendTo(buf, "cache", cache);
        appendTo(buf, "aio", aio);
        appendTo(buf, "discard", discard);
        appendTo(buf, "werror", werror);
        appendTo(buf, "rerror", rerror);
        if (readonly) {
            if (buf.length() > 0)
                buf.append(",");
            buf.append("readonly");
        }
        appendTo(buf, "copy-on-read", copyOnRead);

        add(line, "-drive", buf.toString());
    }
}
