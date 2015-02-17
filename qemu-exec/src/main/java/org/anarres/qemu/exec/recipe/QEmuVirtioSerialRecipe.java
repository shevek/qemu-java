/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.recipe;

import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuChardevOption;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.host.chardev.CharDevice;
import org.anarres.qemu.exec.util.QEmuOptionsList;

/**
 *
 * @see QEmuChardevOption
 * @see QEmuDeviceOption.VirtioSerial
 * @author shevek
 */
public class QEmuVirtioSerialRecipe extends QEmuOptionsList implements QEmuRecipe {

    public final QEmuChardevOption chardevOption;
    public final QEmuDeviceOption.VirtioSerial deviceOption;

    // See: http://wiki.qemu.org/Features/QAPI/GuestAgent
    // name=org.qemu.guest_agent.0
    public QEmuVirtioSerialRecipe(@Nonnull CharDevice device) {
        int index = 0;
        chardevOption = new QEmuChardevOption(device);
        chardevOption
                .withId("backend-serial-" + index);
        add(chardevOption);
        deviceOption = new QEmuDeviceOption.VirtioSerial();
        deviceOption
                .withId("serial-" + index)
                .withChardev(chardevOption);
        add(deviceOption);
    }
}
