/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javax.annotation.Nonnull;

import org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiAnonymousUnionDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiCommandDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiElementDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiEnumDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiEventDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiIncludeDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiStructDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiTypeDescriptor;
import org.anarres.qemu.qapi.generator.model.QApiUnionDescriptor;

/**
 *
 * @author shevek
 */
public class SchemaParser {

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

                // if (jsonTree.get("gen") != null) continue;

                Class<?> type;
                if (jsonTree.get("command") != null)
                    type = QApiCommandDescriptor.class;
                else if (jsonTree.get("struct") != null)
                    type = QApiStructDescriptor.class;
                else if (jsonTree.get("type") != null) {
                    // 'struct' replaces 'type' after QEmu commit 895a2a8.
                    jsonTree.add("struct", jsonTree.remove("type"));
                    type = QApiTypeDescriptor.class;
                } else if (jsonTree.get("enum") != null)
                    type = QApiEnumDescriptor.class;
                else if (jsonTree.get("union") != null)
                    type = QApiUnionDescriptor.class;
                else if (jsonTree.get("alternate") != null)
                    type = QApiAnonymousUnionDescriptor.class;
                else if (jsonTree.get("event") != null)
                    type = QApiEventDescriptor.class;
                else if (jsonTree.get("include") != null)
                    type = QApiIncludeDescriptor.class;
                else if (jsonTree.get("pragma") != null)
                    continue; // ignore pragma sections
                else
                    throw new IllegalArgumentException("Unknown JsonObject " + jsonTree);
                // LOG.info("Tree is " + jsonTree + "; docs are " + state.schemaReader.getDocs());

                TypeAdapter<?> adapter = gson.getAdapter(type);
                Object object;
                try {
                    object = adapter.fromJsonTree(jsonTree);
                } catch (JsonSyntaxException e) {
                    throw new JsonSyntaxException("Failed to parse " + jsonTree, e);
                }
                if (object instanceof QApiIncludeDescriptor) {
                    files.add(new URL(state.file, ((QApiIncludeDescriptor) object).include));
                    continue;
                }

                QApiElementDescriptor element = (QApiElementDescriptor) object;
                // element.docs = state.schemaReader.getDocs();
                element.setModel(model);
                model.elements.put(element.getName(), element);

                if ((element instanceof AbstractQApiTypeDescriptor) && (((AbstractQApiTypeDescriptor) element).base instanceof Map)) {
                    QApiTypeDescriptor parentElement = QApiTypeDescriptor.fromMap(
                            (Map) ((AbstractQApiTypeDescriptor) element).base,
                            element.getName() + "Base");
                    model.elements.put(parentElement.getName(), parentElement);
                }
                // LOG.info("Read specific " + element);
            }

            state.jsonReader.close();
        }

        return model;
    }
}
