/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.anarres.qemu.exec.QEmuOption;

/**
 *
 * @author shevek
 */
public class QEmuOptionsList extends ArrayList<QEmuOption> implements QEmuOption {

    public QEmuOptionsList() {
    }

    public QEmuOptionsList(Collection<? extends QEmuOption> c) {
        super(c);
    }

    public QEmuOptionsList(QEmuOption... c) {
        this(Arrays.asList(c));
    }

    @Override
    public void appendTo(List<? super String> line) {
        for (QEmuOption option : this)
            if (option != null)
                option.appendTo(line);
    }
}
