/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.util.QEmuCommandLineUtils;
import org.anarres.qemu.qapi.api.QueryUuidCommand;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.anarres.qemu.qapi.common.QApiException;

/**
 *
 * @author shevek
 */
public class QEmuManager {

    private final ConcurrentMap<UUID, QEmuProcess> processes = new ConcurrentHashMap<UUID, QEmuProcess>();

    @Nonnull
    public QEmuProcess execute(QEmuCommandLine commandLine) throws IOException, InterruptedException, QApiException {
        UUID uuid = QEmuCommandLineUtils.getUuid(commandLine);
        InetSocketAddress qmpAddress = QEmuCommandLineUtils.getMonitorAddress(commandLine);

        Process process = commandLine.exec();
        QEmuProcess qEmuProcess = new QEmuProcess(process, qmpAddress);
        QApiConnection connection = qEmuProcess.getConnection(10, TimeUnit.SECONDS);
        // UUID uuid = connection.call(new QueryUuidCommand());
        if (uuid != null)
            processes.put(uuid, qEmuProcess);
        return qEmuProcess;
    }
}
