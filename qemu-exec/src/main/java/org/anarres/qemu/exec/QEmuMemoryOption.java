/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuMemoryOption extends AbstractQEmuOption {

    // TODO -> Generic package where it can be used for file sizes, etc.
    public static enum Magnitude {

        UNIT(1L),
        KILO(1024L),
        MEGA(KILO, 1024L),
        GIGA(MEGA, 1024L),
        TERA(GIGA, 1024L),
        PETA(TERA, 1024L);
        private final long multiplier;

        Magnitude(@Nonnegative long multiplier) {
            this.multiplier = multiplier;
        }

        Magnitude(@Nonnull Magnitude reference, @Nonnegative long multiplier) {
            this.multiplier = reference.multiplier * multiplier;
        }

        public long toUnit(long amount) {
            return multiplier * amount;
        }
    }
    // private final String host;
    private final long size;
    private File path;
    private boolean prealloc;

    public QEmuMemoryOption(long size, @Nonnull Magnitude magnitude) {
        this.size = magnitude.toUnit(size) / Magnitude.MEGA.multiplier;
    }

    @Nonnull
    public QEmuMemoryOption withPath(File path) {
        this.path = path;
        return this;
    }

    @Nonnull
    public QEmuMemoryOption withPrealloc(boolean prealloc) {
        this.prealloc = prealloc;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-m", String.valueOf(size));
        if (path != null)
            add(line, "-mem-path", path.getAbsolutePath());
        if (prealloc)
            add(line, "-mem-prealloc");
    }
}
