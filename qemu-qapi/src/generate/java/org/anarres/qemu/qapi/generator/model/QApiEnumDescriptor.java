/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QApiEnumDescriptor extends QApiElementDescriptor {

    public static class Field {

        public String name;
        public String serializedName;

        public String getName() {
            return name;
        }

        public String getSerializedName() {
            return serializedName;
        }
    }
    @SerializedName("enum")
    public String name;
    public List<String> data;
    private List<Field> fields;

    @Override
    public String getName() {
        return name;
    }

    private void preprocess() {
        if (fields != null)
            return;

        fields = new ArrayList<Field>();
        for (String value : data) {
            Field field = new Field();
            field.serializedName = value;
            field.name = toJavaEnumName(value);
            fields.add(field);
        }
    }

    @Nonnull
    public List<Field> getFields() {
        preprocess();
        return fields;
    }

    @Override
    public String getTemplateName() {
        return "enum";
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", getName())
                .add("data", data)
                .add("fields", fields)
                .toString();
    }
}
