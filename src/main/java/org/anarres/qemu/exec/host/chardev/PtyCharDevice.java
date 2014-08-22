/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

/**
 *
 * @author shevek
 */
public class PtyCharDevice extends AbstractCharDevice {

    public PtyCharDevice() {
        super("pty");
    }

    @Override
    public String toString() {
        return "pty";
    }
}
