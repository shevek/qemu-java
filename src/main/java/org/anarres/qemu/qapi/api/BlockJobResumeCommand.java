package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-resume, returns=null, data={device=str}}
public class BlockJobResumeCommand extends QApiCommand<BlockJobResumeCommand.BlockJobResumeArguments, BlockJobResumeCommand.Response> {
	public static class BlockJobResumeArguments {
		@SerializedName("device")
		@Nonnull public String device;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockJobResumeCommand(@Nonnull BlockJobResumeCommand.BlockJobResumeArguments argument) {
		super("block-job-resume", Response.class, argument);
	}
}
