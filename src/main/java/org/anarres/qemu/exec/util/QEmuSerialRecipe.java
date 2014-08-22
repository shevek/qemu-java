/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import java.util.List;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuOption;
import org.anarres.qemu.exec.host.chardev.CharDevice;

/**
 *
 * @author shevek
 */
public class QEmuSerialRecipe implements QEmuOption {

    public final QEmuChardevOption chardevOption;
    public final QEmuDeviceOption.IsaSerial deviceOption;

    public QEmuSerialRecipe(@Nonnull CharDevice device) {
        int index = 0;
        chardevOption = new QEmuChardevOption(device);
        chardevOption
                .withId("backend-serial-" + index);
        deviceOption = new QEmuDeviceOption.IsaSerial();
        deviceOption
                .withId("serial-" + index)
                .withChardev(chardevOption.id);
    }

    @Override
    public void appendTo(List<? super String> line) {
        chardevOption.appendTo(line);
        deviceOption.appendTo(line);
    }
}
