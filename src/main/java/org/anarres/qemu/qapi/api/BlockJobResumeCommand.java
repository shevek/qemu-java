package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-resume, returns=null, data={device=str}}
public class BlockJobResumeCommand extends QApiCommand<BlockJobResumeCommand.BlockJobResumeArguments, Void> {
	public static class BlockJobResumeArguments {
		@SerializedName("device")
		@Nonnull public String device;
	}

	public BlockJobResumeCommand(@Nonnull BlockJobResumeCommand.BlockJobResumeArguments argument) {
		super("block-job-resume", new TypeToken<Void>() {}, argument);
	}
}
