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
public class FileDisk extends AbstractDisk {

    private final File file;

    public FileDisk(File file) {
        this.file = file;
    }

    public FileDisk(String path) {
        this(new File(path));
    }

    @Override
    public String toString() {
        return file.getAbsolutePath();
    }
}
