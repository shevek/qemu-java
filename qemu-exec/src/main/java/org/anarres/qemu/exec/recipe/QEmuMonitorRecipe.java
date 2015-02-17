/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.recipe;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuMonitorOption;
import org.anarres.qemu.exec.host.chardev.CharDevice;
import org.anarres.qemu.exec.host.chardev.TcpCharDevice;
import org.anarres.qemu.exec.util.QEmuOptionsList;

/**
 * A recipe for creating a QEmu monitor speaking the QApi protocol.
 *
 * @author shevek
 */
public class QEmuMonitorRecipe extends QEmuOptionsList implements QEmuRecipe {

    public final QEmuChardevOption chardevOption;
    public final QEmuMonitorOption monitorOption;

    /** Creates a QEmuMonitor on a given {@link CharDevice}. */
    public QEmuMonitorRecipe(@Nonnull CharDevice device) {
        int index = 0;
        chardevOption = new QEmuChardevOption(device);
        chardevOption
                .withId("monitor-" + index);
        add(chardevOption);
        monitorOption = new QEmuMonitorOption(chardevOption);
        add(monitorOption);
    }

    /** Creates a QEmuMonitor on a given TCP port. */
    public QEmuMonitorRecipe(@Nonnegative int port) {
        this(new TcpCharDevice(port));
    }
}
