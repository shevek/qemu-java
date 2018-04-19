/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;

import javax.annotation.CheckForNull;
import java.util.Map;

/**
 *
 * @author shevek
 */
public class QApiTypeDescriptor extends AbstractQApiTypeDescriptor {
    @SerializedName("struct")
    public String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTemplateName() {
        return "type";
    }

    @CheckForNull
    public String getSuperClassName() {
        preprocess(this);
        if (base == null) {
            return null;
        }
        return toClassName((String) base);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", getName())
                .add("data", data)
                .add("innerTypes", innerTypes)
                .toString();
    }

    public static QApiTypeDescriptor fromMap(final Map<String, Object> map, final String name) {
        QApiTypeDescriptor instance = new QApiTypeDescriptor();
        instance.data = map;
        instance.name = name;
        return instance;
    }
}
