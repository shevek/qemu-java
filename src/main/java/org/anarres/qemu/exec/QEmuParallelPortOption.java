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
public class QEmuParallelPortOption extends AbstractQEmuOption {

    private final HostDevice device;

    public QEmuParallelPortOption(HostDevice device) {
        this.device = device;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-parallel", device);
    }
}
