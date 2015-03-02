/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.util.QEmuCommandLineUtils;
import org.anarres.qemu.qapi.common.QApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class QEmuManager {

    private static final Logger LOG = LoggerFactory.getLogger(QEmuManager.class);
    private final ConcurrentMap<UUID, QEmuProcess> processes = new ConcurrentHashMap<UUID, QEmuProcess>();

    @Nonnull
    public QEmuProcess execute(@Nonnull QEmuCommandLine commandLine) throws IOException, InterruptedException, QApiException {
        UUID uuid = QEmuCommandLineUtils.getUuid(commandLine);
        if (LOG.isDebugEnabled())
            LOG.debug("Executing (uuid=" + uuid + ") " + commandLine);
        InetSocketAddress qmpAddress = QEmuCommandLineUtils.getMonitorAddress(commandLine);

        Process process = commandLine.exec();
        // LOG.debug("Executing (process=" + process + ") " + commandLine);
        QEmuProcess qEmuProcess = new QEmuProcess(process, qmpAddress);
        // QApiConnection connection = qEmuProcess.getConnection(10, TimeUnit.SECONDS);
        // LOG.debug("Executing (connection=" + connection + ") " + commandLine);
        // UUID uuid = connection.call(new QueryUuidCommand());
        if (uuid != null)
            processes.put(uuid, qEmuProcess);
        return qEmuProcess;
    }

    @Nonnull
    public Map<? extends UUID, ? extends QEmuProcess> getProcesses() {
        return processes;
    }

    @CheckForNull
    public QEmuProcess getProcess(UUID id) {
        return processes.get(id);
    }
}
