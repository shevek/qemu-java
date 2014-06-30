package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=DEVICE_DELETED, data={*device=str, path=str}}
public class DeviceDeletedEvent extends QApiEvent {
	@SerializedName("device")
	@CheckForNull public String device;
	@SerializedName("path")
	@Nonnull public String path;
}
