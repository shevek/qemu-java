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
public class QEmuRtcOption extends AbstractQEmuOption {

    // [base=utc|localtime|date][,clock=host|vm][,driftfix=none|slew]
    public static enum Base {

        utc, localtime
    }

    public static enum Clock {

        host, vm
    }

    public static enum Driftfix {

        none, slew
    }
    private Base base;
    private Clock clock;
    private Driftfix driftfix;

    @Nonnull
    public QEmuRtcOption withBase(Base base) {
        this.base = base;
        return this;
    }

    @Nonnull
    public QEmuRtcOption withClock(Clock clock) {
        this.clock = clock;
        return this;
    }

    @Nonnull
    public QEmuRtcOption withDriftfix(Driftfix driftfix) {
        this.driftfix = driftfix;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder();
        appendTo(buf, "base", base);
        appendTo(buf, "clock", clock);
        appendTo(buf, "driftfix", driftfix);
        add(line, "-rtc", buf.toString());
    }
}
