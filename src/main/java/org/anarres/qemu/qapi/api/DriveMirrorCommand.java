package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=drive-mirror, returns=null, data={device=str, target=str, *format=str, *node-name=str, *replaces=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *granularity=uint32, *buf-size=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError}}
public class DriveMirrorCommand extends QApiCommand<DriveMirrorCommand.Arguments, DriveMirrorCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("target")
		@Nonnull public String target;
		@SerializedName("format")
		@CheckForNull public String format;
		@SerializedName("node-name")
		@CheckForNull public String nodeName;
		@SerializedName("replaces")
		@CheckForNull public String replaces;
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

	public static class Response extends QApiResponse<Void> {
	}

	public DriveMirrorCommand(@Nonnull DriveMirrorCommand.Arguments argument) {
		super("drive-mirror", Response.class, argument);
	}
}
