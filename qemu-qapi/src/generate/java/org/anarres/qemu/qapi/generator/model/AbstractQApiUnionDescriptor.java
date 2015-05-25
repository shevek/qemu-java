/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator.model;

/**
 *
 * @author shevek
 */
public abstract class AbstractQApiUnionDescriptor extends AbstractQApiTypeDescriptor {

    @Override
    public String getTemplateName() {
        return "union";
    }

    public abstract boolean isEnumDiscriminated();

    public abstract boolean isFieldDiscriminated();

    public abstract boolean isTypeDiscriminated();
}
