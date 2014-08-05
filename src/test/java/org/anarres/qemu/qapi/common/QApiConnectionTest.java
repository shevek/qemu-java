/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import java.net.InetSocketAddress;
import org.anarres.qemu.qapi.api.DumpGuestMemoryCommand;
import org.anarres.qemu.qapi.api.DumpGuestMemoryFormat;
import org.anarres.qemu.qapi.api.QueryChardevBackendsCommand;
import org.anarres.qemu.qapi.api.QueryCpusCommand;
import org.anarres.qemu.qapi.api.QueryDumpGuestMemoryCapabilityCommand;
import org.anarres.qemu.qapi.api.QueryEventsCommand;
import org.anarres.qemu.qapi.api.QueryMigrateCapabilitiesCommand;
import org.anarres.qemu.qapi.api.QueryStatusCommand;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class QApiConnectionTest {

    private static final Logger LOG = LoggerFactory.getLogger(QApiConnectionTest.class);

    @Test
    public void testConnection() throws Exception {
        QApiConnection connection = new QApiConnection(new InetSocketAddress("localhost", 4444));
        LOG.info("Greeting is " + connection.getGreeting());
        LOG.info("Status is " + connection.call(new QueryStatusCommand()));
        LOG.info("CPUs are " + connection.call(new QueryCpusCommand()));
        LOG.info("Chardevs are " + connection.call(new QueryChardevBackendsCommand()));
        LOG.info("Events are " + connection.call(new QueryEventsCommand()));
        LOG.info("DumpMemory is " + connection.call(new QueryDumpGuestMemoryCapabilityCommand()));
        LOG.info("MigrateCapabilities is " + connection.call(new QueryMigrateCapabilitiesCommand()));

        // new MigrateCommand(null);
        if (false) {
            DumpGuestMemoryCommand.Arguments arguments = new DumpGuestMemoryCommand.Arguments();
            arguments.format = DumpGuestMemoryFormat.kdump_snappy;
            arguments.begin = 0L;
            arguments.paging = false;
            arguments.protocol = "foo";
            connection.call(new DumpGuestMemoryCommand(arguments));
        }

        // connection.call(new NbdServerStartCommand(SocketAddress.inet(new InetSocketAddress("localhost", 4445))));
        // connection.call(new NbdServerAddCommand("/dev/vda", false));

        connection.close();
    }
}