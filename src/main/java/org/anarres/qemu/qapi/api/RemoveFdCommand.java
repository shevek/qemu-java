package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=remove-fd, returns=null, data={fdset-id=int, *fd=int}}
public class RemoveFdCommand extends QApiCommand<RemoveFdCommand.RemoveFdArguments, Void> {
	public static class RemoveFdArguments {
		@SerializedName("fdset-id")
		@Nonnull public long fdsetId;
		@SerializedName("fd")
		@CheckForNull public long fd;
	}

	public RemoveFdCommand(@Nonnull RemoveFdCommand.RemoveFdArguments argument) {
		super("remove-fd", new TypeToken<Void>() {}, argument);
	}
}
