/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.examples;

import com.google.auto.service.AutoService;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.ByteArrayInputStream;
import java.net.URI;
import org.anarres.qemu.exec.QEmuArchitecture;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuDisplayOption;
import org.anarres.qemu.exec.QEmuMemoryOption;
import org.anarres.qemu.exec.VncDisplay;
import org.anarres.qemu.exec.recipe.QEmuMonitorRecipe;
import org.anarres.qemu.exec.recipe.QEmuPerformanceRecipe;
import org.anarres.qemu.exec.recipe.QEmuVirtioDriveRecipe;
import org.anarres.qemu.image.QEmuImage;
import org.anarres.qemu.manager.QEmuProcess;
import org.anarres.qemu.qapi.api.DeviceDelCommand;
import org.anarres.qemu.qapi.common.QApiConnection;

/**
 *
 * @author shevek
 */
@AutoService(QEmuExample.class)
public class QEmuRAIDExample extends AbstractQEmuExample {

    @Override
    public void invoke(String[] args) throws Exception {
        QEmuImage root = newImage("root", URI.create("http://ubuntu.com/cloud.img"));
        QEmuImage sdb = newImage("sdb", 1, QEmuMemoryOption.Magnitude.GIGA);
        QEmuImage sdc = newImage("sdc", 1, QEmuMemoryOption.Magnitude.GIGA);

        QEmuCommandLine line = new QEmuCommandLine(QEmuArchitecture.x86_64);
        line.addOptions(
                new QEmuPerformanceRecipe(),
                new QEmuMonitorRecipe(4447),
                new QEmuDisplayOption(new VncDisplay.Socket(4)),
                new QEmuVirtioDriveRecipe(line.getAllocator(), root),
                new QEmuVirtioDriveRecipe(line.getAllocator(), sdb),
                new QEmuVirtioDriveRecipe(line.getAllocator(), sdc)
        );

        QEmuProcess process = manager.execute(line);
        QApiConnection connection = process.getConnection();

        JSch jsch = new JSch();
        Session session = jsch.getSession("root", "10.42.43.2");
        session.connect();

        UPLOAD:
        {
            ChannelSftp sftp = (ChannelSftp) session.openChannel("sftp-server");
            sftp.connect();
            sftp.put(new ByteArrayInputStream(new byte[]{}), "/root/script0.sh");
            sftp.put(new ByteArrayInputStream(new byte[]{}), "/root/script1.sh");
            sftp.disconnect();
        }

        SETUP:
        {
            ChannelExec exec = (ChannelExec) session.openChannel("exec");
            exec.setCommand("/root/script0.sh");
            exec.connect();
            exec.disconnect();
        }

        connection.call(new DeviceDelCommand("virtio-disk-2"));

        TEST:
        {
            ChannelExec exec = (ChannelExec) session.openChannel("exec");
            exec.setCommand("/root/script1.sh");
            exec.connect();
            exec.disconnect();
        }

        process.destroy();
    }
}
