/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.CaseFormat;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
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
        public boolean optional;

        public String getAnnotations() {
            return annotations;
        }

        public String getTypeName() {
            return typeName;
        }

        public String getTypeNameWrapped() {
            return toWrappedJavaType(getTypeName());
        }

        public String getName() {
            return name;
        }

        public String getCapName() {
            return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, getName());
        }

        public String getUnderscoreName() {
            return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, getName());
        }

        public String getSerializedName() {
            return serializedName;
        }

        public boolean isOptional() {
            return optional;
        }

        @Override
        public String toString() {
            return Objects.toStringHelper(this)
                    .add("typeName", getTypeName())
                    .add("name", getName())
                    .toString();
        }
    }
    public String base;
    /** Value is either string(type) or List<String>(type). */
    public Map<String, Object> data;
    protected List<QApiTypeDescriptor> innerTypes;
    protected List<Field> fields;

    protected boolean preprocess(@Nonnull AbstractQApiTypeDescriptor root) {
        if (fields != null)
            return false;

        innerTypes = new ArrayList<QApiTypeDescriptor>();
        fields = new ArrayList<Field>();

        if (data != null) { // Some Events have no data.
            for (Map.Entry<String, Object> e : data.entrySet()) {
                Field field = new Field();

                field.name = e.getKey();
                if (field.name.startsWith("*")) {
                    field.optional = true;
                    field.name = field.name.substring(1);
                    field.annotations = "@CheckForNull";
                } else if (this instanceof QApiUnionDescriptor) {
                    field.optional = true;
                    field.annotations = "@CheckForNull";
                } else {
                    field.optional = false;
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
                if (field.optional)
                    field.typeName = toWrappedJavaType(field.typeName);

                fields.add(field);
            }
        }

        return true;
    }

    @CheckForNull
    public String getSuperClassName() {
        preprocess(this);
        if (base == null)
            return null;
        return toClassName(base);
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
