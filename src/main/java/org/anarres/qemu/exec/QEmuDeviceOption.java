/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuDeviceOption extends AbstractQEmuOption {

    private final String name;
    private final Map<String, String> properties = new HashMap<String, String>();

    public QEmuDeviceOption(@Nonnull String name) {
        this.name = name;
    }

    @Nonnull
    public QEmuDeviceOption withProperty(@Nonnull String key, @Nonnull String value) {
        properties.put(key, value);
        return this;
    }

    @Nonnull
    public QEmuDeviceOption withProperty(@Nonnull String key) {
        properties.put(key, null);
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder();
        buf.append(name);
        for (Map.Entry<String, String> e : properties.entrySet()) {
            buf.append(",").append(e.getKey());
            Object value = e.getValue();
            if (value != null)
                buf.append('=').append(value);
        }
        add(line, "-device", buf);
    }
}
