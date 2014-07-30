/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.dev;

import java.io.File;

/**
 *
 * @author shevek
 */
public class UnixHostDevice extends AbstractHostDevice {

    private final File file;
    private boolean server;
    private boolean nowait;

    public UnixHostDevice(File file, boolean server, boolean nowait) {
        this.file = file;
        this.server = server;
        this.nowait = nowait;
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
