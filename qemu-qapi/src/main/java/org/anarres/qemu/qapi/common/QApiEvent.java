/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author shevek
 */
public abstract class QApiEvent extends QApiObject {

    // Event looks like:
    // <<<{"timestamp": {"seconds": 1424208361, "microseconds": 993842}, "event": "POWERDOWN"}
    public static class Timestamp {

        @JsonProperty
        public long seconds;
        @JsonProperty
        public long microseconds;
    }

    @JsonProperty
    public String event;
    @JsonProperty
    public Timestamp timestamp;
}
