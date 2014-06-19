/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * A connection to a QEmu process.
 *
 * @author shevek
 */
public class QApiConnection implements Closeable {

    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    private final Gson gson = new GsonBuilder().create();
    private final Socket socket;
    private final Writer output;
    private final Reader input;
    private final QApiGreeting greeting;

    public QApiConnection(@Nonnull Socket socket) throws IOException {
        this.socket = socket;
        this.output = new OutputStreamWriter(socket.getOutputStream(), ISO_8859_1);
        this.input = new InputStreamReader(socket.getInputStream(), ISO_8859_1);
        this.greeting = gson.fromJson(input, QApiGreeting.class);
    }

    public QApiConnection(@Nonnull InetSocketAddress address) throws IOException {
        this(new Socket(address.getAddress(), address.getPort()));
    }

    @Nonnull
    public QApiGreeting getGreeting() {
        return greeting;
    }

    @CheckForNull
    public <Argument, Response> Response invoke(@Nonnull QApiCommand<Argument, Response> command) {
        gson.toJson(command, output);
        Type returnType = command.getReturnType();
        if (returnType == Void.class)
            return null;
        return gson.fromJson(input, returnType);
    }

    @Override
    public void close() throws IOException {
        socket.close();
    }
}
