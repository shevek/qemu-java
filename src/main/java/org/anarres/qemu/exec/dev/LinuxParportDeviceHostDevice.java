/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.dev;

/**
 *
 * @author shevek
 */
public class LinuxParportDeviceHostDevice extends AbstractHostDevice {

    private final int index;

    public LinuxParportDeviceHostDevice(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "/dev/parport" + index;
    }
}
