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
public class NamedPipeCharDevice extends AbstractCharDevice {

    private final File file;

    public NamedPipeCharDevice(@Nonnull File file) {
        super("pipe");
        this.file = file;
    }

    public NamedPipeCharDevice(@Nonnull String path) {
        this(new File(path));
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        m.put("path", file.getAbsolutePath());
    }

    @Override
    public String toString() {
        return "pipe:" + file.getAbsolutePath();
    }
}
