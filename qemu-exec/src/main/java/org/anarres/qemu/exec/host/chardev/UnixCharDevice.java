/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.io.File;
import java.util.Map;

/**
 *
 * @author shevek
 */
public class UnixCharDevice extends AbstractSocketCharDevice {

    private final File file;

    public UnixCharDevice(File file, boolean server, boolean nowait) {
        super("socket", server, nowait);
        this.file = file;
    }

    public UnixCharDevice(String file) {
        this(new File(file), true, true);
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        m.put("path", file.getAbsolutePath());
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("unix:");
        buf.append(file.getAbsolutePath());
        if (server)
            buf.append(",server");
        if (nowait)
            buf.append(",nowait");
        return buf.toString();
    }
}
