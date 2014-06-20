package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=add-fd, returns=AddfdInfo, data={*fdset-id=int, *opaque=str}}
public class AddFdCommand extends QApiCommand<AddFdCommand.AddFdArguments, AddFdCommand.Response> {
	public static class AddFdArguments {
		@SerializedName("fdset-id")
		@CheckForNull public long fdsetId;
		@SerializedName("opaque")
		@CheckForNull public String opaque;
	}

	public static class Response extends QApiResponse<AddfdInfo> {
	}

	public AddFdCommand(@Nonnull AddFdCommand.AddFdArguments argument) {
		super("add-fd", Response.class, argument);
	}
}
