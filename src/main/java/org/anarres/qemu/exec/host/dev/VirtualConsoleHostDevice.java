/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

/**
 *
 * @author shevek
 */
public class VirtualConsoleHostDevice extends AbstractHostDevice {

    private final Integer width;
    private final Integer height;
    private final boolean chars;

    public VirtualConsoleHostDevice(int width, int height, boolean chars) {
        this.width = width;
        this.height = height;
        this.chars = chars;
    }

    public VirtualConsoleHostDevice(int width, int height) {
        this(width, height, false);
    }

    public VirtualConsoleHostDevice() {
        this.width = null;
        this.height = null;
        this.chars = false;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("vc");
        if (width != null) {
            buf.append(':').append(String.valueOf(width));
            if (chars)
                buf.append('C');
            buf.append('x').append(String.valueOf(height));
            if (chars)
                buf.append('C');
        }
        return buf.toString();
    }
}
