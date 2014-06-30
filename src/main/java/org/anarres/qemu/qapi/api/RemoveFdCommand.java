package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=remove-fd, returns=null, data={fdset-id=int, *fd=int}}
public class RemoveFdCommand extends QApiCommand<RemoveFdCommand.Arguments, RemoveFdCommand.Response> {
	public static class Arguments {
		@SerializedName("fdset-id")
		@Nonnull public long fdsetId;
		@SerializedName("fd")
		@CheckForNull public long fd;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public RemoveFdCommand(@Nonnull RemoveFdCommand.Arguments argument) {
		super("remove-fd", Response.class, argument);
	}
}
