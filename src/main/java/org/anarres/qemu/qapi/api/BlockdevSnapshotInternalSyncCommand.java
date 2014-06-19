package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=blockdev-snapshot-internal-sync, returns=null, data=BlockdevSnapshotInternal}
public class BlockdevSnapshotInternalSyncCommand extends QApiCommand<BlockdevSnapshotInternal, Void> {

	public BlockdevSnapshotInternalSyncCommand(@Nonnull BlockdevSnapshotInternal argument) {
		super("blockdev-snapshot-internal-sync", new TypeToken<Void>() {}, argument);
	}
}
