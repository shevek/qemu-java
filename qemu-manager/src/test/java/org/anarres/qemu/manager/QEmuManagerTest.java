/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import org.anarres.qemu.exec.QEmuArchitecture;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuCpusOption;
import org.anarres.qemu.exec.QEmuDisplayOption;
import org.anarres.qemu.exec.QEmuMemoryOption;
import org.anarres.qemu.exec.QEmuMiscOptions;
import org.anarres.qemu.exec.VncDisplay;
import org.anarres.qemu.exec.host.disk.FileDisk;
import org.anarres.qemu.exec.util.QEmuMonitorRecipe;
import org.anarres.qemu.exec.util.QEmuVirtioDriveRecipe;
import org.anarres.qemu.qapi.api.BlockdevAddCommand;
import org.anarres.qemu.qapi.api.BlockdevOptions;
import org.anarres.qemu.qapi.api.BlockdevOptionsFile;
import org.anarres.qemu.qapi.api.HumanMonitorCommandCommand;
import org.anarres.qemu.qapi.api.QueryBlockCommand;
import org.anarres.qemu.qapi.api.QueryCommandsCommand;
import org.anarres.qemu.qapi.api.QueryCpusCommand;
import org.anarres.qemu.qapi.api.QueryUuidCommand;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

/**
 *
 * @author shevek
 */
public class QEmuManagerTest {

    private static final Logger LOG = LoggerFactory.getLogger(QEmuManagerTest.class);

    @Test
    public void testManager() throws Exception {
        QEmuManager manager = new QEmuManager();

        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        commandLine.addOptions(
                QEmuMiscOptions.ENABLE_KVM,
                new QEmuMonitorRecipe(4445),
                new QEmuMemoryOption(64, QEmuMemoryOption.Magnitude.MEGA),
                new QEmuCpusOption(4).withSockets(2).withCores(2),
                // new QEmuVirtioDriveRecipe(0, new FileDisk("/home/shevek/sda.img")),
                // new QEmuDisplayOption(QEmuDisplayOption.DisplayType.vnc).withVncDisplay(new VncDisplay.Socket(1)));
                new QEmuDisplayOption(QEmuDisplayOption.DisplayType.nographic));
        LOG.info(commandLine.toString());
        QEmuProcess process = manager.execute(commandLine);
        try {
            QApiConnection connection = process.getConnection();
            assertNotNull("Failed to connect to QEmu.", connection);

            LOG.info("Commands are " + connection.call(new QueryCommandsCommand()));
            LOG.info("UUID is " + connection.call(new QueryUuidCommand()));
            LOG.info("CPUs is " + connection.call(new QueryCpusCommand()));
            LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info status", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info qtree", null)));
            // LOG.info(connection.call(new HumanMonitorCommandCommand("info qdm", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info usb", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info numa", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info cpus", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info pic", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info pci", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info tlb", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info kvm", null)));
            LOG.info(connection.call(new HumanMonitorCommandCommand("info jit", null)));

            BlockdevOptions options = BlockdevOptions.file(new BlockdevOptionsFile("/home/shevek/sdb.img"));
            options.withId("foo").withReadOnly(true);

            connection.call(new BlockdevAddCommand(options));
            LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));

            // connection.call(new NbdServerStartCommand(new SocketAddress().withInet(new InetSocketAddress().withHost("localhost").withPort("4446"))));
            // connection.call(new NbdServerAddCommand("foo", Boolean.FALSE));

            Thread.sleep(5000);
        } finally {
            process.destroy();
        }
    }
}