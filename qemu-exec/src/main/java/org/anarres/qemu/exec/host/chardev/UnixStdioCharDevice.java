/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class UnixStdioCharDevice extends AbstractCharDevice {

    public boolean signal;

    public UnixStdioCharDevice() {
        super("stdio");
    }

    @Nonnull
    public UnixStdioCharDevice withSignal(boolean signal) {
        this.signal = signal;
        return this;
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        m.put("signal", signal ? "on" : "off");
    }

    @Override
    public String toString() {
        return "stdio";
    }
}
