/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 * An allocator for unique drive, network and PCI addresses.
 *
 * This class is basically a set of incrementing counters.
 *
 * @author shevek
 */
public class QEmuIdAllocator {

    public static interface Consumer {

        public void withAllocator(@Nonnull QEmuIdAllocator allocator);
    }

    private int driveIndex;
    private int networkIndex;
    private int networkBootIndex;
    private int pciAddress;

    public QEmuIdAllocator() {
    }

    public QEmuIdAllocator(@Nonnull QEmuIdAllocator predecessor) {
        this.driveIndex = predecessor.driveIndex;
        this.networkIndex = predecessor.networkIndex;
        this.networkBootIndex = predecessor.networkBootIndex;
        this.pciAddress = predecessor.pciAddress;
    }

    @Nonnegative
    public int newDriveIndex() {
        return ++driveIndex;
    }

    @Nonnegative
    public int newNetworkIndex() {
        return ++networkIndex;
    }

    @Nonnegative
    public int newNetworkBootIndex() {
        return ++networkBootIndex;
    }

    /**
     * Returns a comma-separated list of new PCI addresses.
     *
     * @param count How many addresses to return.
     * @param separator The separator to use between addresses.
     * @return A separated String of new PCI addresses.
     */
    @Nonnull
    public String newPciAddresses(@Nonnegative int count, @Nonnull String separator) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i > 0)
                buf.append(separator);
            buf.append(newPciAddress());
        }
        return buf.toString();
    }

    /** Returns a new PCI address. */
    @Nonnull
    public String newPciAddress() {
        return "0x" + Integer.toHexString(++pciAddress);
    }
}
