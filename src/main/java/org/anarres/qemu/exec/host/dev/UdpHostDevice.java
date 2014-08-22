/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.dev;

import java.net.InetSocketAddress;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class UdpHostDevice extends AbstractHostDevice {

    private final InetSocketAddress remoteAddress;
    private final InetSocketAddress localAddress;

    public UdpHostDevice(@Nonnull InetSocketAddress remoteAddress, @CheckForNull InetSocketAddress localAddress) {
        this.remoteAddress = remoteAddress;
        this.localAddress = localAddress;
    }

    public UdpHostDevice(@Nonnull InetSocketAddress remoteAddress) {
        this(remoteAddress, null);
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