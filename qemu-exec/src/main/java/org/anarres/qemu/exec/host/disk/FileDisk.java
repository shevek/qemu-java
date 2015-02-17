/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.disk;

import java.io.File;
import javax.annotation.Nonnull;
import org.anarres.qemu.image.QEmuImage;

/**
 *
 * @author shevek
 */
public class FileDisk extends AbstractDisk {

    private final File file;

    public FileDisk(@Nonnull File file) {
        this.file = file;
    }

    public FileDisk(@Nonnull String path) {
        this(new File(path));
    }

    public FileDisk(@Nonnull QEmuImage image) {
        this(image.getFile());
    }

    @Nonnull
    public File getFile() {
        return file;
    }

    @Override
    public String toString() {
        return file.getAbsolutePath();
    }
}
