/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import java.net.InetSocketAddress;
import org.anarres.qemu.exec.disk.IScsiDisk;
import org.anarres.qemu.qapi.api.BlockdevAddCommand;
import org.anarres.qemu.qapi.api.BlockdevOptions;
import org.anarres.qemu.qapi.api.BlockdevOptionsFile;
import org.anarres.qemu.qapi.api.BlockdevOptionsGenericFormat;
import org.anarres.qemu.qapi.api.BlockdevRef;
import org.anarres.qemu.qapi.api.QueryBlockCommand;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
@Ignore
public class QApiBlockdevTest {

    private static final Logger LOG = LoggerFactory.getLogger(QApiBlockdevTest.class);

    @Test
    public void testConnection() throws Exception {

        // {
        // BlockdevOptions rawOptions = BlockdevOptions.raw(new BlockdevOptionsGenericFormat(BlockdevRef.reference("asdf")));
        // rawOptions.withDriver(BlockdevDriver.raw).withId("bar");
        // String text = QApiTestUtils.toJson(new BlockdevAddCommand(rawOptions));
        // LOG.info("Text = " + text);
        // }

        {
            BlockdevOptions fileOptions = BlockdevOptions.file(new BlockdevOptionsFile("/home/shevek/sdb.img"));

            BlockdevOptions rawOptions = BlockdevOptions.raw(new BlockdevOptionsGenericFormat(BlockdevRef.definition(fileOptions)));
            rawOptions.withId("bar");
            // String text = QApiTestUtils.toJson(new BlockdevAddCommand(rawOptions));
            // LOG.info("Text = " + text);

            QApiConnection connection = new QApiConnection(new InetSocketAddress("localhost", 4444));
            connection.call(new BlockdevAddCommand(rawOptions));
            LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));

            {
                IScsiDisk disk = new IScsiDisk(null, 1234, "myiqn", 0);
                // new BlockdevOptionsGenericFormat
            }
        }
    }
}
