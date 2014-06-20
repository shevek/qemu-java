package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=eject, returns=null, data={device=str, *force=bool}}
public class EjectCommand extends QApiCommand<EjectCommand.EjectArguments, EjectCommand.Response> {
	public static class EjectArguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("force")
		@CheckForNull public boolean force;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public EjectCommand(@Nonnull EjectCommand.EjectArguments argument) {
		super("eject", Response.class, argument);
	}
}
