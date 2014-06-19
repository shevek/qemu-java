package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block_resize, returns=null, data={*device=str, *node-name=str, size=int}}
public class BlockResizeCommand extends QApiCommand<BlockResizeCommand.BlockResizeArguments, Void> {
	public static class BlockResizeArguments {
		@SerializedName("device")
		@CheckForNull public String device;
		@SerializedName("node-name")
		@CheckForNull public String nodeName;
		@SerializedName("size")
		@Nonnull public long size;
	}

	public BlockResizeCommand(@Nonnull BlockResizeCommand.BlockResizeArguments argument) {
		super("block_resize", new TypeToken<Void>() {}, argument);
	}
}
