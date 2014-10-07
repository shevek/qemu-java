/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuIdOption;
import org.anarres.qemu.exec.QEmuMonitorOption;
import org.anarres.qemu.exec.host.chardev.TcpCharDevice;
import org.anarres.qemu.qapi.common.QApiException;

/**
 *
 * @author shevek
 */
public class QEmuManager {

    private final ConcurrentMap<UUID, QEmuProcess> processes = new ConcurrentHashMap<UUID, QEmuProcess>();

    @Nonnull
    public QEmuProcess execute(QEmuCommandLine commandLine) throws IOException, InterruptedException, QApiException {

        UUID uuid = null;
        UUID:
        {
            QEmuIdOption idOption = commandLine.getOption(QEmuIdOption.class);
            if (idOption == null)
                break UUID;
            uuid = idOption.getUuid();
        }

        InetSocketAddress qmpAddress = null;
        QMP:
        {
            QEmuMonitorOption monitorOption = commandLine.getOption(QEmuMonitorOption.class);
            if (monitorOption == null)
                break QMP;
            String monitorChardev = monitorOption.chardev;
            for (QEmuChardevOption chardevOption : commandLine.getOptions(QEmuChardevOption.class)) {
                if (chardevOption.id.equals(monitorChardev)) {
                    if (chardevOption.device instanceof TcpCharDevice) {
                        TcpCharDevice tcpDevice = (TcpCharDevice) chardevOption.device;
                        qmpAddress = tcpDevice.getAddress();
                    }
                }
            }
        }

        Process process = commandLine.exec();
        QEmuProcess qEmuProcess = new QEmuProcess(process, qmpAddress);
        if (uuid != null)
            processes.put(uuid, qEmuProcess);

        CONNECT:
        {
            for (int i = 0; i < 20; i++) {
                try {
                    int exitValue = process.exitValue();
                    throw new QApiException("Process terminated early with exit code " + exitValue + "; output is " + qEmuProcess.toString());
                } catch (IllegalThreadStateException e) {
                }
                try {
                    qEmuProcess.getConnection();
                    break CONNECT;
                } catch (ConnectException e) {
                    // Process not started yet.
                    // System.err.println(e);
                }
                Thread.sleep(500);
            }
        }
        return qEmuProcess;
    }
}
