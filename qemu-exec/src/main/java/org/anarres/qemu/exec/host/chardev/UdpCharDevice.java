/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.net.InetSocketAddress;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class UdpCharDevice extends AbstractCharDevice {

    private final InetSocketAddress remoteAddress;
    private final InetSocketAddress localAddress;

    public UdpCharDevice(@Nonnull InetSocketAddress remoteAddress, @CheckForNull InetSocketAddress localAddress) {
        super("udp");
        this.remoteAddress = remoteAddress;
        this.localAddress = localAddress;
    }

    public UdpCharDevice(@Nonnull InetSocketAddress remoteAddress) {
        this(remoteAddress, null);
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        String remoteHost = remoteAddress.getHostString();
        if (remoteHost != null)
            m.put("host", remoteHost);
        m.put("port", remoteAddress.getPort());
        if (localAddress != null) {
            String localHost = localAddress.getHostString();
            if (localHost != null)
                m.put("localaddr", localHost);
            m.put("localport", localAddress.getPort());
        }
    }

    @Nonnull
    public static String toHostString(@Nonnull InetSocketAddress address) {
        String text = address.getHostString();
        if (text != null)
            return text;
        return "";
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("udp:");
        buf.append(toHostString(remoteAddress))
                .append(':').append(String.valueOf(remoteAddress.getPort()));
        if (localAddress != null) {
            buf.append('@').append(toHostString(localAddress))
                    .append(':').append(String.valueOf(localAddress.getPort()));
        }
        return buf.toString();
    }
}