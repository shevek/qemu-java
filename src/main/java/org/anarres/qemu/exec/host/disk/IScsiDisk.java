/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.disk;

import java.net.InetAddress;

/**
 *
 * @author shevek
 */
public class IScsiDisk extends AbstractDisk {
// "iscsi://<target-ip>[:<port>]/<target-iqn>/<lun>"

    private final InetAddress address;
    private final int port;
    private final String iqn;
    private final int lun;
    private final String user;
    private final String password;

    public IScsiDisk(InetAddress address, int port, String iqn, int lun, String user, String password) {
        this.address = address;
        this.port = port;
        this.iqn = iqn;
        this.lun = lun;
        this.user = user;
        this.password = password;
    }

    public IScsiDisk(InetAddress address, int port, String iqn, int lun) {
        this(address, port, iqn, lun, null, null);
    }

    public IScsiDisk(InetAddress address, String iqn, int lun) {
        this(address, -1, iqn, lun);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("iscsi://");
        buf.append(address.getHostAddress());
        if (port != -1)
            buf.append(':').append(port);
        buf.append('/').append(iqn);
        buf.append('/').append(lun);
        return buf.toString();
    }
}
