/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.dev.HostDevice;
import org.anarres.qemu.exec.dev.TcpHostDevice;

/**
 *
 * @author shevek
 */
public class QEmuQMPOption extends AbstractQEmuOption {

    private final HostDevice device;
    private boolean wait;

    public QEmuQMPOption(@Nonnull HostDevice device) {
        this.device = device;
    }

    public QEmuQMPOption(int port) {
        this(new TcpHostDevice(port).withServer(true));
    }

    @Nonnull
    public HostDevice getDevice() {
        return device;
    }

    /** Do not start CPU at startup (you must type 'c' in the monitor). */
    @Nonnull
    public QEmuQMPOption withWait(boolean wait) {
        this.wait = wait;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-qmp", device);
        if (wait)
            add(line, "-S");
    }
}
