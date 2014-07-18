/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * The QEmu version and capability information.
 * 
 * This information is sent to the client on connection.
 *
 * @author shevek
 */
public class QApiGreeting extends QApiObject {

    public static class QEmuVersion extends QApiObject {

        public int major;
        public int minor;
        public int micro;
    }

    public static class QApiVersion extends QApiObject {

        public QEmuVersion qemu;
        @SerializedName("package")
        public String _package;
    }

    public static class QMPVersion extends QApiObject {

        public QApiVersion version;
        public List<Object> capabilities;
    }
    public QMPVersion QMP;
}
