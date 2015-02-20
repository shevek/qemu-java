/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.scratch;

import java.net.InetSocketAddress;
import org.anarres.qemu.exec.QEmuTestUtils;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author shevek
 */
public class ScratchTest {

    @Ignore
    @Test
    public void testScratch() throws Exception {
        InetSocketAddress address = new InetSocketAddress("localhost", 4444);
        QApiConnection connection = new QApiConnection(address);
        QEmuTestUtils.inspect(connection);
    }
}
