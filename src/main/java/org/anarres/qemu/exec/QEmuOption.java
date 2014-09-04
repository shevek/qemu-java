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
public interface QEmuOption {

    public static interface Container extends Iterable<QEmuOption> {
    }

    public void appendTo(@Nonnull List<? super String> line);
}
