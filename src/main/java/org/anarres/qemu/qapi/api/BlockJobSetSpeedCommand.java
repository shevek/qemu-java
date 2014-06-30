package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block-job-set-speed, returns=null, data={device=str, speed=int}}
public class BlockJobSetSpeedCommand extends QApiCommand<BlockJobSetSpeedCommand.Arguments, BlockJobSetSpeedCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("speed")
		@Nonnull public long speed;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockJobSetSpeedCommand(@Nonnull BlockJobSetSpeedCommand.Arguments argument) {
		super("block-job-set-speed", Response.class, argument);
	}
}
