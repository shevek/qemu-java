/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.File;
import org.anarres.qemu.exec.QEmuArchitecture;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuCpusOption;
import org.anarres.qemu.exec.QEmuDriveOption;
import org.anarres.qemu.exec.QEmuMemoryOption;
import org.anarres.qemu.exec.QEmuQMPOption;
import org.anarres.qemu.qapi.api.BlockdevAddCommand;
import org.anarres.qemu.qapi.api.BlockdevDriver;
import org.anarres.qemu.qapi.api.BlockdevOptions;
import org.anarres.qemu.qapi.api.BlockdevOptionsFile;
import org.anarres.qemu.qapi.api.InetSocketAddress;
import org.anarres.qemu.qapi.api.NbdServerAddCommand;
import org.anarres.qemu.qapi.api.NbdServerStartCommand;
import org.anarres.qemu.qapi.api.QueryBlockCommand;
import org.anarres.qemu.qapi.api.QueryCommandsCommand;
import org.anarres.qemu.qapi.api.QueryCpusCommand;
import org.anarres.qemu.qapi.api.QueryUuidCommand;
import org.anarres.qemu.qapi.api.SocketAddress;
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
                new QEmuQMPOption(4445),
                new QEmuMemoryOption(64, QEmuMemoryOption.Magnitude.MEGA),
                new QEmuCpusOption(2).withCores(2),
                new QEmuDriveOption(0, new File("/home/shevek/sda.img")));
        LOG.info(commandLine.toString());
        QEmuProcess process = manager.execute(commandLine);
        try {
            QApiConnection connection = process.getConnection();
            assertNotNull(connection);

            LOG.info("Commands are " + connection.call(new QueryCommandsCommand()));
            LOG.info("UUID is " + connection.call(new QueryUuidCommand()));
            LOG.info("CPUs is " + connection.call(new QueryCpusCommand()));
            LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));

            BlockdevOptions options = BlockdevOptions.file(new BlockdevOptionsFile("/home/shevek/sdb.img"));
            options.withId("foo").withReadOnly(true);

            connection.call(new BlockdevAddCommand(options));
            LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));

            // connection.call(new NbdServerStartCommand(new SocketAddress().withInet(new InetSocketAddress().withHost("localhost").withPort("4446"))));
            // connection.call(new NbdServerAddCommand("foo", Boolean.FALSE));

            Thread.sleep(10000);
        } finally {
            process.destroy();
        }
    }
}