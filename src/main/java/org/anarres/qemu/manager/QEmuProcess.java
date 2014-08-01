/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.InetSocketAddress;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.QApiConnection;

/**
 *
 * @author shevek
 */
public class QEmuProcess {

    private final Process process;
    private final InetSocketAddress monitor;
    private QApiConnection connection;
    private final Object lock = new Object();

    public QEmuProcess(@Nonnull Process process, @CheckForNull InetSocketAddress monitor) {
        this.process = process;
        this.monitor = monitor;
    }

    @CheckForNull
    public QApiConnection getConnection() throws IOException {
        synchronized (lock) {
            if (monitor == null)
                return null;
            if (connection != null)
                return connection;
            connection = new QApiConnection(monitor);
            return connection;
        }
    }

    public void destroy() {
        process.destroy();
    }
}
