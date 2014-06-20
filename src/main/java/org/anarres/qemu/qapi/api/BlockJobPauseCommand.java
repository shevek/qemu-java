package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-pause, returns=null, data={device=str}}
public class BlockJobPauseCommand extends QApiCommand<BlockJobPauseCommand.BlockJobPauseArguments, BlockJobPauseCommand.Response> {
	public static class BlockJobPauseArguments {
		@SerializedName("device")
		@Nonnull public String device;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockJobPauseCommand(@Nonnull BlockJobPauseCommand.BlockJobPauseArguments argument) {
		super("block-job-pause", Response.class, argument);
	}
}
