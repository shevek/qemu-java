/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.recipe;

import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuNetdevOption;
import org.anarres.qemu.exec.util.QEmuIdAllocator;
import org.anarres.qemu.exec.util.QEmuOptionsList;

/**
 *
 * @author shevek
 */
public class QEmuVirtioNetRecipe extends QEmuOptionsList implements QEmuRecipe {

    // tap,fd=27,id=hostnet0,vhost=on,vhostfd=28
    public final QEmuNetdevOption.Tap netdevOption;
    // virtio-net-pci,netdev=hostnet0,id=net0,mac=fa:16:3e:13:ff:1f,bus=pci.0,addr=0x3
    public final QEmuDeviceOption.VirtioNet deviceOption;

    /**
     * Call new QEmuVirtioNetRecipe(line.getAllocator(), "tap0");
     *
     * @param allocator
     * @param ifname
     */
    public QEmuVirtioNetRecipe(@Nonnull QEmuIdAllocator allocator, @Nonnull String ifname) {
        int id = allocator.newNetworkIndex();
        netdevOption = new QEmuNetdevOption.Tap();
        netdevOption
                .withTapInterface(ifname)
                .withId("backend-net-" + id);
        add(netdevOption);
        deviceOption = new QEmuDeviceOption.VirtioNet();
        deviceOption
                .withId("virtio-net-" + id)
                // .withPciAddress(allocator)   // Don't do this - let qemu autoallocate.
                .withProperty(QEmuDeviceOption.VirtioNet.PROP_NETDEV, netdevOption.id);
        add(deviceOption);
    }

    @Nonnull
    public QEmuVirtioNetRecipe withMac(@Nonnull String mac) {
        deviceOption.withMac(mac);
        return this;
    }

    @Nonnull
    public QEmuVirtioNetRecipe withPciAddress(@Nonnull String address) {
        deviceOption.withPciAddress(address);
        return this;
    }

    @Nonnull
    public QEmuVirtioNetRecipe withPciAddress(@Nonnull QEmuIdAllocator allocator) {
        deviceOption.withPciAddress(allocator);
        return this;
    }

    @Nonnull
    public QEmuVirtioNetRecipe withTapInterface(@Nonnull String ifname) {
        netdevOption.withTapInterface(ifname);
        return this;
    }

    @Nonnull
    public QEmuVirtioNetRecipe withProperty(@Nonnull String key, @Nonnull String value) {
        deviceOption.withProperty(key, value);
        return this;
    }
}
