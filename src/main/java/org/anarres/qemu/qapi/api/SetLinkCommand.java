package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=set_link, returns=null, data={name=str, up=bool}}
public class SetLinkCommand extends QApiCommand<SetLinkCommand.SetLinkArguments, SetLinkCommand.Response> {
	public static class SetLinkArguments {
		@SerializedName("name")
		@Nonnull public String name;
		@SerializedName("up")
		@Nonnull public boolean up;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public SetLinkCommand(@Nonnull SetLinkCommand.SetLinkArguments argument) {
		super("set_link", Response.class, argument);
	}
}
