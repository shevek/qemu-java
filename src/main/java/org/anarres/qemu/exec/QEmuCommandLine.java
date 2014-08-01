/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;
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

    @Nonnull
    public List<? extends QEmuOption> getOptions() {
        return options;
    }

    @Nonnull
    public <T extends QEmuOption> List<? extends T> getOptions(@Nonnull Class<T> type) {
        List<T> out = new ArrayList<T>();
        for (QEmuOption option : getOptions())
            if (type.isInstance(option))
                out.add(type.cast(option));
        return out;
    }

    @CheckForNull
    public <T extends QEmuOption> T getOption(@Nonnull Class<T> type) {
        for (QEmuOption option : getOptions())
            if (type.isInstance(option))
                return type.cast(option);
        return null;
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
