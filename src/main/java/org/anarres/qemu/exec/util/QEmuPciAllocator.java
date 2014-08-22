/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuPciAllocator {

    private int address;

    @Nonnull
    public String allocate(int n, String sep) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0)
                buf.append(sep);
            buf.append(allocate());
        }
        return buf.toString();
    }

    @Nonnull
    public String allocate() {
        return Integer.toHexString(++address);
    }
}
