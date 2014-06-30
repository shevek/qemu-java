/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class QApiElementDescriptor {

    @Nonnull
    protected static String toJavaType(@Nonnull String jsonType) {
        if ("str".equals(jsonType))
            return String.class.getSimpleName();
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
        if ("dict".equals(jsonType))
            return "Map<String, String>";
        if ("visitor".equals(jsonType))
            return Object.class.getSimpleName(); // + " /* visitor */";
        if ("**".equals(jsonType))
            return Object.class.getSimpleName(); // + " /* ARGH. */";
        return jsonType;
    }

    @Nonnull
    protected static String toWrappedJavaType(@CheckForNull String name) {
        if (name == null)
            return Void.class.getSimpleName();
        if ("int".equals(name))
            return Integer.class.getSimpleName();
        else if ("long".equals(name))
            return Long.class.getSimpleName();
        else if ("void".equals(name))
            return Void.class.getSimpleName();
        return name;
    }

    @Nonnull
    protected static String toNestedJavaType(@CheckForNull Object jsonType) {
        if (jsonType == null)
            return "void";
        if (jsonType instanceof List) {
            String inner = toNestedJavaType(Iterables.getOnlyElement((Iterable<?>) jsonType));
            return "List<" + toWrappedJavaType(inner) + ">";
        }
        return toJavaType((String) jsonType);
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
        // QKeyCode has an enum with ints in it.
        if (Longs.tryParse(name) != null)
            return "VAL_" + name;
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

    @Nonnull
    public String getClassName() {
        String name = getName().replace('-', '_');
        name = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);
    }

    @Nonnull
    public abstract String getTemplateName();
}
