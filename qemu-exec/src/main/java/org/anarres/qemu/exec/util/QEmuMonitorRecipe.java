/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuMonitorOption;
import org.anarres.qemu.exec.host.chardev.CharDevice;
import org.anarres.qemu.exec.host.chardev.TcpCharDevice;

/**
 *
 * @author shevek
 */
public class QEmuMonitorRecipe extends QEmuOptionsList {

    public final QEmuChardevOption chardevOption;
    public final QEmuMonitorOption monitorOption;

    public QEmuMonitorRecipe(@Nonnull CharDevice device) {
        int index = 0;
        chardevOption = new QEmuChardevOption(device);
        chardevOption
                .withId("monitor-" + index);
        add(chardevOption);
        monitorOption = new QEmuMonitorOption(chardevOption.id);
        add(monitorOption);
    }

    public QEmuMonitorRecipe(int port) {
        this(new TcpCharDevice(port));
    }
}