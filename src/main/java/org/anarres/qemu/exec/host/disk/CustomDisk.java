/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.disk;

/**
 *
 * @author shevek
 */
public class CustomDisk extends AbstractDisk {

    private final String text;

    public CustomDisk(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
