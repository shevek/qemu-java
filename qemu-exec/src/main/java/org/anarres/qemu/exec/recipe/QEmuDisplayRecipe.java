/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.recipe;

import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuDisplayOption;
import org.anarres.qemu.exec.VncDisplay;
import org.anarres.qemu.exec.util.QEmuOptionsList;
import org.anarres.qemu.exec.vm.device.QEmuVgaDevice;

/**
 *
 * @author shevek
 */
@Deprecated // Too specialized to be really useful.
public class QEmuDisplayRecipe extends QEmuOptionsList implements QEmuRecipe {

    public final QEmuDisplayOption displayOption;
    public final QEmuVgaDevice.CirrusPci vgaOption;

    public QEmuDisplayRecipe(@Nonnull VncDisplay display) {
        this.displayOption = new QEmuDisplayOption(display);
        add(displayOption);
        this.vgaOption = new QEmuVgaDevice.CirrusPci();
        add(vgaOption);
    }
}
