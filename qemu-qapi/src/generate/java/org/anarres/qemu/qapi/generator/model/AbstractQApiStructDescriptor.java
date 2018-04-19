package org.anarres.qemu.qapi.generator.model;

import com.google.common.base.MoreObjects;

import java.util.Map;

/**
 * @author dsmather
 */
public abstract class AbstractQApiStructDescriptor extends AbstractQApiTypeDescriptor {

    @Override
    public String getSuperClassName() {
        if (base instanceof Map)
            return getName() + "Base";
        return super.getSuperClassName();
    }

}
