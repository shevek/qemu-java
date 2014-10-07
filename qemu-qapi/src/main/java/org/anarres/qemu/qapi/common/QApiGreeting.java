/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.annotation.JsonProperty;
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

        @JsonProperty
        public int major;
        @JsonProperty
        public int minor;
        @JsonProperty
        public int micro;
    }

    public static class QApiVersion extends QApiObject {

        @JsonProperty
        public QEmuVersion qemu;
        @JsonProperty("package")
        public String _package;
    }

    public static class QMPVersion extends QApiObject {

        @JsonProperty
        public QApiVersion version;
        @JsonProperty
        public List<Object> capabilities;
    }
    @JsonProperty
    public QMPVersion QMP;
}
