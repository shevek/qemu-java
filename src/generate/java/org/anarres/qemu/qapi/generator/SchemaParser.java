/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.generator.model.QApiCommandDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiElementDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiEnumDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiIncludeDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiTypeDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiUnionDescriptor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author shevek
 */
public class SchemaParser {

    private static final Log LOG = LogFactory.getLog(SchemaParser.class);
    private final URL file;
    private final Gson gson = new GsonBuilder().create();
    private final JsonParser parser = new JsonParser();

    public SchemaParser(@Nonnull URL file) throws IOException {
        this.file = file;
    }

    @Nonnull
    private JsonReader newReader(@Nonnull URL file) throws IOException {
        InputStream stream = file.openStream();
        Reader reader = new InputStreamReader(stream);
        reader = new SchemaReader(reader);
        JsonReader r = new JsonReader(reader);
        r.setLenient(true);
        return r;
    }

    @Nonnull
    public SchemaModel parse() throws IOException {
        SchemaModel model = new SchemaModel();

        URL file = this.file;
        JsonReader reader = newReader(file);

        Queue<URL> files = new LinkedList<URL>();

        for (;;) {
            JsonToken token = reader.peek();
            // LOG.info("Token is " + token);
            if (token == JsonToken.END_DOCUMENT) {
                reader.close();
                if (!files.isEmpty()) {
                    file = files.remove();
                    reader = newReader(file);
                    continue;
                }
                break;
            }

            JsonObject jsonTree = parser.parse(reader).getAsJsonObject();
            LOG.info("Read generic " + jsonTree);
            Class<?> type;
            if (jsonTree.get("command") != null)
                type = QApiCommandDescriptor.class;
            else if (jsonTree.get("type") != null)
                type = QApiTypeDescriptor.class;
            else if (jsonTree.get("enum") != null)
                type = QApiEnumDescriptor.class;
            else if (jsonTree.get("union") != null)
                type = QApiUnionDescriptor.class;
            else if (jsonTree.get("include") != null)
                type = QApiIncludeDescriptor.class;
            else
                throw new IllegalArgumentException("Unknown JsonObject " + jsonTree);

            TypeAdapter<?> adapter = gson.getAdapter(type);
            Object object = adapter.fromJsonTree(jsonTree);
            if (object instanceof QApiIncludeDescriptor) {
                files.add(new URL(file, ((QApiIncludeDescriptor) object).include));
                continue;
            }

            QApiElementDescriptor element = (QApiElementDescriptor) object;
            model.elements.put(element.getName(), element);
            // LOG.info("Read specific " + element);
        }

        return model;
    }
}
