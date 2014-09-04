/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class TcpCharDevice extends AbstractSocketCharDevice {

    private static boolean isAnyLocalAddress(@Nonnull InetSocketAddress address) {
        if (address.getHostString() == null)
            return true;
        InetAddress addr = address.getAddress();
        if (addr == null)
            return true;
        if (addr.isAnyLocalAddress())
            return true;
        return false;
    }
    private final InetSocketAddress address;
    public int to = -1;
    public boolean nodelay;

    public TcpCharDevice(@Nonnull InetSocketAddress address, boolean server, boolean nowait) {
        super("socket", server, nowait);
        this.address = address;
        if (address.getHostString() == null && !server)
            throw new IllegalArgumentException("A client tcp chardev requires a hostname.");
    }

    public TcpCharDevice(InetSocketAddress address) {
        this(address, isAnyLocalAddress(address), false);
    }

    public TcpCharDevice(int port) {
        this(new InetSocketAddress(port));
    }

    @Nonnull
    public InetSocketAddress getAddress() {
        return address;
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        m.put("host", address.getHostString());
        m.put("port", address.getPort());
        if (to >= 0)
            m.put("to", to);
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
