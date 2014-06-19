package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=cpu, returns=null, data={index=int}}
public class CpuCommand extends QApiCommand<CpuCommand.CpuArguments, Void> {
	public static class CpuArguments {
		@SerializedName("index")
		@Nonnull public long index;
	}

	public CpuCommand(@Nonnull CpuCommand.CpuArguments argument) {
		super("cpu", new TypeToken<Void>() {}, argument);
	}
}
