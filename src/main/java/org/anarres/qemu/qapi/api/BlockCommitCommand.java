package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-commit, returns=null, data={device=str, *base=str, top=str, *speed=int}}
public class BlockCommitCommand extends QApiCommand<BlockCommitCommand.Arguments, BlockCommitCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("base")
		@CheckForNull public String base;
		@SerializedName("top")
		@Nonnull public String top;
		@SerializedName("speed")
		@CheckForNull public long speed;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockCommitCommand(@Nonnull BlockCommitCommand.Arguments argument) {
		super("block-commit", Response.class, argument);
	}
}
