/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import java.net.InetSocketAddress;
import org.anarres.qemu.qapi.api.QueryChardevBackendsCommand;
import org.anarres.qemu.qapi.api.QueryCpusCommand;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 *
 * @author shevek
 */
public class QApiConnectionTest {

    private static final Log LOG = LogFactory.getLog(QApiConnectionTest.class);

    @Test
    public void testConnection() throws Exception {
        QApiConnection connection = new QApiConnection(new InetSocketAddress("localhost", 4444));
        LOG.info("Greeting is " + connection.getGreeting());
        LOG.info("CPUs are " + connection.invoke(new QueryCpusCommand()));
        LOG.info("Chardevs are " + connection.invoke(new QueryChardevBackendsCommand()));
        connection.close();
    }
}