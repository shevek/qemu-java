package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=blockdev-add, returns=null, data={options=BlockdevOptions}}
public class BlockdevAddCommand extends QApiCommand<BlockdevAddCommand.Arguments, BlockdevAddCommand.Response> {
	public static class Arguments {
		@SerializedName("options")
		@Nonnull public BlockdevOptions options;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockdevAddCommand(@Nonnull BlockdevAddCommand.Arguments argument) {
		super("blockdev-add", Response.class, argument);
	}
}
