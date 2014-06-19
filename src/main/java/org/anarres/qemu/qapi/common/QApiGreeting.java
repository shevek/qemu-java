/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author shevek
 */
public class QApiGreeting {

    public static class QEmuVersion {

        public int major;
        public int minor;
        public int micro;
    }

    public static class QApiVersion {

        public QEmuVersion qemu;
        @SerializedName("package")
        public String _package;
    }

    public static class QMPVersion {

        public QApiVersion version;
        public List<Object> capabilities;
    }
    public QMPVersion QMP;
}
