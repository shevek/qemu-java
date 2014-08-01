/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.dev;

import java.net.InetSocketAddress;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class TcpHostDevice extends AbstractHostDevice {

    private final InetSocketAddress address;
    private boolean server;
    private boolean nowait;
    private boolean nodelay;

    public TcpHostDevice(@Nonnull InetSocketAddress address, boolean server, boolean nowait, boolean nodelay) {
        this.address = address;
        this.server = server;
        this.nowait = nowait;
        this.nodelay = nodelay;
    }

    public TcpHostDevice(InetSocketAddress address) {
        this(address, address.getHostString() == null, false, false);
    }

    public TcpHostDevice(int port) {
        this(new InetSocketAddress(port), false, false, false);
    }

    @Nonnull
    public InetSocketAddress getAddress() {
        return address;
    }

    @Nonnull
    public TcpHostDevice withServer(boolean server) {
        this.server = server;
        return this;
    }

    protected String getProtocol() {
        return "tcp";
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(getProtocol());
        buf.append(':');
        buf.append(UdpHostDevice.toHostString(address))
                .append(':').append(String.valueOf(address.getPort()));
        if (server)
            buf.append(",server");
        if (nowait)
            buf.append(",nowait");
        if (nodelay)
            buf.append(",nodelay");
        return buf.toString();
    }
}
