/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.host.dev.HostDevice;

/**
 *
 * @author shevek
 */
public class QEmuMonitorOption extends AbstractQEmuOption {

    private final HostDevice device;
    private boolean startup = true;

    public QEmuMonitorOption(@Nonnull HostDevice device) {
        this.device = device;
    }

    @Nonnull
    public QEmuMonitorOption withStartup(boolean startup) {
        this.startup = startup;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-monitor", device);
        if (!startup)
            add(line, "-S");
    }
}
