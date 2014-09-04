/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.UndeclaredThrowableException;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
/* pp */ class IOThread extends Thread {

    private static final int EOF = -1;
    private final InputStream input;
    private final OutputStream output;
    private final byte[] buffer = new byte[4096];

    public IOThread(@Nonnull InputStream input, @Nonnull OutputStream output) {
        setDaemon(true);
        this.input = input;
        this.output = output;
    }

    @Override
    public void run() {
        try {
            long count = 0;
            int n = 0;
            while (EOF != (n = input.read(buffer))) {
                output.write(buffer, 0, n);
                count += n;
            }
        } catch (IOException e) {
            throw new UndeclaredThrowableException(e);
        }
    }
}
