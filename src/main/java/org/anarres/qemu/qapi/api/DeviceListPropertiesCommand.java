package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=device-list-properties, returns=[DevicePropertyInfo], data={typename=str}}
public class DeviceListPropertiesCommand extends QApiCommand<DeviceListPropertiesCommand.DeviceListPropertiesArguments, DeviceListPropertiesCommand.Response> {
	public static class DeviceListPropertiesArguments {
		@SerializedName("typename")
		@Nonnull public String typename;
	}

	public static class Response extends QApiResponse<List<DevicePropertyInfo>> {
	}

	public DeviceListPropertiesCommand(@Nonnull DeviceListPropertiesCommand.DeviceListPropertiesArguments argument) {
		super("device-list-properties", Response.class, argument);
	}
}
