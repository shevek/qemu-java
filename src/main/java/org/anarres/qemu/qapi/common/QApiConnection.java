/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import javax.annotation.Nonnull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A connection to a QEmu process.
 *
 * @author shevek
 */
public class QApiConnection implements Closeable {

    private static final Logger LOG = LoggerFactory.getLogger(QApiConnection.class);
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    private final ObjectMapper mapper = new ObjectMapper();
    private final Socket socket;
    private final Writer output;
    private final BufferedReader input;
    private final QApiGreeting greeting;

    public QApiConnection(@Nonnull Socket socket) throws IOException {
        this.socket = socket;
        this.output = new OutputStreamWriter(socket.getOutputStream(), ISO_8859_1);
        this.input = new BufferedReader(new InputStreamReader(socket.getInputStream(), ISO_8859_1));
        this.greeting = read(QApiGreeting.class);
        /* QmpCapabilitiesCommand.Response capabilities = */ invoke(new QmpCapabilitiesCommand());
        // assert !capabilities.isError();
    }

    public QApiConnection(@Nonnull InetSocketAddress address) throws IOException {
        this(new Socket(address.getAddress(), address.getPort()));
    }

    @Nonnull
    public QApiGreeting getGreeting() {
        return greeting;
    }

    @Nonnull
    public QApiGreeting.QEmuVersion getQEmuVersion() {
        return getGreeting().QMP.version.qemu;
    }

    @Nonnull
    private <T> T read(@Nonnull Class<T> type) throws IOException {
        String line = input.readLine();
        if (LOG.isDebugEnabled())
            LOG.debug("<<<" + line);
        return mapper.readValue(line, type);
    }

    @Nonnull
    public <Response extends QApiResponse<?>> Response invoke(@Nonnull QApiCommand<?, Response> command) throws IOException {
        String line = mapper.writeValueAsString(command);
        if (LOG.isDebugEnabled())
            LOG.debug(">>>" + line);
        output.write(line);
        output.write('\n');
        output.flush();
        Class<Response> returnType = command.getReturnType();
        return read(returnType);
    }

    @Nonnull
    public <Result, Response extends QApiResponse<Result>> Result call(@Nonnull QApiCommand<?, Response> command) throws IOException, QApiException {
        return invoke(command).getResult();
    }

    @Override
    public void close() throws IOException {
        socket.close();
    }
}
