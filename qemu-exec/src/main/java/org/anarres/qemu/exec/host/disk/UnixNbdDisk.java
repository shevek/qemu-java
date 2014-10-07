/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.disk;

import java.io.File;

/**
 *
 * @author shevek
 */
public class UnixNbdDisk extends AbstractDisk {

    private final File file;
    private final String name;

    public UnixNbdDisk(File file, String name) {
        this.file = file;
        this.name = name;
    }

    public UnixNbdDisk(String path, String name) {
        this(new File(path), name);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("nbd:unix:").append(file.getAbsolutePath());
        if (name != null)
            buf.append(":exportname=").append(name);
        return buf.toString();
    }
}
