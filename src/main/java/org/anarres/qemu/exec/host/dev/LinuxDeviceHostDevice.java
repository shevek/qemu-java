/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

import java.io.File;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class LinuxDeviceHostDevice extends AbstractHostDevice {

    private final File file;

    /** TODO: Must start with "/dev" */
    public LinuxDeviceHostDevice(@Nonnull File file) {
        this.file = file;
    }

    public LinuxDeviceHostDevice(@Nonnull String path) {
        this(new File(path));
    }

    @Override
    public String toString() {
        return file.getAbsolutePath();
    }
}
