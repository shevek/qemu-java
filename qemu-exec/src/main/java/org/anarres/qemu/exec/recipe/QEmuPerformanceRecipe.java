/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.recipe;

import org.anarres.qemu.exec.QEmuCustomOption;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuMachineOption;
import org.anarres.qemu.exec.util.QEmuOptionsList;

/**
 * Generic performance options for QEmu.
 *
 * @author shevek
 */
public class QEmuPerformanceRecipe extends QEmuOptionsList {

    public QEmuPerformanceRecipe() {
        add(new QEmuMachineOption().withAcceleration(QEmuMachineOption.Acceleration.kvm, QEmuMachineOption.Acceleration.tcg));
        add(new QEmuDeviceOption.VirtioBalloon());
        // add(new QEmuCustomOption("-global", "virtio-blk-pci.scsi=off"));
    }
}
