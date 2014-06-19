package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=drive-mirror, returns=null, data={device=str, target=str, *format=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *granularity=uint32, *buf-size=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError}}
public class DriveMirrorCommand extends QApiCommand<DriveMirrorCommand.DriveMirrorArguments, Void> {
	public static class DriveMirrorArguments {
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
		@SerializedName("granularity")
		@CheckForNull public long granularity;
		@SerializedName("buf-size")
		@CheckForNull public long bufSize;
		@SerializedName("on-source-error")
		@CheckForNull public BlockdevOnError onSourceError;
		@SerializedName("on-target-error")
		@CheckForNull public BlockdevOnError onTargetError;
	}

	public DriveMirrorCommand(@Nonnull DriveMirrorCommand.DriveMirrorArguments argument) {
		super("drive-mirror", new TypeToken<Void>() {}, argument);
	}
}
