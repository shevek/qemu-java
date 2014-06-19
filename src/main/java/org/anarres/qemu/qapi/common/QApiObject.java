/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.GsonBuilder;

/**
 * The base of all QApi objects.
 *
 * @author shevek
 */
public abstract class QApiObject {

    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this);
    }
}
