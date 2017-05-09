/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

/**
 * A QApi Union.
 *
 * @author shevek
 */
public interface QApiUnion {

    /**
     * Returns true if this is a valid union.
     *
     * i.e. exactly one field is set.
     */
    boolean isValidUnion();
}
