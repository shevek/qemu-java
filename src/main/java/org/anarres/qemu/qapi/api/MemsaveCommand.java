package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=memsave, returns=null, data={val=int, size=int, filename=str, *cpu-index=int}}
public class MemsaveCommand extends QApiCommand<MemsaveCommand.Arguments, MemsaveCommand.Response> {
	public static class Arguments {
		@SerializedName("val")
		@Nonnull public long val;
		@SerializedName("size")
		@Nonnull public long size;
		@SerializedName("filename")
		@Nonnull public String filename;
		@SerializedName("cpu-index")
		@CheckForNull public long cpuIndex;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public MemsaveCommand(@Nonnull MemsaveCommand.Arguments argument) {
		super("memsave", Response.class, argument);
	}
}
