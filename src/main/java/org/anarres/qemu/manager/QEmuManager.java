/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuIdOption;
import org.anarres.qemu.exec.QEmuMonitorOption;
import org.anarres.qemu.exec.host.chardev.TcpCharDevice;

/**
 *
 * @author shevek
 */
public class QEmuManager {

    private final Map<UUID, QEmuProcess> processes = new HashMap<UUID, QEmuProcess>();

    @Nonnull
    public QEmuProcess execute(QEmuCommandLine commandLine) throws IOException, InterruptedException {
        // QEmuIdOption idOption = commandLine.getOption(QEmuIdOption.class);
        UUID uuid;
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
        List<String> commandWords = commandLine.toCommandWords();
        ProcessBuilder builder = new ProcessBuilder(commandWords);
        Process process = builder.start();
        QEmuProcess qEmuProcess = new QEmuProcess(process, qmpAddress);
        CONNECT:
        {
            for (int i = 0; i < 20; i++) {
                try {
                    qEmuProcess.getConnection();
                    break CONNECT;
                } catch (ConnectException e) {
                    // Process not started yet.
                    // System.err.println(e);
                }
                Thread.sleep(200);
            }
        }
        return qEmuProcess;
    }
}
