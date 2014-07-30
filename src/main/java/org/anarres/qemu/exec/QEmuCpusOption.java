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
public class QEmuCpusOption extends AbstractQEmuOption {

    private String model;
    private int cpus = 1;
    private Integer cores = -1;
    private Integer threads = -1;
    private Integer sockets = -1;
    private Integer maxcpus = -1;

    public QEmuCpusOption(int cpus) {
        this.cpus = cpus;
    }

    @Nonnull
    public QEmuCpusOption withModel(@Nonnull String model) {
        this.model = model;
        return this;
    }

    @Nonnull
    public QEmuCpusOption withCores(@Nonnull int cores) {
        this.cores = cores;
        return this;
    }

    @Nonnull
    public QEmuCpusOption withThreads(@Nonnull int threads) {
        this.threads = threads;
        return this;
    }

    @Nonnull
    public QEmuCpusOption withSockets(@Nonnull int sockets) {
        this.sockets = sockets;
        return this;
    }

    @Nonnull
    public QEmuCpusOption withMaxCpus(@Nonnull int maxcpus) {
        this.maxcpus = maxcpus;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        if (model != null)
            add(line, "-cpus", model);
        StringBuilder smp = new StringBuilder();
        appendTo(smp, "cpus", cpus);
        appendTo(smp, "cores", cores);
        appendTo(smp, "threads", threads);
        appendTo(smp, "sockets", sockets);
        appendTo(smp, "maxcpus", maxcpus);
        add(line, "-smp", smp.toString());
    }
}
