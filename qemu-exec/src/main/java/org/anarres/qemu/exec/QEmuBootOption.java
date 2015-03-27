/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuBootOption extends AbstractQEmuOption {

    public static enum BootDevice {

        Floppy0("a"),
        Floppy1("b"),
        HardDisk0("c"),
        HardDisk1("d"),
        Network0("n"),
        Network1("o"),
        Network2("p"),
        Network3("q");
        private final String letter;
        /* pp */ BootDevice(String letter) {
            this.letter = letter;
        }
    }

    public final List<BootDevice> bootDevices;
    // once
    @CheckForNull
    public String splashName;
    @CheckForNull
    public Integer splashTime;
    @CheckForNull
    public Boolean menu;
    @CheckForNull
    public Integer rebootTimeout;
    @CheckForNull
    public Boolean strict;

    public QEmuBootOption(List<BootDevice> bootDevices) {
        this.bootDevices = bootDevices;
    }

    public QEmuBootOption(BootDevice... bootDevices) {
        this(Arrays.asList(bootDevices));
    }

    @Nonnull
    public QEmuBootOption withSplash(@Nonnull String splashName, @Nonnegative int splashTime) {
        this.splashName = splashName;
        this.splashTime = splashTime;
        return this;
    }

    @CheckForNull
    private String toString(@CheckForNull Boolean value) {
        if (value == null)
            return null;
        if (value)
            return "on";
        return "off";
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder("order=");
        for (BootDevice bootDevice : bootDevices)
            buf.append(bootDevice.letter);
        appendTo(buf, "splash", splashName);
        appendTo(buf, "splashTime", splashTime);
        appendTo(buf, "strict", toString(menu));
        appendTo(buf, "order", rebootTimeout);
        appendTo(buf, "strict", toString(strict));
        add(line, "-boot", buf);
    }
}
