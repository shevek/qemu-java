/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.api.VersionInfo;
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

    public QApiConnection(@Nonnull InetAddress address, @Nonnegative int port) throws IOException {
        this(new Socket(address, port));
    }

    public QApiConnection(@Nonnull String address, @Nonnegative int port) throws IOException {
        this(InetAddress.getByName(address), port);
    }

    public QApiConnection(@Nonnull InetSocketAddress address) throws IOException {
        this(address.getAddress(), address.getPort());
    }

    @Nonnull
    public QApiGreeting getGreeting() {
        return greeting;
    }

    @Nonnull
    public VersionInfo getQEmuVersion() {
        return getGreeting().QMP.version;
    }

    @Nonnull
    private <T> T read(@Nonnull Class<T> type) throws IOException {
        for (;;) {
            String line = input.readLine();
            if (line == null)
                throw new EOFException();
            if (LOG.isDebugEnabled())
                LOG.debug("<<<" + line);
            JsonNode tree = mapper.readTree(line);
            if (tree.get("event") != null)  // Could parse a QApiEvent.
                continue;
            return mapper.treeToValue(tree, type);
        }
        // return mapper.readValue(line, type);
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
