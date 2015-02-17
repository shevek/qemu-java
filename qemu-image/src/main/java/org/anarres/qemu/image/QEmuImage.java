/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.image;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.IOException;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuImage {

    private final File file;

    public QEmuImage(@Nonnull File file) {
        this.file = Preconditions.checkNotNull(file);
    }

    public QEmuImage(@Nonnull String path) {
        this(new File(path));
    }

    @Nonnull
    public File getFile() {
        return file;
    }

    @Nonnull
    public QEmuImageInfo query() throws IOException {
        ProcessBuilder builder = new ProcessBuilder("qemu-img", "info", "--output=json", file.getAbsolutePath());
        Process process = builder.start();
        byte[] data = ByteStreams.toByteArray(process.getInputStream());
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(data, QEmuImageInfo.class);
    }

    public void create(@Nonnull QEmuImageFormat format, long size) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("qemu-img", "create", "-f", format.name(), file.getAbsolutePath(), String.valueOf(size));
        Process process = builder.start();
        ByteStreams.copy(process.getInputStream(), System.err);
    }

    /**
     * Creates this image.
     *
     * backingFile is not referenced absolutely here. If you want it referenced
     * absolutely, canonicalize with {@link File#getAbsoluteFile()}.
     */
    public void create(@Nonnull QEmuImageFormat format, @Nonnull File backingFile) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("qemu-img", "create", "-f", format.name(), "-b", backingFile.getPath(), file.getAbsolutePath());
        Process process = builder.start();
        ByteStreams.copy(process.getInputStream(), System.err);
    }

    public void delete() throws IOException {
        if (file.exists())
            if (!file.delete())
                throw new IOException("Unable to delete " + file);
    }
}
