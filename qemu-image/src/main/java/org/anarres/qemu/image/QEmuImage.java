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
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 * An abstraction around a QEmu image.
 * <p>
 * The underlying image file may or may not exist; this class allows for
 * simple creation, inspection and deletion.
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

    /**
     * @return the file underlying this QEmuImage.
     */
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

    /**
     * Creates this image.
     *
     * @param format The image format for the new image.
     * @param size The virtual size of the new image.
     */
    public void create(@Nonnull QEmuImageFormat format, @Nonnegative long size) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("qemu-img", "create", "-f", format.name(), file.getAbsolutePath(), String.valueOf(size));
        Process process = builder.start();
        ByteStreams.copy(process.getInputStream(), System.err);
    }

    /**
     * Creates this image.
     * <p>
     * The size of the new image is derived from the existing backing file.
     * <p>
     * backingFile is referenced by a relative path. If you want it referenced
     * absolutely, canonicalize the argument with {@link File#getAbsoluteFile()}
     * before calling this method.
     *
     * @param format      The image format for the new image.
     * @param backingFile The backing file for the new image.
     */
    public void create(@Nonnull QEmuImageFormat format, @Nonnull File backingFile) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("qemu-img", "create", "-f", format.name(), "-b", backingFile.getPath(), file.getAbsolutePath());
        Process process = builder.start();
        ByteStreams.copy(process.getInputStream(), System.err);
    }

    /**
     * Deletes the file underlying this image, if it exists.
     */
    public void delete() throws IOException {
        if (file.exists())
            if (!file.delete())
                throw new IOException("Unable to delete " + file);
    }
}
