/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class AbstractCharDevice implements CharDevice {

    private final String name;

    public AbstractCharDevice(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    protected void addProperties(@Nonnull Map<String, Object> m) {
    }

    @Override
    public Map<? extends String, ? extends Object> getProperties() {
        Map<String, Object> m = new HashMap<String, Object>();
        addProperties(m);
        return m;
    }
}
