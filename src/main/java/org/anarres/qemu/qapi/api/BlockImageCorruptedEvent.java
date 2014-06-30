package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=BLOCK_IMAGE_CORRUPTED, data={device=str, msg=str, *offset=int, *size=int}}
public class BlockImageCorruptedEvent extends QApiEvent {
	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("msg")
	@Nonnull public String msg;
	@SerializedName("offset")
	@CheckForNull public long offset;
	@SerializedName("size")
	@CheckForNull public long size;
}
