/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class AbstractQEmuOption implements QEmuOption {

    protected static void appendTo(@Nonnull StringBuilder buf, @Nonnull String key, @CheckForNull Object value) {
        if (value == null)
            return;
        if (buf.length() > 0)
            buf.append(",");
        buf.append(key).append("=").append(value);
    }

    /** Allows use of ImmutableMap.of() patterns. */
    protected static void appendTo(@Nonnull StringBuilder buf, @Nonnull Map<? extends String, ? extends Object> values) {
        for (Map.Entry<? extends String, ? extends Object> e : values.entrySet()) {
            if (buf.length() > 0)
                buf.append(",");
            buf.append(e.getKey());
            Object value = e.getValue();
            if (value != null)
                buf.append('=').append(value);
        }
    }

    @CheckForNull
    protected static CharSequence join(@Nonnull String sep, @CheckForNull Iterable<?> values) {
        if (values == null)
            return null;
        StringBuilder buf = new StringBuilder();
        int i = 0;
        for (Object value: values) {
            if (i++ > 0)
                buf.append(sep);
            buf.append(value);
        }
        return buf;
    }

    protected static void add(@Nonnull List<? super String> line, @Nonnull Object... words) {
        for (Object word : words)
            line.add(word.toString());  // Deliberate NPE if word is null.
    }
}
