/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.CaseFormat;
import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author shevek
 */
public class QApiEventDescriptor extends AbstractQApiTypeDescriptor {

    @SerializedName("event")
    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getName()) + "Event";
    }

    @Override
    public String getTemplateName() {
        return "event";
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", getName())
                .add("data", data)
                .toString();
    }
}
