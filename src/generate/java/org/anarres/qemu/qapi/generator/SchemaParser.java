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
import org.anarres.qemu.qapi.generator.model.QApiEventDescriptor;
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

    private static class State {

        private final URL file;
        // private final SchemaReader schemaReader;
        private final JsonReader jsonReader;

        public State(@Nonnull URL file) throws IOException {
            this.file = file;
            InputStream stream = file.openStream();
            Reader reader = new InputStreamReader(stream);
            // this.schemaReader = new SchemaReader(reader);
            this.jsonReader = new JsonReader(reader);
            jsonReader.setLenient(true);
        }
    }

    @Nonnull
    public SchemaModel parse() throws IOException {
        SchemaModel model = new SchemaModel();

        Queue<URL> files = new LinkedList<URL>();
        files.add(this.file);

        while (!files.isEmpty()) {
            State state = new State(files.remove());

            for (;;) {
                // state.schemaReader.clearDocs();
                JsonToken token = state.jsonReader.peek();
                // LOG.info("Token is " + token);
                if (token == JsonToken.END_DOCUMENT)
                    break;

                JsonObject jsonTree = parser.parse(state.jsonReader).getAsJsonObject();
                // LOG.info("Read generic " + jsonTree);
                Class<?> type;
                if (jsonTree.get("command") != null)
                    type = QApiCommandDescriptor.class;
                else if (jsonTree.get("type") != null)
                    type = QApiTypeDescriptor.class;
                else if (jsonTree.get("enum") != null)
                    type = QApiEnumDescriptor.class;
                else if (jsonTree.get("union") != null)
                    type = QApiUnionDescriptor.class;
                else if (jsonTree.get("event") != null)
                    type = QApiEventDescriptor.class;
                else if (jsonTree.get("include") != null)
                    type = QApiIncludeDescriptor.class;
                else
                    throw new IllegalArgumentException("Unknown JsonObject " + jsonTree);
                // LOG.info("Tree is " + jsonTree + "; docs are " + state.schemaReader.getDocs());

                TypeAdapter<?> adapter = gson.getAdapter(type);
                Object object = adapter.fromJsonTree(jsonTree);
                if (object instanceof QApiIncludeDescriptor) {
                    files.add(new URL(state.file, ((QApiIncludeDescriptor) object).include));
                    continue;
                }

                QApiElementDescriptor element = (QApiElementDescriptor) object;
                // element.docs = state.schemaReader.getDocs();
                model.elements.put(element.getName(), element);
                // LOG.info("Read specific " + element);
            }

            state.jsonReader.close();
        }

        return model;
    }
}
