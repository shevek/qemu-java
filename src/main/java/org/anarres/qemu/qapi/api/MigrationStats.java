package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=MigrationStats, data={transferred=int, remaining=int, total=int, duplicate=int, skipped=int, normal=int, normal-bytes=int, dirty-pages-rate=int, mbps=number, dirty-sync-count=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=MigrationStats, data={transferred=int, remaining=int, total=int, duplicate=int, skipped=int, normal=int, normal-bytes=int, dirty-pages-rate=int, mbps=number, dirty-sync-count=int}, innerTypes=null}
public class MigrationStats extends QApiType {

	@SerializedName("transferred")
	@Nonnull
	public long transferred;
	@SerializedName("remaining")
	@Nonnull
	public long remaining;
	@SerializedName("total")
	@Nonnull
	public long total;
	@SerializedName("duplicate")
	@Nonnull
	public long duplicate;
	@SerializedName("skipped")
	@Nonnull
	public long skipped;
	@SerializedName("normal")
	@Nonnull
	public long normal;
	@SerializedName("normal-bytes")
	@Nonnull
	public long normalBytes;
	@SerializedName("dirty-pages-rate")
	@Nonnull
	public long dirtyPagesRate;
	@SerializedName("mbps")
	@Nonnull
	public double mbps;
	@SerializedName("dirty-sync-count")
	@Nonnull
	public long dirtySyncCount;

	public MigrationStats() {
	}

	public MigrationStats(long transferred, long remaining, long total, long duplicate, long skipped, long normal, long normalBytes, long dirtyPagesRate, double mbps, long dirtySyncCount) {
		this.transferred = transferred;
		this.remaining = remaining;
		this.total = total;
		this.duplicate = duplicate;
		this.skipped = skipped;
		this.normal = normal;
		this.normalBytes = normalBytes;
		this.dirtyPagesRate = dirtyPagesRate;
		this.mbps = mbps;
		this.dirtySyncCount = dirtySyncCount;
	}
}