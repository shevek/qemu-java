/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;

/**
 *
 * @author shevek
 */
public class QEmuWatchdogOption extends AbstractQEmuOption {

    public static enum Model {

        ib700, i6300esb
    }

    public static enum Action {

        reset, shutdown, poweroff, pause, debug, none
    }
    private final Model model;
    private final Action action;

    public QEmuWatchdogOption(Model model, Action action) {
        this.model = model;
        this.action = action;
    }

    public QEmuWatchdogOption(Model model) {
        this(model, Action.none);
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-watchdog", model);
        add(line, "-watchdog-action", action);
    }
}
