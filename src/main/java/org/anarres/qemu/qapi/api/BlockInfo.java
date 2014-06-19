package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockInfo, data={device=str, type=str, removable=bool, locked=bool, *inserted=BlockDeviceInfo, *tray_open=bool, *io-status=BlockDeviceIoStatus, *dirty-bitmaps=[BlockDirtyInfo]}, innerTypes=null, fields=null}
public class BlockInfo extends QApiObject {

	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("type")
	@Nonnull public String type;
	@SerializedName("removable")
	@Nonnull public boolean removable;
	@SerializedName("locked")
	@Nonnull public boolean locked;
	@SerializedName("inserted")
	@CheckForNull public BlockDeviceInfo inserted;
	@SerializedName("tray_open")
	@CheckForNull public boolean trayOpen;
	@SerializedName("io-status")
	@CheckForNull public BlockDeviceIoStatus ioStatus;
	@SerializedName("dirty-bitmaps")
	@CheckForNull public List<BlockDirtyInfo> dirtyBitmaps;
}
