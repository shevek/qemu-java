/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;

/**
 *
 * @author shevek
 */
public class QEmuMachineOption extends AbstractQEmuOption {

    private final QEmuMachine machine;

    public QEmuMachineOption(QEmuMachine machine) {
        this.machine = machine;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-M", machine);
    }
}
