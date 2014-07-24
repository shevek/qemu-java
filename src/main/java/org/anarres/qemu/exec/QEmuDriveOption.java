/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuDriveOption extends AbstractQEmuOption {
    // file=file,index=0,media=disk

    public static enum Interface {

        ide, scsi, sd, mtd, floppy, pflash, virtio
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
    public File file;
    // bus, unit
    public int index;
    public Interface iface;
    public Media media;
    public Cache cache;
    public Aio aio;
    public Discard discard;
    public ErrorAction werror;
    public ErrorAction rerror;
    public boolean readonly;
    public CopyOnRead copyOnRead;

    public QEmuDriveOption() {
    }

    public QEmuDriveOption(int index, File file) {
        this.file = file;
        this.index = index;
    }

    public QEmuDriveOption(int index, String file) {
        this(index, new File(file));
    }

    @Nonnull
    public QEmuDriveOption withFile(@Nonnull File file) {
        this.file = file;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withIndex(@Nonnegative int index) {
        this.index = index;
        return this;
    }

    @Nonnull
    public QEmuDriveOption withInterface(@Nonnegative Interface iface) {
        this.iface = iface;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder();
        appendTo(buf, "file", file);
        appendTo(buf, "index", index);
        appendTo(buf, "if", iface);
        appendTo(buf, "media", media);
        appendTo(buf, "cache", cache);
        appendTo(buf, "aio", aio);
        appendTo(buf, "discard", discard);
        appendTo(buf, "werror", werror);
        appendTo(buf, "rerror", rerror);
        if (readonly)
            buf.append("readonly");
        appendTo(buf, "copy-on-read", copyOnRead);

        line.addAll(Arrays.asList("-drive", buf.toString()));
    }
}