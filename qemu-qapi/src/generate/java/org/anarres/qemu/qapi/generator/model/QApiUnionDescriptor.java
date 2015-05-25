/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
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
        FIELD:
        if (discriminator instanceof String) {
            if (false) {
                for (Iterator<Field> it = getFields().iterator(); it.hasNext(); /* */) {
                    Field field = it.next();
                    if (discriminator.equals(field.name)) {
                        discriminatorField = field;
                        break FIELD;
                    }
                }
                throw new IllegalArgumentException("Discriminator field " + discriminator + " not found in " + getFields());
            } else {
                discriminatorField = new Field();
                discriminatorField.typeName = "BlockdevDriver"; // XXX TODO: HACK HACK - look this up in the global type dict.
                discriminatorField.name = toJavaEnumName((String) discriminator);
            }
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
        return Objects.toStringHelper(this)
                .add("name", getName())
                .add("discrinimator", discriminator)
                .add("data", data)
                .add("innerTypes", innerTypes)
                .add("fields", fields)
                .add("discriminatorField", discriminatorField)
                .toString();
    }

}
