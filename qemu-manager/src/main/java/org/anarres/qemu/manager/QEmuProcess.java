/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.UnknownServiceException;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.api.QuitCommand;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.anarres.qemu.qapi.common.QApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class QEmuProcess {

    private static final Logger LOG = LoggerFactory.getLogger(QEmuProcess.class);
    private final Process process;
    private final InetSocketAddress monitor;
    private QApiConnection connection;
    private final Object lock = new Object();
    private final IOBuffer stdout = new IOBuffer();
    private final IOBuffer stderr = new IOBuffer();

    public QEmuProcess(@Nonnull Process process, @CheckForNull InetSocketAddress monitor) {
        this.process = process;
        this.monitor = monitor;

        // new IOThread(process.getInputStream(), stdout).start();
        // new IOThread(process.getErrorStream(), stderr).start();
    }

    /**
     * @throws NoRouteToHostException if the process is terminated.
     * @throws UnknownServiceException if the process has no known monitor address. 
     */
    @Nonnull
    public QApiConnection getConnection() throws IOException {
        if (monitor == null)
            throw new UnknownServiceException("No monitor address known.");

        try {
            int exitValue = process.exitValue();
            throw new NoRouteToHostException("Process terminated with exit code " + exitValue);
        } catch (IllegalThreadStateException e) {
        }

        synchronized (lock) {
            if (connection != null)
                return connection;
            connection = new QApiConnection(monitor);
            return connection;
        }
    }

    @Nonnull
    public QApiConnection getConnection(long timeout, @Nonnull TimeUnit unit) throws IOException, InterruptedException {
        long end = System.currentTimeMillis() + unit.toMillis(timeout);
        while (end > System.currentTimeMillis()) {
            try {
                return getConnection();
            } catch (ConnectException e) {
                LOG.warn("Failed to connect to " + this + ": " + e);
            }

            long delay = Math.min(500, end - System.currentTimeMillis());
            Thread.sleep(delay);
        }

        return getConnection(); // This last call blows our timing out of the window. :-(
    }

    public void destroy() throws IOException, QApiException {
        try {
            QApiConnection c = getConnection();
            if (c != null) {
                c.call(new QuitCommand());
                c.close();
            }
        } catch (IllegalStateException e) {
            LOG.warn("Cannot connect to " + this, e);
        } catch (IOException e) {
            LOG.warn("Cannot connect to " + this, e);
        }
        process.destroy();
    }

    @Override
    public String toString() {
        return "stdout=" + stdout + "; stderr=" + stderr;
    }
}
