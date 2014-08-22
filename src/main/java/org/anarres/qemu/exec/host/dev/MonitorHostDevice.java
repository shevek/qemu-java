/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

/**
 *
 * @author shevek
 */
public class MonitorHostDevice extends AbstractHostDevice {

    private final HostDevice delegate;

    public MonitorHostDevice(HostDevice delegate) {
        this.delegate = delegate;
    }

    @Override
    public String toString() {
        return "mon:" + delegate;
    }
}
