package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=DEVICE_TRAY_MOVED, data={device=str, tray-open=bool}}
public class DeviceTrayMovedEvent extends QApiEvent {
	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("tray-open")
	@Nonnull public boolean trayOpen;
}
