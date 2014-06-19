package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=DriveBackup, data={device=str, target=str, *format=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError}, innerTypes=null}
public class DriveBackup extends QApiType {

	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("target")
	@Nonnull public String target;
	@SerializedName("format")
	@CheckForNull public String format;
	@SerializedName("sync")
	@Nonnull public MirrorSyncMode sync;
	@SerializedName("mode")
	@CheckForNull public NewImageMode mode;
	@SerializedName("speed")
	@CheckForNull public long speed;
	@SerializedName("on-source-error")
	@CheckForNull public BlockdevOnError onSourceError;
	@SerializedName("on-target-error")
	@CheckForNull public BlockdevOnError onTargetError;
}
