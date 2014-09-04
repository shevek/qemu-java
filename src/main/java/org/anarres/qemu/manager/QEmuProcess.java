/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.InetSocketAddress;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.api.QuitCommand;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.anarres.qemu.qapi.common.QApiException;

/**
 *
 * @author shevek
 */
public class QEmuProcess {

    private final Process process;
    private final InetSocketAddress monitor;
    private QApiConnection connection;
    private final Object lock = new Object();
    private final IOBuffer stdout = new IOBuffer();
    private final IOBuffer stderr = new IOBuffer();

    public QEmuProcess(@Nonnull Process process, @CheckForNull InetSocketAddress monitor) {
        this.process = process;
        this.monitor = monitor;

        new IOThread(process.getInputStream(), stdout).start();
        new IOThread(process.getErrorStream(), stderr).start();
    }

    @CheckForNull
    public QApiConnection getConnection() throws IOException {
        synchronized (lock) {
            if (monitor == null)
                throw new IllegalStateException("No monitor address known.");
            if (connection != null)
                return connection;
            connection = new QApiConnection(monitor);
            return connection;
        }
    }

    public void destroy() throws IOException, QApiException {
        try {
            QApiConnection c = getConnection();
            if (c != null) {
                c.call(new QuitCommand());
                c.close();
            }
        } catch (IOException e) {
        }
        process.destroy();
    }

    @Override
    public String toString() {
        return "stdout=" + stdout + "; stderr=" + stderr;
    }
}
