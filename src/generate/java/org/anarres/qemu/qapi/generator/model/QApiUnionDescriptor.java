/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author shevek
 */
public class QApiUnionDescriptor extends AbstractQApiTypeDescriptor {

    @SerializedName("union")
    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTemplateName() {
        return "union";
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
