package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=TransactionAction, data={blockdev-snapshot-sync=BlockdevSnapshot, drive-backup=DriveBackup, abort=Abort, blockdev-snapshot-internal-sync=BlockdevSnapshotInternal}, innerTypes=null, fields=null}
public class TransactionAction extends QApiObject {
	@SerializedName("blockdev-snapshot-sync")
	@Nonnull public BlockdevSnapshot blockdevSnapshotSync;
	@SerializedName("drive-backup")
	@Nonnull public DriveBackup driveBackup;
	@SerializedName("abort")
	@Nonnull public Abort abort;
	@SerializedName("blockdev-snapshot-internal-sync")
	@Nonnull public BlockdevSnapshotInternal blockdevSnapshotInternalSync;

/*
	public boolean isUnion() {
		ONE: {
			if (blockdevSnapshotSync != null)
				break ONE;
			if (driveBackup != null)
				break ONE;
			if (abort != null)
				break ONE;
			if (blockdevSnapshotInternalSync != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (blockdevSnapshotSync != null)
				return false;	// More than one field is set.
			if (driveBackup != null)
				return false;	// More than one field is set.
			if (abort != null)
				return false;	// More than one field is set.
			if (blockdevSnapshotInternalSync != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
