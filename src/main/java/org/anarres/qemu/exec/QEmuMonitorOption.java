/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import org.anarres.qemu.exec.dev.HostDevice;

/**
 *
 * @author shevek
 */
public class QEmuMonitorOption extends AbstractQEmuOption {

    private final HostDevice device;

    public QEmuMonitorOption(HostDevice device) {
        this.device = device;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-monitor", device);
    }
}
