/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import org.anarres.qemu.exec.QEmuArchitecture;
import org.anarres.qemu.exec.QEmuCommandLine;
import org.anarres.qemu.exec.QEmuQMPOption;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shevek
 */
public class QEmuManagerTest {

    @Test
    public void testManager() throws Exception {
        QEmuManager manager = new QEmuManager();

        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        commandLine.addOptions(new QEmuQMPOption(4445));
        QEmuProcess process = manager.execute(commandLine);
        try {
            Thread.sleep(2000);
            assertNotNull(process.getConnection());
        } finally {
            process.destroy();
        }
    }
}