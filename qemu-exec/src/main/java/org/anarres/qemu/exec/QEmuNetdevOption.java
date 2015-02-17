/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.recipe.QEmuVirtioNetRecipe;

/**
 * A network device backend, usually paired with a {@link QEmuDeviceOption} frontend.
 *
 * If you are looking for the equivalent of "-net nic,...", it is a frontend
 * specification now performed using -device.
 *
 * @see QEmuVirtioNetRecipe
 * @see QEmuDeviceOption
 * @author shevek
 */
public class QEmuNetdevOption extends AbstractQEmuOption {

    // tap,fd=29,id=hostnet1,vhost=on,vhostfd=30
    private final String name;
    public String id;
    private final Map<String, String> properties = new HashMap<String, String>();

    public QEmuNetdevOption(@Nonnull String name) {
        this.name = name;
    }

    @Nonnull
    public QEmuNetdevOption withId(@Nonnull String id) {
        this.id = id;
        return this;
    }

    @Nonnull
    public QEmuNetdevOption withProperties(@Nonnull Map<String, String> properties) {
        this.properties.putAll(properties);
        return this;
    }

    @Nonnull
    public QEmuNetdevOption withProperty(@Nonnull String key, @Nonnull String value) {
        properties.put(key, value);
        return this;
    }

    @Nonnull
    public QEmuNetdevOption withProperty(@Nonnull String key) {
        properties.put(key, null);
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder(name);
        appendTo(buf, "id", Preconditions.checkNotNull(id, "No id specified in -netdev"));
        appendTo(buf, properties);
        add(line, "-netdev", buf);
    }

    public static class User extends QEmuNetdevOption {

        public User() {
            super("user");
        }
    }

    public static class Tap extends QEmuNetdevOption {

        public static final String PROP_IFNAME = "ifname";

        public Tap() {
            super("tap");
        }

        @Nonnull
        public Tap withTapInterface(@Nonnull String ifname) {
            withProperty(PROP_IFNAME, ifname);
            return this;
        }
    }

    public static class Bridge extends QEmuNetdevOption {

        public Bridge() {
            super("bridge");
        }
    }

    public static class Socket extends QEmuNetdevOption {

        public Socket() {
            super("socket");
        }
    }

    public static class Hubport extends QEmuNetdevOption {

        public Hubport() {
            super("hubport");
        }
    }

    public static class Dump extends QEmuNetdevOption {

        public Dump() {
            super("dump");
        }
    }

    public static class None extends QEmuNetdevOption {

        public None() {
            super("none");
        }
    }

}
