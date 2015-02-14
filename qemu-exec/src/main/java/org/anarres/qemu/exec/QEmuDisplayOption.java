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
    private VncDisplay vncDisplay;

    public QEmuDisplayOption(@Nonnull DisplayType displayType) {
        this.displayType = displayType;
    }

    public QEmuDisplayOption(@Nonnull VncDisplay vncDisplay) {
        this(DisplayType.vnc);
        withVncDisplay(vncDisplay);
    }

    @Nonnull
    public QEmuDisplayOption withVgaType(@Nonnull VgaType vgaType) {
        this.vgaType = vgaType;
        return this;
    }

    @Nonnull
    public QEmuDisplayOption withVncDisplay(@Nonnull VncDisplay vncDisplay) {
        this.vncDisplay = vncDisplay;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        switch (displayType) {
            case nographic:
                add(line, "-nographic");
                break;
            case vnc:
                add(line, "-display", "vnc=" + vncDisplay);
                break;
            default:
                add(line, "-display", displayType);
                break;
        }
        if (vgaType != null)
            add(line, "-vga", vgaType);
    }
}
