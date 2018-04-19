/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * @author shevek
 */
public class QApiUnionDescriptor extends AbstractQApiUnionDescriptor {

    @SerializedName("union")
    public String name;
    @CheckForNull
    /**
     * String -> existing field.
     * {} -> by-type (unwrapped) - always a QApiAnonymousUnionDescriptor now?
     * null -> introduce a new 'type' discriminator.
     */
    public Object discriminator;
    private Field discriminatorField;

    @Override
    protected boolean preprocess(AbstractQApiTypeDescriptor root) {
        if (!super.preprocess(root))
            return false;
        if (discriminator instanceof String) {
            discriminatorField = new Field();
            AbstractQApiStructDescriptor current = this;
            for (; ; ) {
                for (Field field : current.getFields()) {
                    if (discriminator.equals(field.getName())) {
                        discriminatorField.typeName = field.getTypeName();
                        break;
                    }
                }
                if (current.base != null) {
                    if (current.base instanceof Map) {
                        String typeName = (String) ((Map) current.base).get(discriminator);
                        if (typeName != null) {
                            discriminatorField.typeName = typeName;
                            break;
                        }
                    } else {
                        current = (AbstractQApiStructDescriptor) model.elements.get(current.base);
                    }
                } else {
                    break;
                }
            }
            if (discriminatorField.typeName == null) {
                throw new IllegalArgumentException("Unknown union discriminator in " + name +
                        " - contact Shevek for a fix because he was lazy");
            }
            discriminatorField.name = toJavaName((String) discriminator);
        }
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isEnumDiscriminated() {
        return discriminator == null;
    }

    public boolean isFieldDiscriminated() {
        return discriminator instanceof String;
    }

    public boolean isTypeDiscriminated() {
        if (isEnumDiscriminated())
            return false;
        if (isFieldDiscriminated())
            return false;
        return true;
    }

    @Nonnull
    public Field getDiscriminatorField() {
        return discriminatorField;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", getName())
                .add("discriminator", discriminator)
                .add("data", data)
                .add("innerTypes", innerTypes)
                .add("fields", fields)
                .add("base", base)
                .add("discriminatorField", discriminatorField)
                .toString();
    }

}
