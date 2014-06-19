package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=MigrationInfo, data={*status=str, *ram=MigrationStats, *disk=MigrationStats, *xbzrle-cache=XBZRLECacheStats, *total-time=int, *expected-downtime=int, *downtime=int, *setup-time=int}, innerTypes=null, fields=null}
public class MigrationInfo extends QApiType {

	@SerializedName("status")
	@CheckForNull public String status;
	@SerializedName("ram")
	@CheckForNull public MigrationStats ram;
	@SerializedName("disk")
	@CheckForNull public MigrationStats disk;
	@SerializedName("xbzrle-cache")
	@CheckForNull public XBZRLECacheStats xbzrleCache;
	@SerializedName("total-time")
	@CheckForNull public long totalTime;
	@SerializedName("expected-downtime")
	@CheckForNull public long expectedDowntime;
	@SerializedName("downtime")
	@CheckForNull public long downtime;
	@SerializedName("setup-time")
	@CheckForNull public long setupTime;
}
