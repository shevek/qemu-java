/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuIdAllocator {

    private int driveIndex;
    private int networkIndex;
    private int pciAddress;

    @Nonnegative
    public int newDriveIndex() {
        return ++driveIndex;
    }

    @Nonnegative
    public int newNetworkIndex() {
        return ++networkIndex;
    }

    @Nonnull
    public String newPciAddresses(int n, String sep) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0)
                buf.append(sep);
            buf.append(newPciAddress());
        }
        return buf.toString();
    }

    @Nonnull
    public String newPciAddress() {
        return "0x" + Integer.toHexString(++pciAddress);
    }
}
