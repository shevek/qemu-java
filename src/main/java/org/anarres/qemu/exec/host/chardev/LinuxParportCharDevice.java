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
public class LinuxParportCharDevice extends AbstractCharDevice {

    private final int index;

    public LinuxParportCharDevice(int index) {
        super("parallel");
        this.index = index;
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        m.put("path", "/dev/parport" + index);
    }

    @Override
    public String toString() {
        return "/dev/parport" + index;
    }
}
