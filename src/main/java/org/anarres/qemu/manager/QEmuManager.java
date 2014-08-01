/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuIdOption;
import org.anarres.qemu.exec.QEmuMonitorOption;
import org.anarres.qemu.exec.QEmuQMPOption;
import org.anarres.qemu.exec.dev.HostDevice;
import org.anarres.qemu.exec.dev.TcpHostDevice;

/**
 *
 * @author shevek
 */
public class QEmuManager {

    private final Map<UUID, QEmuProcess> processes = new HashMap<UUID, QEmuProcess>();

    @Nonnull
    public QEmuProcess execute(QEmuCommandLine commandLine) throws IOException {
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
            QEmuQMPOption qmpOption = commandLine.getOption(QEmuQMPOption.class);
            if (qmpOption == null)
                break QMP;
            HostDevice qmpDevice = qmpOption.getDevice();
            if (!(qmpDevice instanceof TcpHostDevice))
                break QMP;
            TcpHostDevice tcpDevice = (TcpHostDevice) qmpDevice;
            qmpAddress = tcpDevice.getAddress();
        }
        List<String> commandWords = commandLine.toCommandWords();
        System.out.println(commandWords);
        ProcessBuilder builder = new ProcessBuilder(commandWords);
        Process process = builder.start();
        QEmuProcess qEmuProcess = new QEmuProcess(process, qmpAddress);
        qEmuProcess.getConnection();
        return qEmuProcess;
    }
}
