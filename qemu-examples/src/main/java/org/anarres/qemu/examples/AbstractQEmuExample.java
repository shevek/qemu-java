/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.examples;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.Closeables;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuMemoryOption;
import org.anarres.qemu.image.QEmuImage;
import org.anarres.qemu.image.QEmuImageFormat;
import org.anarres.qemu.manager.QEmuManager;

/**
 *
 * @author shevek
 */
public abstract class AbstractQEmuExample implements QEmuExample {

    protected final QEmuManager manager = new QEmuManager();

    @Nonnull
    protected QEmuImage newImage(@Nonnull String name) throws IOException {
        File dir = new File("build/images/local");
        dir.mkdirs();
        return new QEmuImage(new File(dir, getClass().getSimpleName() + "-" + name));
    }

    @Nonnull
    protected QEmuImage newImage(@Nonnull String name, @Nonnegative long size, @Nonnull QEmuMemoryOption.Magnitude magnitude) throws IOException {
        QEmuImageFormat format = QEmuImageFormat.qcow2;
        QEmuImage image = newImage(name + "." + format);
        image.create(format, magnitude.toUnit(size));
        return image;
    }

    @Nonnull
    private File download(@Nonnull URI source) throws IOException {
        File dir = new File("build/images/downloaded");
        HashCode hash = Hashing.md5().hashString(source.toString(), Charsets.UTF_8);
        File file = new File(dir, hash.toString());
        if (!file.exists()) {
            InputStream in = source.toURL().openStream();
            try {
                Files.asByteSink(file).writeFrom(in);
            } finally {
                Closeables.close(in, false);
            }
        }
        return file;
    }

    @Nonnull
    protected QEmuImage newImage(@Nonnull String name, @Nonnull URI source) throws IOException {
        QEmuImageFormat format = QEmuImageFormat.qcow2;
        QEmuImage image = newImage(name + "." + format);

        File file = download(source);
        image.create(QEmuImageFormat.qcow2, file);
        return image;
    }

}
