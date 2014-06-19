package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-cancel, returns=null, data={device=str, *force=bool}}
public class BlockJobCancelCommand extends QApiCommand<BlockJobCancelCommand.BlockJobCancelArguments, Void> {
	public static class BlockJobCancelArguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("force")
		@CheckForNull public boolean force;
	}

	public BlockJobCancelCommand(@Nonnull BlockJobCancelCommand.BlockJobCancelArguments argument) {
		super("block-job-cancel", new TypeToken<Void>() {}, argument);
	}
}
