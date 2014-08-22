/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * A QApi Type, essentially a structure.
 *
 * @author shevek
 */
public abstract class QApiType extends QApiObject {

    @JsonIgnore
    @Nonnull
    public List<String> getFieldNames() {
        return new ArrayList<String>();
    }

    @CheckForNull
    public Object getFieldByName(String name) throws NoSuchFieldException {
        throw new NoSuchFieldException(name);
    }
}
