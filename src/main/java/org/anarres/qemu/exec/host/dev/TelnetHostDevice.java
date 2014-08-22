/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

import java.net.InetSocketAddress;

/**
 *
 * @author shevek
 */
public class TelnetHostDevice extends TcpHostDevice {

    public TelnetHostDevice(InetSocketAddress address, boolean server, boolean nowait, boolean nodelay) {
        super(address, server, nowait, nodelay);
    }

    @Override
    protected String getProtocol() {
        return "telnet";
    }
}
