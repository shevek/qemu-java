package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-complete, returns=null, data={device=str}}
public class BlockJobCompleteCommand extends QApiCommand<BlockJobCompleteCommand.BlockJobCompleteArguments, BlockJobCompleteCommand.Response> {
	public static class BlockJobCompleteArguments {
		@SerializedName("device")
		@Nonnull public String device;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockJobCompleteCommand(@Nonnull BlockJobCompleteCommand.BlockJobCompleteArguments argument) {
		super("block-job-complete", Response.class, argument);
	}
}
