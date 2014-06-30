package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-stream, returns=null, data={device=str, *base=str, *speed=int, *on-error=BlockdevOnError}}
public class BlockStreamCommand extends QApiCommand<BlockStreamCommand.Arguments, BlockStreamCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("base")
		@CheckForNull public String base;
		@SerializedName("speed")
		@CheckForNull public long speed;
		@SerializedName("on-error")
		@CheckForNull public BlockdevOnError onError;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockStreamCommand(@Nonnull BlockStreamCommand.Arguments argument) {
		super("block-stream", Response.class, argument);
	}
}
