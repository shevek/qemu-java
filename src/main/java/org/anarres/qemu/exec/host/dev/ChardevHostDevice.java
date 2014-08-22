/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

/**
 *
 * @author shevek
 */
public class ChardevHostDevice extends AbstractHostDevice {

    private final String id;

    public ChardevHostDevice(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "chardev:" + id;
    }
}
