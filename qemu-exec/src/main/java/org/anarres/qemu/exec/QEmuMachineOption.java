/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuMachineOption extends AbstractQEmuOption {

    public static enum Acceleration {

        kvm, tcg, xen;
    }
    // accel=kvm:tcg :xen
    public QEmuMachine type;
    public List<Acceleration> acceleration;

    public QEmuMachineOption(@CheckForNull QEmuMachine type) {
        this.type = type;
    }

    public QEmuMachineOption() {
    }

    @Nonnull
    public QEmuMachineOption withType(QEmuMachine type) {
        this.type = type;
        return this;
    }

    @Nonnull
    public QEmuMachineOption withAcceleration(List<Acceleration> acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    @Nonnull
    public QEmuMachineOption withAcceleration(@Nonnull Acceleration... acceleration) {
        return withAcceleration(Arrays.asList(acceleration));
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder();
        appendTo(buf, "type", type);
        appendTo(buf, "accel", join(":", acceleration));
        add(line, "-machine", buf);
    }
}
