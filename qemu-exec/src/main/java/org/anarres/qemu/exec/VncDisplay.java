/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.net.InetAddress;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnegative;

/**
 *
 * @author shevek
 */
public abstract class VncDisplay {

    public static class Socket extends VncDisplay {

        private final InetAddress address;
        private final int display;

        public Socket(@CheckForNull InetAddress address, @Nonnegative int display) {
            this.address = address;
            this.display = display;
        }

        public Socket(@Nonnegative int display) {
            this(null, display);
        }

        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            if (address != null)
                buf.append(address.getHostAddress());
            else
                buf.append("0.0.0.0");
            buf.append(':').append(display);
            return buf.toString();
        }
    }

    public static class Unix extends VncDisplay {

        private final File path;

        public Unix(File path) {
            this.path = path;
        }

        public Unix(String path) {
            this(new File(path));
        }

        @Override
        public String toString() {
            return "unix:" + path.getAbsolutePath();
        }
    }

    public static class None extends VncDisplay {

        @Override
        public String toString() {
            return "none";
        }
    }

    public enum Share {

        ALLOW_EXCLUSIVE("allow-exclusive"),
        FORCE_SHARED("force-shared"),
        IGNORE("ignore");
        private final String text;

        private Share(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
    public boolean reverse;
    public boolean tls;
    public boolean password;
    public File x509;
    public File x509verify;
    public boolean sasl;
    public boolean acl;
    public boolean lossy;
    public boolean nonadaptive;
    public Share share;

    private void append(StringBuilder buf, String text, boolean b) {
        if (b)
            buf.append(",").append(text);
    }

    private void append(StringBuilder buf, String text, File f) {
        if (f != null)
            buf.append(",").append(text).append("=").append(f.getAbsolutePath());
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        append(buf, "reverse", reverse);
        append(buf, "tls", tls);
        append(buf, "password", password);
        append(buf, "x509", x509);
        append(buf, "x509verify", x509verify);
        append(buf, "sasl", sasl);
        append(buf, "acl", acl);
        append(buf, "lossy", lossy);
        append(buf, "non-adaptive", nonadaptive);
        if (share != null)
            buf.append(",share=").append(share);
        return buf.toString();
    }
}
