/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import java.util.List;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuMonitorOption;
import org.anarres.qemu.exec.QEmuOption;
import org.anarres.qemu.exec.host.chardev.CharDevice;
import org.anarres.qemu.exec.host.chardev.TcpCharDevice;

/**
 *
 * @author shevek
 */
public class QEmuMonitorRecipe implements QEmuOption {

    public final QEmuChardevOption chardevOption;
    public final QEmuMonitorOption monitorOption;

    public QEmuMonitorRecipe(@Nonnull CharDevice device) {
        int index = 0;
        chardevOption = new QEmuChardevOption(device);
        chardevOption
                .withId("monitor-" + index);
        monitorOption = new QEmuMonitorOption(chardevOption.id);
    }

    public QEmuMonitorRecipe(int port) {
        this(new TcpCharDevice(port));
    }

    @Override
    public void appendTo(List<? super String> line) {
        chardevOption.appendTo(line);
        monitorOption.appendTo(line);
    }
}
