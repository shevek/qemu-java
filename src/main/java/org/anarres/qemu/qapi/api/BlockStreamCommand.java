package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=block-stream, returns=null, data={device=str, *base=str, *backing-file=str, *speed=int, *on-error=BlockdevOnError}}</pre></p>
 */
// QApiCommandDescriptor{name=block-stream, returns=null, data={device=str, *base=str, *backing-file=str, *speed=int, *on-error=BlockdevOnError}}
public class BlockStreamCommand extends QApiCommand<BlockStreamCommand.Arguments, BlockStreamCommand.Response> {
	/** Compound arguments to a BlockStreamCommand. */
	public static class Arguments {

		@SerializedName("device")
		@Nonnull
		public java.lang.String device;
		@SerializedName("base")
		@CheckForNull
		public java.lang.String base;
		@SerializedName("backing-file")
		@CheckForNull
		public java.lang.String backingFile;
		@SerializedName("speed")
		@CheckForNull
		public long speed;
		@SerializedName("on-error")
		@CheckForNull
		public BlockdevOnError onError;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String base, java.lang.String backingFile, long speed, BlockdevOnError onError) {
			this.device = device;
			this.base = base;
			this.backingFile = backingFile;
			this.speed = speed;
			this.onError = onError;
		}
	}

	/** Response to a BlockStreamCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockStreamCommand. */
	public BlockStreamCommand(@Nonnull BlockStreamCommand.Arguments argument) {
		super("block-stream", Response.class, argument);
	}

	public BlockStreamCommand(
		java.lang.String device, java.lang.String base, java.lang.String backingFile, long speed, BlockdevOnError onError			) {
		this(new Arguments(device, base, backingFile, speed, onError));
	}
}
