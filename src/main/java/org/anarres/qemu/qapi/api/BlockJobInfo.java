package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockJobInfo, data={type=str, device=str, len=int, offset=int, busy=bool, paused=bool, speed=int, io-status=BlockDeviceIoStatus}, innerTypes=null, fields=null}
public class BlockJobInfo extends QApiType {

	@SerializedName("type")
	@Nonnull public String type;
	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("len")
	@Nonnull public long len;
	@SerializedName("offset")
	@Nonnull public long offset;
	@SerializedName("busy")
	@Nonnull public boolean busy;
	@SerializedName("paused")
	@Nonnull public boolean paused;
	@SerializedName("speed")
	@Nonnull public long speed;
	@SerializedName("io-status")
	@Nonnull public BlockDeviceIoStatus ioStatus;
}
