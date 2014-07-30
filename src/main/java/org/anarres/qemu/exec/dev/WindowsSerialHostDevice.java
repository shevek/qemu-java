/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.dev;

/**
 *
 * @author shevek
 */
public class WindowsSerialHostDevice extends AbstractHostDevice {

    private final int index;

    public WindowsSerialHostDevice(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "COM" + index;
    }
}
