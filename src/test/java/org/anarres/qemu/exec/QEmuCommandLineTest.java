/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 *
 * @author shevek
 */
public class QEmuCommandLineTest {

    private static final Log LOG = LogFactory.getLog(QEmuCommandLineTest.class);

    @Test
    public void testCommandLine() {
        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        commandLine.addOptions(new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA));
        commandLine.addOptions(new QEmuQMPOption(4444));
        commandLine.addOptions(new QEmuDriveOption(0, "/home/shevek/sda.img"));
        commandLine.addOptions(new QEmuDriveOption(1, "/home/shevek/sdb.img").withInterface(QEmuDriveOption.Interface.scsi));
        LOG.info("Command is " + commandLine.toCommandWords());
    }
}