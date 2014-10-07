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
public class QApiResponse<V> extends QApiObject {

    @JsonProperty("return")
    public V _return;
    @JsonProperty
    public QApiError error;

    public boolean isError() {
        return error != null;
    }

    public V getResult() throws QApiException {
        if (isError())
            throw new QApiException(error.desc);
        return _return;
    }
}
