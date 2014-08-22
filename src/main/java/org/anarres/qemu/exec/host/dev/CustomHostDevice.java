/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

/**
 *
 * @author shevek
 */
public class CustomHostDevice extends AbstractHostDevice {

    private final String text;

    public CustomHostDevice(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
