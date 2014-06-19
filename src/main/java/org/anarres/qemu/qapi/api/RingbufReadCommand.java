package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=ringbuf-read, returns=str, data={device=str, size=int, *format=DataFormat}}
public class RingbufReadCommand extends QApiCommand<RingbufReadCommand.RingbufReadArguments, String> {
	public static class RingbufReadArguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("size")
		@Nonnull public long size;
		@SerializedName("format")
		@CheckForNull public DataFormat format;
	}

	public RingbufReadCommand(@Nonnull RingbufReadCommand.RingbufReadArguments argument) {
		super("ringbuf-read", new TypeToken<String>() {}, argument);
	}
}
