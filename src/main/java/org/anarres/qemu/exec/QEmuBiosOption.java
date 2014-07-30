/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.util.List;

/**
 *
 * @author shevek
 */
public class QEmuBiosOption extends AbstractQEmuOption {

    private final File file;

    public QEmuBiosOption(File file) {
        this.file = file;
    }

    public QEmuBiosOption(String path) {
        this(new File(path));
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-bios", file.getAbsolutePath());
    }
}
