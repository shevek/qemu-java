/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class SchemaReader extends FilterReader {

    private static enum State {

        BOL, EMIT, SKIP;
    }
    private State state = State.BOL;

    public SchemaReader(@Nonnull Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        for (;;) {
            int c = super.read();
            if (c == -1)
                return -1;
            switch (state) {
                case BOL:
                    if (c == '#') {
                        state = State.SKIP;
                        continue;
                    }
                    // LOG.info(Character.toString((char) c));
                    return c;
                case EMIT:
                    if (c == '\n')
                        state = State.BOL;
                    // LOG.info(Character.toString((char) c));
                    return c;
                case SKIP:
                    if (c == '\n')
                        state = State.BOL;
                    continue;
            }
        }
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            int c = read();
            if (c == -1)
                return i > 0 ? i : -1;
            cbuf[off + i] = (char) c;
        }
        return len;
    }
}