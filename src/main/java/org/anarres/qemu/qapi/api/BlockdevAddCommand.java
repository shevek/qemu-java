package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=blockdev-add, returns=null, data={options=BlockdevOptions}}
public class BlockdevAddCommand extends QApiCommand<BlockdevAddCommand.BlockdevAddArguments, Void> {
	public static class BlockdevAddArguments {
		@SerializedName("options")
		@Nonnull public BlockdevOptions options;
	}

	public BlockdevAddCommand(@Nonnull BlockdevAddCommand.BlockdevAddArguments argument) {
		super("blockdev-add", new TypeToken<Void>() {}, argument);
	}
}
