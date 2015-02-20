/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.host.disk.FileDisk;
import org.anarres.qemu.exec.recipe.QEmuMonitorRecipe;
import org.anarres.qemu.exec.util.QEmuCommandLineUtils;
import org.anarres.qemu.manager.QEmuProcess;
import org.anarres.qemu.qapi.api.HumanMonitorCommandCommand;
import org.anarres.qemu.qapi.api.QueryBlockCommand;
import org.anarres.qemu.qapi.api.QueryCommandsCommand;
import org.anarres.qemu.qapi.api.QueryCpusCommand;
import org.anarres.qemu.qapi.api.QueryUuidCommand;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.anarres.qemu.qapi.common.QApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author shevek
 */
public class QEmuTestUtils {

    private static final Logger LOG = LoggerFactory.getLogger(QEmuTestUtils.class);

    @Nonnull
    public static File newTemporaryDirectory() throws IOException {
        File buildDir = new File("build");
        if (buildDir.isDirectory())
            return new File(buildDir, "tmp/test");
        return File.createTempFile("qemu-test", ".tmp");
    }

    @Nonnull
    public static File newTemporaryDiskFile(@Nonnull File dir, @Nonnull String name) throws IOException {
        File disk = new File(dir, name);
        disk.getParentFile().mkdirs();
        RandomAccessFile raf = new RandomAccessFile(disk, "rw");
        raf.setLength(1024 * 1024 * 1024L);
        raf.close();
        return disk;
    }

    @Nonnull
    public static FileDisk newTemporaryDisk(@Nonnull File dir, @Nonnull String name) throws IOException {
        return new FileDisk(newTemporaryDiskFile(dir, name));
    }

    @Nonnull
    public static QEmuCommandLine newCommandLine() {
        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        commandLine.addOptions(
                // QEmuMiscOptions.ENABLE_KVM,
                new QEmuMachineOption().withAcceleration(QEmuMachineOption.Acceleration.kvm, QEmuMachineOption.Acceleration.tcg),
                new QEmuDeviceOption.VirtioBalloon(),
                new QEmuMonitorRecipe(4445),
                new QEmuMemoryOption(64, QEmuMemoryOption.Magnitude.MEGA),
                // new QEmuCpusOption(4).withSockets(2).withCores(2),
                // new QEmuVirtioDriveRecipe(0, new FileDisk("/home/shevek/sda.img")),
                // new QEmuDisplayOption(QEmuDisplayOption.DisplayType.vnc).withVncDisplay(new VncDisplay.Socket(1)));
                new QEmuDisplayOption(QEmuDisplayOption.DisplayType.nographic));
        return commandLine;
    }

    @Nonnull
    public static QEmuProcess newQEmuProcess(QEmuCommandLine commandLine) throws IOException {
        LOG.info("Invoking " + commandLine);
        Process process = commandLine.exec();
        return new QEmuProcess(process, QEmuCommandLineUtils.getMonitorAddress(commandLine));
    }

    public static void inspect(@Nonnull QApiConnection connection) throws IOException, QApiException {
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
    }

    private QEmuTestUtils() {
    }
}
