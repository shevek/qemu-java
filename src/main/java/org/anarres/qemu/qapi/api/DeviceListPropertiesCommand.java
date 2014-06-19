package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=device-list-properties, returns=[DevicePropertyInfo], data={typename=str}}
public class DeviceListPropertiesCommand extends QApiCommand<DeviceListPropertiesCommand.DeviceListPropertiesArguments, List<DevicePropertyInfo>> {
	public static class DeviceListPropertiesArguments {
		@SerializedName("typename")
		@Nonnull public String typename;
	}

	public DeviceListPropertiesCommand(@Nonnull DeviceListPropertiesCommand.DeviceListPropertiesArguments argument) {
		super("device-list-properties", new TypeToken<List<DevicePropertyInfo>>() {}, argument);
	}
}
