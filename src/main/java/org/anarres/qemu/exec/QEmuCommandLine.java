/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuCommandLine {

    private QEmuArchitecture architecture;
    private final List<QEmuOption> options = new ArrayList<QEmuOption>();

    public QEmuCommandLine(@Nonnull QEmuArchitecture architecture) {
        this.architecture = architecture;
    }

    @Nonnull
    public QEmuArchitecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(@Nonnull QEmuArchitecture architecture) {
        this.architecture = architecture;
    }

    public void addOptions(@Nonnull Iterable<? extends QEmuOption> options) {
        for (QEmuOption option : options)
            this.options.add(option);
    }

    public void addOptions(@Nonnull QEmuOption... options) {
        addOptions(Arrays.asList(options));
    }

    @Nonnull
    public List<String> toCommandWords() {
        List<String> line = new ArrayList<String>();
        line.add(architecture.getCommand());
        for (QEmuOption option : options)
            option.appendTo(line);
        return line;
    }
}
