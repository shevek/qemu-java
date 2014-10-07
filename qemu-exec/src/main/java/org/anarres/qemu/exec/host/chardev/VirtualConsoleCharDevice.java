/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.util.Map;

/**
 *
 * @author shevek
 */
public class VirtualConsoleCharDevice extends AbstractCharDevice {

    private final Integer width;
    private final Integer height;
    private final boolean chars;

    public VirtualConsoleCharDevice(int width, int height, boolean chars) {
        super("vc");
        this.width = width;
        this.height = height;
        this.chars = chars;
    }

    public VirtualConsoleCharDevice(int width, int height) {
        this(width, height, true);
    }

    public VirtualConsoleCharDevice() {
        super("vc");
        this.width = null;
        this.height = null;
        this.chars = false;
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        if (width == null || height == null)
            return;
        if (chars) {
            m.put("cols", width);
            m.put("rows", height);
        } else {
            m.put("width", width);
            m.put("height", height);
        }
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
