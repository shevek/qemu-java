/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.host.chardev.CharDevice;

/**
 *
 * @author shevek
 */
public class QEmuChardevOption extends AbstractQEmuOption {

    public String id;
    public CharDevice device;

    public QEmuChardevOption(@Nonnull CharDevice device) {
        this.device = device;
    }

    @Nonnull
    public QEmuChardevOption withId(@Nonnull String id) {
        this.id = id;
        return this;
    }

    @Nonnull
    public QEmuChardevOption withDevice(@Nonnull CharDevice device) {
        this.device = device;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder(device.getName());
        appendTo(buf, "id", id);
        appendTo(buf, device.getProperties());
        add(line, "-chardev", buf);
    }
}
