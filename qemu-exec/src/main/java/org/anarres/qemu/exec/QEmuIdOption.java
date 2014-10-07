/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import java.util.UUID;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuIdOption extends AbstractQEmuOption {

    private UUID uuid;
    private String name;

    public QEmuIdOption(@CheckForNull UUID uuid, @CheckForNull String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public QEmuIdOption(@CheckForNull String name) {
        this(null, name);
    }

    public QEmuIdOption(@CheckForNull UUID uuid) {
        this(uuid, null);
    }

    public QEmuIdOption() {
    }

    @CheckForNull
    public UUID getUuid() {
        return uuid;
    }

    @Nonnull
    public QEmuIdOption withUuid(@Nonnull UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    @Nonnull
    public QEmuIdOption withName(@Nonnull String name) {
        this.name = name;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        if (uuid != null)
            add(line, "-uuid", uuid);
        if (name != null)
            add(line, "-name", name);
    }
}
