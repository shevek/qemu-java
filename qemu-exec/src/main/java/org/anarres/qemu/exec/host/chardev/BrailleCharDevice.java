/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

/**
 *
 * @author shevek
 */
public class BrailleCharDevice extends AbstractCharDevice {

    public BrailleCharDevice() {
        super("braille");
    }

    @Override
    public String toString() {
        return getName();
    }
}
