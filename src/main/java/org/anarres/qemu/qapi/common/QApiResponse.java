/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author shevek
 */
public class QApiResponse<V> extends QApiObject {

    @SerializedName("return")
    public V _return;
    public String error;

    public boolean isError() {
        return error != null;
    }

    public V getResult() throws QApiException {
        if (isError())
            throw new QApiException(error);
        return _return;
    }
}
