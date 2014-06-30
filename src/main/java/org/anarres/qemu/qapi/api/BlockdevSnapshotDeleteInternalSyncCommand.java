package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=blockdev-snapshot-delete-internal-sync, returns=SnapshotInfo, data={device=str, *id=str, *name=str}}
public class BlockdevSnapshotDeleteInternalSyncCommand extends QApiCommand<BlockdevSnapshotDeleteInternalSyncCommand.Arguments, BlockdevSnapshotDeleteInternalSyncCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@Nonnull public String device;
		@SerializedName("id")
		@CheckForNull public String id;
		@SerializedName("name")
		@CheckForNull public String name;
	}

	public static class Response extends QApiResponse<SnapshotInfo> {
	}

	public BlockdevSnapshotDeleteInternalSyncCommand(@Nonnull BlockdevSnapshotDeleteInternalSyncCommand.Arguments argument) {
		super("blockdev-snapshot-delete-internal-sync", Response.class, argument);
	}
}
