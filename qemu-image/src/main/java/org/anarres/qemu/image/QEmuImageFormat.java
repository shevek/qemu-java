/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.image;

/**
 * A supported QEmu image format.
 *
 * @author shevek
 */
public enum QEmuImageFormat {

    /** A plain binary image of the disc image. */
    raw,
    /** Compressed Loop format, mainly used for reading Knoppix and similar live CD image formats. */
    cloop,
    /** Copy-on-write format, supported for historical reasons only and not available to QEMU on Windows. */
    cow,
    /** The old QEMU copy-on-write format, supported for historical reasons and superseded by qcow2. */
    qcow,
    /** QEMU copy-on-write format, supporting multiple snapshots, sparse images, AES encryption, and zlib compression. */
    qcow2,
    /** VMware 3 &amp; 4, or 6 image format, for exchanging images with that product. */
    vmdk,
    /** VirtualBox 1.1 compatible image format, for exchanging images with VirtualBox. */
    vdi
}
