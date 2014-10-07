/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("execute")
    private final String commandName;
    @JsonIgnore
    private transient final Class<Response> returnType;
    @JsonProperty("arguments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonIgnore
    public Class<Response> getReturnType() {
        return returnType;
    }

    @CheckForNull
    public Argument getArgument() {
        return argument;
    }
}