package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=BLOCK_JOB_READY, data={type=BlockJobType, device=str, len=int, offset=int, speed=int}}
public class BlockJobReadyEvent extends QApiEvent {
	@SerializedName("type")
	@Nonnull public BlockJobType type;
	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("len")
	@Nonnull public long len;
	@SerializedName("offset")
	@Nonnull public long offset;
	@SerializedName("speed")
	@Nonnull public long speed;
}
