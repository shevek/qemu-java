/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author shevek
 */
public class QApiConnection {

    private final Gson gson = new GsonBuilder().create();
    // private Socket socket;

    public <Argument, Response> Response invoke(QApiCommand<Argument, Response> command) {
        String out = gson.toJson(command);
        // socket.getOutputStream().write(out.getBytes(Charsets.ISO8859_1));
        String in = "";
        return gson.fromJson(in, command.getReturnType().getType());
    }
}
