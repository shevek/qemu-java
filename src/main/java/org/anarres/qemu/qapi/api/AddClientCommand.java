package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=add_client, returns=null, data={protocol=str, fdname=str, *skipauth=bool, *tls=bool}}
public class AddClientCommand extends QApiCommand<AddClientCommand.Arguments, AddClientCommand.Response> {
	public static class Arguments {
		@SerializedName("protocol")
		@Nonnull public String protocol;
		@SerializedName("fdname")
		@Nonnull public String fdname;
		@SerializedName("skipauth")
		@CheckForNull public boolean skipauth;
		@SerializedName("tls")
		@CheckForNull public boolean tls;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public AddClientCommand(@Nonnull AddClientCommand.Arguments argument) {
		super("add_client", Response.class, argument);
	}
}
