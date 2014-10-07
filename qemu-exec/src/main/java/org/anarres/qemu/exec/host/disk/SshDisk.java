/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.disk;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.host.chardev.UdpCharDevice;

/**
 *
 * @author shevek
 */
public class SshDisk extends AbstractDisk {

    public static final int DEFAULT_PORT = 22;
    private final InetSocketAddress address;
    private final String user;
    private final String path;

    public SshDisk(@Nonnull InetSocketAddress address, @CheckForNull String user, @Nonnull String path) {
        this.address = address;
        this.user = user;
        this.path = path;
    }

    public SshDisk(@Nonnull InetAddress address, @CheckForNull String user, @Nonnull String path) {
        this(new InetSocketAddress(address, DEFAULT_PORT), user, path);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("ssh://");
        if (user != null)
            buf.append(user).append("@");
        buf.append(UdpCharDevice.toHostString(address));
        if (address.getPort() > 0 || DEFAULT_PORT != address.getPort())
            buf.append(':').append(address.getPort());
        buf.append(path);
        return buf.toString();
    }
}
