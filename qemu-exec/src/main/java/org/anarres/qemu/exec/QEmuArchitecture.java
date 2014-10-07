/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public enum QEmuArchitecture {

    alpha("qemu-system-alpha"),
    arm("qemu-system-arm"),
    cris("qemu-system-cris"),
    i386("qemu-system-i386"),
    lm32("qemu-system-lm32"),
    m68k("qemu-system-m68k"),
    microblaze("qemu-system-microblaze"),
    microblazeel("qemu-system-microblazeel"),
    mips("qemu-system-mips"),
    mips64("qemu-system-mips64"),
    mips64el("qemu-system-mips64el"),
    mipsel("qemu-system-mipsel"),
    moxie("qemu-system-moxie"),
    or32("qemu-system-or32"),
    ppc("qemu-system-ppc"),
    ppc64("qemu-system-ppc64"),
    ppcemb("qemu-system-ppcemb"),
    s390x("qemu-system-s390x"),
    sh4("qemu-system-sh4"),
    sh4eb("qemu-system-sh4eb"),
    sparc("qemu-system-sparc"),
    sparc64("qemu-system-sparc64"),
    unicore32("qemu-system-unicore32"),
    x86_64("qemu-system-x86_64"),
    x86_64_spice("qemu-system-x86_64-spice"),
    xtensa("qemu-system-xtensa"),
    xtensaeb("qemu-system-xtensaeb");
    private final String command;
    /* pp */ QEmuArchitecture(@Nonnull String command) {
        this.command = command;
    }

    @Nonnull
    public String getCommand() {
        return command;
    }
}
