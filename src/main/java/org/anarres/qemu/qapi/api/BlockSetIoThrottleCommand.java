package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block_set_io_throttle, returns=null, data={device=str, bps=int, bps_rd=int, bps_wr=int, iops=int, iops_rd=int, iops_wr=int, *bps_max=int, *bps_rd_max=int, *bps_wr_max=int, *iops_max=int, *iops_rd_max=int, *iops_wr_max=int, *iops_size=int}}
public class BlockSetIoThrottleCommand extends QApiCommand<BlockSetIoThrottleCommand.BlockSetIoThrottleArguments, BlockSetIoThrottleCommand.Response> {
	public static class BlockSetIoThrottleArguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("bps")
		@Nonnull public long bps;
		@SerializedName("bps_rd")
		@Nonnull public long bpsRd;
		@SerializedName("bps_wr")
		@Nonnull public long bpsWr;
		@SerializedName("iops")
		@Nonnull public long iops;
		@SerializedName("iops_rd")
		@Nonnull public long iopsRd;
		@SerializedName("iops_wr")
		@Nonnull public long iopsWr;
		@SerializedName("bps_max")
		@CheckForNull public long bpsMax;
		@SerializedName("bps_rd_max")
		@CheckForNull public long bpsRdMax;
		@SerializedName("bps_wr_max")
		@CheckForNull public long bpsWrMax;
		@SerializedName("iops_max")
		@CheckForNull public long iopsMax;
		@SerializedName("iops_rd_max")
		@CheckForNull public long iopsRdMax;
		@SerializedName("iops_wr_max")
		@CheckForNull public long iopsWrMax;
		@SerializedName("iops_size")
		@CheckForNull public long iopsSize;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockSetIoThrottleCommand(@Nonnull BlockSetIoThrottleCommand.BlockSetIoThrottleArguments argument) {
		super("block_set_io_throttle", Response.class, argument);
	}
}
