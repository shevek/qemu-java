/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.vm.device;

import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuDisplayOption;
import org.anarres.qemu.exec.QEmuDriveOption;
import org.anarres.qemu.exec.QEmuNetdevOption;
import org.anarres.qemu.exec.QEmuOption;

/**
 * A QEmuDevice is a device frontend visible to the VM on a bus.
 *
 * Many devices are paired with device backends expressed via
 * {@link QEmuDriveOption}, {@link QEmuNetdevOption},
 * {@link QEmuDisplayOption}, etc.
 *
 * This interface is a convenience for documentation and may go away or
 * be replaced.
 *
 * @see QEmuDeviceOption
 * @author shevek
 */
// TODO: Replace this with QEmuDeviceOption?
public interface QEmuDevice extends QEmuOption {

}
