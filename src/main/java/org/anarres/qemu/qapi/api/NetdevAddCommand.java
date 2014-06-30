package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=netdev_add, returns=null, data={type=str, id=str, *props=**}}
public class NetdevAddCommand extends QApiCommand<NetdevAddCommand.Arguments, NetdevAddCommand.Response> {
	public static class Arguments {
		@SerializedName("type")
		@Nonnull public String type;
		@SerializedName("id")
		@Nonnull public String id;
		@SerializedName("props")
		@CheckForNull public Object props;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public NetdevAddCommand(@Nonnull NetdevAddCommand.Arguments argument) {
		super("netdev_add", Response.class, argument);
	}
}
