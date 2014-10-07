/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.host.chardev;

import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public abstract class AbstractSocketCharDevice extends AbstractCharDevice {

    public boolean server;
    public boolean nowait;
    public boolean telnet;

    public AbstractSocketCharDevice(String name) {
        super(name);
    }

    public AbstractSocketCharDevice(String name, boolean server, boolean nowait) {
        super(name);
        this.server = server;
        this.nowait = nowait;
    }

    @Nonnull
    public AbstractSocketCharDevice withServer(boolean server) {
        this.server = server;
        return this;
    }

    @Nonnull
    public AbstractSocketCharDevice withNowait(boolean nowait) {
        this.nowait = nowait;
        return this;
    }

    @Nonnull
    public AbstractSocketCharDevice withTelnet(boolean telnet) {
        this.telnet = telnet;
        return this;
    }

    @Override
    protected void addProperties(Map<String, Object> m) {
        super.addProperties(m);
        if (server)
            m.put("server", null);
        if (nowait)
            m.put("nowait", null);
        if (telnet)
            m.put("telnet", null);
    }
}
