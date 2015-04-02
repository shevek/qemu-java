/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;

/**
 *
 * @author shevek
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String name = args[0];
        args = Arrays.copyOfRange(args, 1, args.length);

        List<String> names = new ArrayList<String>();
        for (QEmuExample example : ServiceLoader.load(QEmuExample.class)) {
            if (name.equals(example.getClass().getSimpleName())) {
                example.invoke(args);
                return;
            }
            names.add(example.getClass().getSimpleName());
        }
        throw new IllegalArgumentException("No such example " + name + " in " + names);
    }
}
