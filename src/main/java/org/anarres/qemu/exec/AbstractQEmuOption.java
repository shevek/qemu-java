/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class AbstractQEmuOption implements QEmuOption {

    protected static void appendTo(@Nonnull StringBuilder buf, String key, Object value) {
        if (value == null)
            return;
        if (buf.length() > 0)
            buf.append(",");
        buf.append(key).append("=").append(value);
    }
}
