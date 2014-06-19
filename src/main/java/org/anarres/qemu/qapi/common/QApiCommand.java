/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QApiCommand<Argument, Return> extends QApiObject {

    @SerializedName("execute")
    private final String commandName;
    private final TypeToken<Return> returnType;
    @SerializedName("data")
    private final Argument argument;

    public QApiCommand(@Nonnull String commandName, @Nonnull TypeToken<Return> returnType, @CheckForNull Argument argument) {
        this.commandName = commandName;
        this.returnType = returnType;
        this.argument = argument;
    }

    @Nonnull
    public String getCommandName() {
        return commandName;
    }

    @Nonnull
    public TypeToken<Return> getReturnTypeToken() {
        return returnType;
    }

    @Nonnull
    public Type getReturnType() {
        return getReturnTypeToken().getType();
    }

    @CheckForNull
    public Argument getArgument() {
        return argument;
    }
}