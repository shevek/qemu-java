/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Longs;
import java.util.Optional;
import org.anarres.qemu.qapi.generator.SchemaModel;

import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class QApiElementDescriptor {

    protected SchemaModel model;

    @Nonnull
    protected static String toJavaType(@Nonnull String jsonType) {
        if ("str".equals(jsonType))
            return String.class.getName();
        if ("int".equals(jsonType))
            return Long.TYPE.getName();
        if ("int8".equals(jsonType))
            return Byte.TYPE.getName();
        if ("uint8".equals(jsonType))
            return Character.TYPE.getName();
        if ("int16".equals(jsonType))
            return Short.TYPE.getName();
        if ("uint16".equals(jsonType))
            return Integer.TYPE.getName();
        if ("int32".equals(jsonType))
            return Integer.TYPE.getName();
        if ("uint32".equals(jsonType))
            return Long.TYPE.getName();
        if ("int64".equals(jsonType))
            return Long.TYPE.getName();
        if ("uint64".equals(jsonType))
            return Long.TYPE.getName();
        if ("bool".equals(jsonType))
            return Boolean.TYPE.getName();
        if ("number".equals(jsonType))
            return Double.TYPE.getName();
        if ("size".equals(jsonType))
            return Long.TYPE.getName();
        if ("null".equals(jsonType))
            return Optional.class.getName();
        // Obsolete as of qemu commit d708cdbe8792a55f53e90c1c787e871d527e8d4b?
        if ("dict".equals(jsonType))
            return "java.util.Map<String, String>";
        // Obsolete as of qemu commit d708cdbe8792a55f53e90c1c787e871d527e8d4b?
        if ("visitor".equals(jsonType))
            return Object.class.getName(); // + " /* visitor */";
        // All these should have 'gen' : false
        if ("**".equals(jsonType))
            return Object.class.getName(); // + " /* ARGH. */";
        // Something after 2015-September
        if ("any".equals(jsonType))
            return Object.class.getName(); // + " /* ARGH. */";
        return jsonType;
    }

    @Nonnull
    protected static String toWrappedJavaType(@CheckForNull String name) {
        if (name == null)
            return Void.class.getName();
        if ("byte".equals(name))
            return Byte.class.getName();
        if ("short".equals(name))
            return Short.class.getName();
        if ("int".equals(name))
            return Integer.class.getName();
        if ("long".equals(name))
            return Long.class.getName();
        if ("void".equals(name))
            return Void.class.getName();
        if ("boolean".equals(name))
            return Boolean.class.getName();
        return name;
    }

    @Nonnull
    protected static String toNestedJavaType(@CheckForNull Object jsonType) {
        if (jsonType == null)
            return "void";
        if (jsonType instanceof List) {
            String inner = toNestedJavaType(Iterables.getOnlyElement((Iterable<?>) jsonType));
            return "java.util.List<" + toWrappedJavaType(inner) + ">";
        }
        return toJavaType((String) jsonType);
    }

    @Nonnull
    protected static String toJavaEnumName(@Nonnull String name) {
        name = name.replace('.', '_');
        name = name.replace('-', '_');
        return toJavaNonReservedWord(name);
    }

    @Nonnull
    protected static String toJavaNonReservedWord(@Nonnull String name) {
        if ("boolean".equals(name))
            return "_boolean";
        if ("class".equals(name))
            return "_class";
        if ("package".equals(name))
            return "_package";
        if ("default".equals(name))
            return "_default";
        if ("abstract".equals(name))
            return "_abstract";
        if ("native".equals(name))
            return "_native";
        if ("null".equals(name))
            return "_null";
        if ("implements".equals(name))
            return "_implements";
        if ("case".equals(name))
            return "_case";
        if ("int".equals(name))
            return "_int";
        if ("enum".equals(name))
            return "_enum";
        if ("static".equals(name))
            return "_static";
        // QKeyCode has an enum with ints in it.
        if (Longs.tryParse(name) != null)
            return "VAL_" + name;
        // Now there's QCryptoCipherAlgorithm 3des
        if (Character.isDigit(name.charAt(0)))
            return "_" + name;
        return name;
    }

    @Nonnull
    protected static String toJavaName(@Nonnull String name) {
        // Some type has both 'PC' and 'pc'.
        if ("PC".equals(name))
            return name;
        name = name.replace('-', '_');
        name = name.replace('-', '_');
        name = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name);
        return toJavaNonReservedWord(name);
    }

    @Nonnull
    public abstract String getName();

    protected static String toClassName(String name) {
        name = name.replace('-', '_');
        name = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        name = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);
        return name;
    }

    @Nonnull
    public String getClassName() {
        return toClassName(getName());
    }

    @Nonnull
    public abstract String getTemplateName();

    public void setModel(SchemaModel model) {
        this.model = model;
    }

}
