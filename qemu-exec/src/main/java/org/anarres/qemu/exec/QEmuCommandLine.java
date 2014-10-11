/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.IOException;
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

    /** Returns all the options in this command line. */
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

    /**
     * Returns all options of the specified type in this command line.
     */
    @Nonnull
    public <T extends QEmuOption> List<? extends T> getOptions(@Nonnull Class<T> type) {
        List<T> out = new ArrayList<T>();
        getOptions(out, getOptions(), type);
        return out;
    }

    /**
     * Returns the first option of the specified type in this command line.
     * 
     * If there are no options of type <code>type</code>, null is returned.
     * If there is more than one option of type <code>type</code>, the subsequent
     * options are ignored.
     */
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

    /**
     * Executes this QEmuCommandLine and returns a new {@link Process}.
     */
    @Nonnull
    public Process exec() throws IOException {
        List<String> commandWords = toCommandWords();
        ProcessBuilder builder = new ProcessBuilder(commandWords);
        return builder.start();
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