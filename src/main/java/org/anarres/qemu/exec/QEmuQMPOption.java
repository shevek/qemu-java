/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shevek
 */
public class QEmuQMPOption extends AbstractQEmuOption {

    // private final String host;
    private final int port;

    public QEmuQMPOption(int port) {
        this.port = port;
    }

    @Override
    public void appendTo(List<? super String> line) {
        line.addAll(Arrays.asList("-qmp", "tcp::" + port + ",server"));
    }
}
