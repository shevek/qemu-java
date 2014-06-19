/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class AbstractQApiTypeDescriptor extends QApiElementDescriptor {

    public static class Field {

        public String annotations;
        public String typeName;
        public String name;
        public String serializedName;

        public String getAnnotations() {
            return annotations;
        }

        public String getTypeName() {
            return typeName;
        }

        public String getName() {
            return name;
        }

        public String getSerializedName() {
            return serializedName;
        }
    }
    /** Value is either string(type) or List<String>(type). */
    public Map<String, Object> data;
    protected List<QApiTypeDescriptor> innerTypes;
    protected List<Field> fields;

    protected void preprocess(@Nonnull AbstractQApiTypeDescriptor root) {
        if (fields != null)
            return;

        innerTypes = new ArrayList<QApiTypeDescriptor>();
        fields = new ArrayList<Field>();

        for (Map.Entry<String, Object> e : data.entrySet()) {
            Field field = new Field();
            field.name = e.getKey();
            if (field.name.startsWith("*")) {
                field.name = field.name.substring(1);
                field.annotations = "@CheckForNull";
            } else {
                field.annotations = "@Nonnull";
            }
            field.serializedName = field.name;
            field.name = toJavaName(field.name);

            if (e.getValue() instanceof Map) {
                QApiTypeDescriptor type = new QApiTypeDescriptor();
                type.name = "_T" + e.getKey();
                type.data = (Map<String, Object>) e.getValue();
                type.preprocess(root);
                root.innerTypes.add(type);

                field.typeName = type.name;
            } else {
                field.typeName = toNestedJavaType(e.getValue());
            }

            fields.add(field);
        }
    }

    @Nonnull
    public List<QApiTypeDescriptor> getInnerTypes() {
        preprocess(this);
        return innerTypes;
    }

    @Nonnull
    public List<Field> getFields() {
        preprocess(this);
        return fields;
    }
}
