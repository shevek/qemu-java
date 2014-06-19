/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QApiCommandDescriptor extends QApiElementDescriptor {

    @SerializedName("command")
    public String name;
    public Object returns;
    // Either String naming an existing type, or Map<String, Object> defining a type
    public Object data;
    private QApiTypeDescriptor argumentType;
    private String argumentTypeName;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return super.getClassName() + "Command";
    }

    private void preprocess() {
        if (argumentTypeName != null)
            return;

        if (data == null)
            return;
        if (data instanceof String) {
            argumentTypeName = (String) data;
            return;
        }
        if (data instanceof Map) {
            argumentType = new QApiTypeDescriptor();
            argumentType.name = super.getClassName() + "Arguments";
            argumentType.data = (Map) data;
            argumentTypeName = getClassName() + "." + argumentType.name;
            return;
        }
        throw new IllegalStateException("Unrecognized data " + data);
    }

    @Nonnull
    public String getReturnTypeName() {
        return toNestedJavaType(returns);
    }

    @Nonnull
    public String getReturnTypeNameWrapped() {
        return toWrappedJavaType(getReturnTypeName());
    }

    @CheckForNull
    public QApiTypeDescriptor getArgumentType() {
        preprocess();
        return argumentType;
    }

    public String getArgumentTypeName() {
        preprocess();
        return argumentTypeName;
    }

    public String getArgumentTypeNameWrapped() {
        return toWrappedJavaType(getArgumentTypeName());
    }

    @Override
    public String getTemplateName() {
        return "command";
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", getName())
                .add("returns", returns)
                .add("data", data)
                .toString();
    }
}
