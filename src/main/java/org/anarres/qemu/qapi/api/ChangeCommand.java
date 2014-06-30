package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=change, returns=null, data={device=str, target=str, *arg=str}}
public class ChangeCommand extends QApiCommand<ChangeCommand.Arguments, ChangeCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("target")
		@Nonnull public String target;
		@SerializedName("arg")
		@CheckForNull public String arg;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ChangeCommand(@Nonnull ChangeCommand.Arguments argument) {
		super("change", Response.class, argument);
	}
}
