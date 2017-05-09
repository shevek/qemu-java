/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuCpusOption;
import org.anarres.qemu.exec.QEmuTestUtils;
import org.anarres.qemu.exec.recipe.QEmuVirtioDriveRecipe;
import org.anarres.qemu.qapi.api.BlockdevAddCommand;
import org.anarres.qemu.qapi.api.BlockdevAioOptions;
import org.anarres.qemu.qapi.api.BlockdevOptions;
import org.anarres.qemu.qapi.api.BlockdevOptionsFile;
import org.anarres.qemu.qapi.api.OnOffAuto;
import org.anarres.qemu.qapi.api.QueryBlockCommand;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.anarres.qemu.qapi.common.QApiException;
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
        File dir = QEmuTestUtils.newTemporaryDirectory();

        QEmuCommandLine commandLine = QEmuTestUtils.newCommandLine();
        commandLine.addOptions(
                new QEmuCpusOption(4).withSockets(2).withCores(2),
                new QEmuVirtioDriveRecipe(0, QEmuTestUtils.newTemporaryDisk(dir, "sda")));
        QEmuProcess process = QEmuTestUtils.newQEmuProcess(commandLine);
        try {
            QApiConnection connection = process.getConnection(10, TimeUnit.SECONDS);
            QEmuTestUtils.inspect(connection);

            try {
                File file = QEmuTestUtils.newTemporaryDiskFile(dir, "sdb");
                BlockdevOptions options = BlockdevOptions.file(
                        new BlockdevOptionsFile(
                                file.getAbsolutePath(),
                                OnOffAuto.auto,
                                BlockdevAioOptions._native));
                options.withReadOnly(true);

                connection.call(new BlockdevAddCommand(options));
                LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));
            } catch (QApiException e) {
                // Perhaps we are running on QEmu 1.0.
                assertTrue(e.getMessage().contains("has not been found"));
                LOG.warn("Limited testing available on QEmu <1.7", e);
            }

            // connection.call(new NbdServerStartCommand(new SocketAddress().withInet(new InetSocketAddress().withHost("localhost").withPort("4446"))));
            // connection.call(new NbdServerAddCommand("foo", Boolean.FALSE));
            Thread.sleep(5000);
        } finally {
            process.destroy();
        }
    }
}
