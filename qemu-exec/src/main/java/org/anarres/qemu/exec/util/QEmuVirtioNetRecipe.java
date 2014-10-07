/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuNetdevOption;

/**
 *
 * @author shevek
 */
public class QEmuVirtioNetRecipe extends QEmuOptionsList {

    // tap,fd=27,id=hostnet0,vhost=on,vhostfd=28
    public final QEmuNetdevOption.Tap netdevOption;
    // virtio-net-pci,netdev=hostnet0,id=net0,mac=fa:16:3e:13:ff:1f,bus=pci.0,addr=0x3
    public final QEmuDeviceOption.VirtioNet deviceOption;

    public QEmuVirtioNetRecipe(QEmuIdAllocator allocator) {
        int id = allocator.newNetworkIndex();
        netdevOption = new QEmuNetdevOption.Tap();
        netdevOption
                .withId("backend-net-" + id);
        add(netdevOption);
        deviceOption = new QEmuDeviceOption.VirtioNet();
        deviceOption
                .withId("virtio-net-" + id)
                .withAddress(allocator)
                .withProperty(QEmuDeviceOption.VirtioNet.PROP_NETDEV, netdevOption.id);
        add(deviceOption);
    }

    @Nonnull
    public QEmuVirtioNetRecipe withMac(@Nonnull String mac) {
        deviceOption.withMac(mac);
        return this;
    }

    @Nonnull
    public QEmuVirtioNetRecipe withAddress(@Nonnull String address) {
        deviceOption.withAddress(address);
        return this;
    }

    @Nonnull
    public QEmuVirtioNetRecipe withProperty(@Nonnull String key, @Nonnull String value) {
        deviceOption.withProperty(key, value);
        return this;
    }
}