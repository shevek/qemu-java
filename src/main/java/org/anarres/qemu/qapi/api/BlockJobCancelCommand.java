package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-cancel, returns=null, data={device=str, *force=bool}}
public class BlockJobCancelCommand extends QApiCommand<BlockJobCancelCommand.Arguments, BlockJobCancelCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("force")
		@CheckForNull public boolean force;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockJobCancelCommand(@Nonnull BlockJobCancelCommand.Arguments argument) {
		super("block-job-cancel", Response.class, argument);
	}
}
