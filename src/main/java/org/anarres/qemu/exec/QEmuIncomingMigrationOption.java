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
public class QEmuIncomingMigrationOption extends AbstractQEmuOption {

    private final int port;

    public QEmuIncomingMigrationOption(int port) {
        this.port = port;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-incoming", port);
    }
}
