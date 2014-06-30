package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=nbd-server-start, returns=null, data={addr=SocketAddress}}
public class NbdServerStartCommand extends QApiCommand<NbdServerStartCommand.Arguments, NbdServerStartCommand.Response> {
	public static class Arguments {
		@SerializedName("addr")
		@Nonnull public SocketAddress addr;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public NbdServerStartCommand(@Nonnull NbdServerStartCommand.Arguments argument) {
		super("nbd-server-start", Response.class, argument);
	}
}
