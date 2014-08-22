/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.io.File;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class FileCharDevice extends AbstractCharDevice {

    private final File file;

    public FileCharDevice(@Nonnull File file) {
        super("file");
        this.file = file;
    }

    public FileCharDevice(@Nonnull String path) {
        this(new File(path));
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        m.put("path", file.getAbsolutePath());
    }

    @Override
    public String toString() {
        return "file:" + file.getAbsolutePath();
    }
}
