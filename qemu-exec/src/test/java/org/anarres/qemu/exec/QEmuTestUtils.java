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
import org.anarres.qemu.exec.util.QEmuCommandLineUtils;
import org.anarres.qemu.exec.util.QEmuMonitorRecipe;
import org.anarres.qemu.manager.QEmuProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
