/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.manager;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author shevek
 */
public class IOBuffer extends ByteArrayOutputStream {

    private static final int SIZE = 4096;
    private static final int ALLOC = SIZE + SIZE >> 2;
    private byte[] history = new byte[0];

    public IOBuffer() {
        super(ALLOC);
    }

    private void capture() {
        if (count > SIZE - 256) {
            this.history = super.toByteArray();
            super.buf = new byte[ALLOC];
            super.count = 0;
        }
    }

    @Override
    public synchronized void write(byte[] b, int off, int len) {
        super.write(b, off, len);
        capture();
    }

    @Override
    public synchronized void write(int b) {
        super.write(b);
        capture();
    }

    @Override
    public synchronized byte[] toByteArray() {
        byte[] out = new byte[history.length + count];
        System.arraycopy(history, 0, out, 0, history.length);
        System.arraycopy(super.buf, 0, out, history.length, count);
        return out;
    }
}
