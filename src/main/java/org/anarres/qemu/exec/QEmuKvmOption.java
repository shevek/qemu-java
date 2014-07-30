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
public class QEmuKvmOption extends AbstractQEmuOption {

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-enable-kvm");
    }
}
