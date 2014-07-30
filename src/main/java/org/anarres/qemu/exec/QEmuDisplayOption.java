/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuDisplayOption extends AbstractQEmuOption {

    public static enum DisplayType {

        sdl, curses, none, gtk, vnc, nographic
    }

    public static enum VgaType {

        cirrus, std, vmware, qxl, tcx, cg3, none;
    }
    private final DisplayType displayType;
    private VgaType vgaType;

    public QEmuDisplayOption(@Nonnull DisplayType displayType) {
        this.displayType = displayType;
    }

    @Nonnull
    public QEmuDisplayOption withVgaType(@Nonnull VgaType vgaType) {
        this.vgaType = vgaType;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        if (displayType == DisplayType.nographic)
            add(line, "-nographic");
        else
            add(line, "-display", displayType);
        if (vgaType != null)
            add(line, "-vga", vgaType);
    }
}
