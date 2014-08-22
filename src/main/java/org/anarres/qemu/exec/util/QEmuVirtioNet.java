/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import java.util.List;
import javax.annotation.Nonnull;
import org.anarres.qemu.exec.QEmuDeviceOption;
import org.anarres.qemu.exec.QEmuNetdevOption;
import org.anarres.qemu.exec.QEmuOption;

/**
 *
 * @author shevek
 */
public class QEmuVirtioNet implements QEmuOption {

    // tap,fd=27,id=hostnet0,vhost=on,vhostfd=28
    public final QEmuNetdevOption.Tap netdevOption;
    // virtio-net-pci,netdev=hostnet0,id=net0,mac=fa:16:3e:13:ff:1f,bus=pci.0,addr=0x3
    public final QEmuDeviceOption.VirtioNet deviceOption;

    public QEmuVirtioNet() {
        int id = System.identityHashCode(this);
        netdevOption = new QEmuNetdevOption.Tap();
        netdevOption
                .withId("dev-virtio-net" + id);
        deviceOption = new QEmuDeviceOption.VirtioNet();
        deviceOption
                .withId("virtio-net" + id)
                .withProperty(QEmuDeviceOption.VirtioNet.PROP_NETDEV, netdevOption.id);
    }

    @Nonnull
    public QEmuVirtioNet withMac(@Nonnull String mac) {
        deviceOption.withMac(mac);
        return this;
    }

    @Nonnull
    public QEmuVirtioNet withAddress(@Nonnull String address) {
        deviceOption.withAddress(address);
        return this;
    }

    @Nonnull
    public QEmuVirtioNet withAddress(@Nonnull QEmuPciAllocator allocator) {
        deviceOption.withAddress(allocator);
        return this;
    }

    @Nonnull
    public QEmuVirtioNet withProperty(@Nonnull String key, @Nonnull String value) {
        deviceOption.withProperty(key, value);
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        netdevOption.appendTo(line);
        deviceOption.appendTo(line);
    }
}
