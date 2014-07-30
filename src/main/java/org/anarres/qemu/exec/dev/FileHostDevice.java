/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.dev;

import java.io.File;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class FileHostDevice extends AbstractHostDevice {

    private final File file;

    public FileHostDevice(@Nonnull File file) {
        this.file = file;
    }

    public FileHostDevice(@Nonnull String path) {
        this(new File(path));
    }

    @Override
    public String toString() {
        return "file:" + file.getAbsolutePath();
    }
}
