package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=nbd-server-add, returns=null, data={device=str, *writable=bool}}
public class NbdServerAddCommand extends QApiCommand<NbdServerAddCommand.Arguments, NbdServerAddCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("writable")
		@CheckForNull public boolean writable;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public NbdServerAddCommand(@Nonnull NbdServerAddCommand.Arguments argument) {
		super("nbd-server-add", Response.class, argument);
	}
}
