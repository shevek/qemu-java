package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=add_client, returns=null, data={protocol=str, fdname=str, *skipauth=bool, *tls=bool}}
public class AddClientCommand extends QApiCommand<AddClientCommand.AddClientArguments, Void> {
	public static class AddClientArguments {
		@SerializedName("protocol")
		@Nonnull public String protocol;
		@SerializedName("fdname")
		@Nonnull public String fdname;
		@SerializedName("skipauth")
		@CheckForNull public boolean skipauth;
		@SerializedName("tls")
		@CheckForNull public boolean tls;
	}

	public AddClientCommand(@Nonnull AddClientCommand.AddClientArguments argument) {
		super("add_client", new TypeToken<Void>() {}, argument);
	}
}
