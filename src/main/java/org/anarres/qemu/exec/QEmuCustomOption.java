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
public class QEmuCustomOption extends AbstractQEmuOption {

    private final List<? extends String> words;

    public QEmuCustomOption(@Nonnull List<? extends String> words) {
        this.words = words;
    }

    @Override
    public void appendTo(List<? super String> line) {
        line.addAll(words);
    }
}
