package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-memory-devices, returns=[MemoryDeviceInfo], data=null}
public class QueryMemoryDevicesCommand extends QApiCommand<Void, QueryMemoryDevicesCommand.Response> {

	public static class Response extends QApiResponse<List<MemoryDeviceInfo>> {
	}

	public QueryMemoryDevicesCommand() {
		super("query-memory-devices", Response.class, null);
	}
}
