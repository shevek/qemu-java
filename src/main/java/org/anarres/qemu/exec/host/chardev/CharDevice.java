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
public interface CharDevice {

    @Nonnull
    public String getName();

    @Nonnull
    public Map<? extends String, ? extends Object> getProperties();
}
