/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * QApi anonymous unions are represented differently since QEmu commit ab916faddd16f0165e9cc2551f90699be8efde53.
 *
 * @author shevek
 */
public class QApiAnonymousUnionDescriptor extends AbstractQApiUnionDescriptor {

    @SerializedName("alternate")
    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isEnumDiscriminated() {
        return false;
    }

    @Override
    public boolean isFieldDiscriminated() {
        return false;
    }

    @Override
    public boolean isTypeDiscriminated() {
        return true;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", getName())
                .add("data", data)
                .add("innerTypes", innerTypes)
                .add("fields", fields)
                .toString();
    }
}
