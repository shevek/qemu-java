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
public class QApiError extends QApiObject {

    @JsonProperty("class")
    public String _class;
    @JsonProperty
    public String desc;
    // Emitted by QEmu 1.0. Later versions too?
    @JsonProperty
    public Object data;
}
