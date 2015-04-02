/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.examples;

import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public interface QEmuExample {

    public void invoke(@Nonnull String[] args) throws Exception;
}
