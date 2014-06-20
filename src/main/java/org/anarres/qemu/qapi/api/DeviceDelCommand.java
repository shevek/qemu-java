package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=device_del, returns=null, data={id=str}}
public class DeviceDelCommand extends QApiCommand<DeviceDelCommand.DeviceDelArguments, DeviceDelCommand.Response> {
	public static class DeviceDelArguments {
		@SerializedName("id")
		@Nonnull public String id;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public DeviceDelCommand(@Nonnull DeviceDelCommand.DeviceDelArguments argument) {
		super("device_del", Response.class, argument);
	}
}
