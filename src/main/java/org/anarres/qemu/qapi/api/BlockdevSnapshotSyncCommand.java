package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=blockdev-snapshot-sync, returns=null, data=BlockdevSnapshot}
public class BlockdevSnapshotSyncCommand extends QApiCommand<BlockdevSnapshot, BlockdevSnapshotSyncCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public BlockdevSnapshotSyncCommand(@Nonnull BlockdevSnapshot argument) {
		super("blockdev-snapshot-sync", Response.class, argument);
	}
}
