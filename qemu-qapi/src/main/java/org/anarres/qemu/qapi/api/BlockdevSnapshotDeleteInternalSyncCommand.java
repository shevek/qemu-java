package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=blockdev-snapshot-delete-internal-sync, returns=SnapshotInfo, data={device=str, *id=str, *name=str}}</pre>
 */
// QApiCommandDescriptor{name=blockdev-snapshot-delete-internal-sync, returns=SnapshotInfo, data={device=str, *id=str, *name=str}}
public class BlockdevSnapshotDeleteInternalSyncCommand extends QApiCommand<BlockdevSnapshotDeleteInternalSyncCommand.Arguments, BlockdevSnapshotDeleteInternalSyncCommand.Response> {
	/** Compound arguments to a BlockdevSnapshotDeleteInternalSyncCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("id")
		@CheckForNull
		public java.lang.String id;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("name")
		@CheckForNull
		public java.lang.String name;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String id, java.lang.String name) {
			this.device = device;
			this.id = id;
			this.name = name;
		}
	}

	/** Response to a BlockdevSnapshotDeleteInternalSyncCommand. */
	public static class Response extends QApiResponse<SnapshotInfo> {
	}

	/** Constructs a new BlockdevSnapshotDeleteInternalSyncCommand. */
	public BlockdevSnapshotDeleteInternalSyncCommand(@Nonnull BlockdevSnapshotDeleteInternalSyncCommand.Arguments argument) {
		super("blockdev-snapshot-delete-internal-sync", Response.class, argument);
	}

	/** Constructs a new BlockdevSnapshotDeleteInternalSyncCommand. */
	public BlockdevSnapshotDeleteInternalSyncCommand(java.lang.String device, java.lang.String id, java.lang.String name) {
		this(new Arguments(device, id, name));
	}
}
