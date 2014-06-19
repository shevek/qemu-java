/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator;

import java.util.HashMap;
import java.util.Map;
import org.anarres.qemu.qapi.generator.model.QApiElementDescriptor;

/**
 *
 * @author shevek
 */
public class SchemaModel {

    public final Map<String, QApiElementDescriptor> elements = new HashMap<String, QApiElementDescriptor>();
}
