/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.annotations.SerializedName;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * A QApi Command.
 * 
 * While the library provides a set of subclasses of QApiCommand generated from
 * the JSON schema, arbitrary subclasses may be constructed and transmitted
 * in order to access experimental features.
 *
 * @author shevek
 */
public class QApiCommand<Argument, Response extends QApiResponse<?>> extends QApiObject {

    @SerializedName("execute")
    private final String commandName;
    private transient final Class<Response> returnType;
    @SerializedName("data")
    private final Argument argument;

    public QApiCommand(@Nonnull String commandName, @Nonnull Class<Response> returnType, @CheckForNull Argument argument) {
        this.commandName = commandName;
        this.returnType = returnType;
        this.argument = argument;
    }

    @Nonnull
    public String getCommandName() {
        return commandName;
    }

    @Nonnull
    public Class<Response> getReturnType() {
        return returnType;
    }

    @CheckForNull
    public Argument getArgument() {
        return argument;
    }
}