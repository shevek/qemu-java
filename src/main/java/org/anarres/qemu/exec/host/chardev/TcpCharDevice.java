/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.net.InetSocketAddress;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class TcpCharDevice extends AbstractSocketCharDevice {

    private final InetSocketAddress address;
    public boolean nodelay;

    public TcpCharDevice(@Nonnull InetSocketAddress address, boolean server, boolean nowait) {
        super("tcp", server, nowait);
        this.address = address;
        if (address.getHostString() == null && !server)
            throw new IllegalArgumentException("A client tcp chardev requires a hostname.");
    }

    public TcpCharDevice(InetSocketAddress address) {
        this(address, address.getHostString() == null, false);
    }

    public TcpCharDevice(int port) {
        this(new InetSocketAddress(port), false, false);
    }

    @Nonnull
    public InetSocketAddress getAddress() {
        return address;
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        String host = address.getHostString();
        if (host != null) {
            if (server)
                m.put("host", host);
            else
                m.put("to", host);
        }
        m.put("port", address.getPort());
        if (nodelay)
            m.put("nodelay", null);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("tcp:");
        buf.append(UdpCharDevice.toHostString(address))
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
