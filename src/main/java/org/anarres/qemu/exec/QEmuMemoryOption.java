/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuMemoryOption extends AbstractQEmuOption {

    public static enum Magnitude {

        UNIT(1L),
        KILO(1024L),
        MEGA(KILO, 1024L),
        GIGA(MEGA, 1024L),
        TERA(GIGA, 1024L),
        PETA(TERA, 1024L);
        private final long multiplier;

        Magnitude(long multiplier) {
            this.multiplier = multiplier;
        }

        Magnitude(Magnitude reference, long multiplier) {
            this.multiplier = reference.multiplier * multiplier;
        }

        public long toUnit(long amount) {
            return multiplier * amount;
        }
    }
    // private final String host;
    private final long size;

    public QEmuMemoryOption(long size, @Nonnull Magnitude magnitude) {
        this.size = magnitude.toUnit(size);
    }

    @Override
    public void appendTo(List<? super String> line) {
        line.addAll(Arrays.asList("-m", String.valueOf(size)));
    }
}
