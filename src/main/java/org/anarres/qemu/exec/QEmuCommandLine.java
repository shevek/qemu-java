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
import org.anarres.qemu.exec.util.QEmuOptionsList;

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

    public QEmuCommandLine(@Nonnull QEmuArchitecture architecture, @Nonnull QEmuMachine machine) {
        this(architecture);
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

    private static <T extends QEmuOption> void getOptions(@Nonnull List<? super T> out, @Nonnull Iterable<? extends QEmuOption> in, @Nonnull Class<T> type) {
        for (QEmuOption option : in) {
            if (type.isInstance(option))
                out.add(type.cast(option));
            if (option instanceof QEmuOptionsList)
                getOptions(out, (QEmuOptionsList) option, type);
        }
    }

    @Nonnull
    public <T extends QEmuOption> List<? extends T> getOptions(@Nonnull Class<T> type) {
        List<T> out = new ArrayList<T>();
        getOptions(out, getOptions(), type);
        return out;
    }

    @CheckForNull
    public <T extends QEmuOption> T getOption(@Nonnull Class<T> type) {
        List<? extends T> options = getOptions(type);
        if (options.isEmpty())
            return null;
        return options.iterator().next();
    }

    public void addOptions(@Nonnull Iterable<? extends QEmuOption> options) {
        for (QEmuOption option : options)
            if (option != null)
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

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (String word : toCommandWords()) {
            if (buf.length() > 0)
                buf.append(' ');
            buf.append(word);
        }
        return buf.toString();
    }
}
