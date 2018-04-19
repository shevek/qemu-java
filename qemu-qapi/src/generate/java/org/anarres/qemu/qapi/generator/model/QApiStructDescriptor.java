package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * @author dsmather
 */
public class QApiStructDescriptor extends AbstractQApiStructDescriptor {

    @SerializedName("struct")
    public String name;


    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public String getTemplateName() {
        return "struct";
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", getName())
                .add("data", data)
                .add("innerTypes", innerTypes)
                .add("fields", fields)
                .add("base", base)
                .toString();
    }

}
