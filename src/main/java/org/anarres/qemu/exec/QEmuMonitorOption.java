/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuMonitorOption extends AbstractQEmuOption {

    public static enum Mode {

        readline, control;
    }
    public final String chardev;
    private Mode mode = Mode.control;
    private boolean startup = true;

    public QEmuMonitorOption(@Nonnull String chardev) {
        this.chardev = chardev;
    }

    @Nonnull
    public QEmuMonitorOption withMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    @Nonnull
    public QEmuMonitorOption withStartup(boolean startup) {
        this.startup = startup;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder(chardev);
        appendTo(buf, "mode", mode);
        add(line, "-mon", buf);
        if (!startup)
            add(line, "-S");
    }
}
