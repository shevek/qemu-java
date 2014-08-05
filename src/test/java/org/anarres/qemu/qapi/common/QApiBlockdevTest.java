/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.InetSocketAddress;
import org.anarres.qemu.qapi.api.BlockdevAddCommand;
import org.anarres.qemu.qapi.api.BlockdevDriver;
import org.anarres.qemu.qapi.api.BlockdevOptions;
import org.anarres.qemu.qapi.api.BlockdevOptionsFile;
import org.anarres.qemu.qapi.api.BlockdevOptionsGenericFormat;
import org.anarres.qemu.qapi.api.BlockdevRef;
import org.anarres.qemu.qapi.api.QueryBlockCommand;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class QApiBlockdevTest {

    private static final Logger LOG = LoggerFactory.getLogger(QApiBlockdevTest.class);

    @Test
    public void testConnection() throws Exception {
        BlockdevOptions fileOptions = BlockdevOptions.file(new BlockdevOptionsFile("/home/shevek/sdb.img"));
        fileOptions.withDriver(BlockdevDriver.file).withId("foo");

        {
            BlockdevOptions rawOptions = BlockdevOptions.raw(new BlockdevOptionsGenericFormat(BlockdevRef.reference("asdf")));
            rawOptions.withDriver(BlockdevDriver.raw).withId("bar");
            BlockdevAddCommand command = new BlockdevAddCommand(rawOptions);
            String text = QApiTestUtils.toJson(command);
            LOG.info("Text = " + text);
        }

        {
            BlockdevOptions rawOptions = BlockdevOptions.raw(new BlockdevOptionsGenericFormat(BlockdevRef.definition(fileOptions)));
            rawOptions.withDriver(BlockdevDriver.raw).withId("bar");
            BlockdevAddCommand command = new BlockdevAddCommand(rawOptions);
            String text = QApiTestUtils.toJson(command);
            LOG.info("Text = " + text);
        }

        // LOG.info("Text = " + QApiTestUtils.fromJson(text, BlockdevAddCommand.class));

        // QApiConnection connection = new QApiConnection(new InetSocketAddress("localhost", 4444));
        // connection.call(new BlockdevAddCommand(options));
        // LOG.info("Blocks is " + connection.call(new QueryBlockCommand()));
    }
}
