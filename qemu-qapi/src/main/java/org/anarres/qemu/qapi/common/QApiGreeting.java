/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.anarres.qemu.qapi.api.VersionInfo;

/**
 * The QEmu version and capability information.
 *
 * This information is sent to the client on connection.
 *
 * @author shevek
 */
public class QApiGreeting extends QApiObject {

    public static class QMPVersion extends QApiObject {

        @JsonProperty
        public VersionInfo version;
        @JsonProperty
        public List<Object> capabilities;
    }
    @JsonProperty
    public QMPVersion QMP;
}
