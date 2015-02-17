/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

/**
 *
 * @author shevek
 */
public class QEmuMiscOptions {

    public static final QEmuOption ENABLE_FIPS = new QEmuCustomOption("-enable-fips");
    public static final QEmuOption NO_USER_CONFIG = new QEmuCustomOption("-no-user-config");
    public static final QEmuOption NO_DEFAULTS = new QEmuCustomOption("-nodefaults");
    public static final QEmuOption NO_SHUTDOWN = new QEmuCustomOption("-no-shutdown");
    public static final QEmuOption NO_ACPI = new QEmuCustomOption("-no-acpi");
    public static final QEmuOption NO_REBOOT = new QEmuCustomOption("-no-reboot");
    public static final QEmuOption NO_HPET = new QEmuCustomOption("-no-hpet");

    private QEmuMiscOptions() {
    }
}
