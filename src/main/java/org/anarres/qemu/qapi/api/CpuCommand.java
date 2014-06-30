package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=cpu, returns=null, data={index=int}}
public class CpuCommand extends QApiCommand<CpuCommand.Arguments, CpuCommand.Response> {
	public static class Arguments {
		@SerializedName("index")
		@Nonnull public long index;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public CpuCommand(@Nonnull CpuCommand.Arguments argument) {
		super("cpu", Response.class, argument);
	}
}
