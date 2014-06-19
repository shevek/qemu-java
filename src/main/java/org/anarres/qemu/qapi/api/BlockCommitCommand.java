package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-commit, returns=null, data={device=str, *base=str, top=str, *speed=int}}
public class BlockCommitCommand extends QApiCommand<BlockCommitCommand.BlockCommitArguments, Void> {
	public static class BlockCommitArguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("base")
		@CheckForNull public String base;
		@SerializedName("top")
		@Nonnull public String top;
		@SerializedName("speed")
		@CheckForNull public long speed;
	}

	public BlockCommitCommand(@Nonnull BlockCommitCommand.BlockCommitArguments argument) {
		super("block-commit", new TypeToken<Void>() {}, argument);
	}
}
