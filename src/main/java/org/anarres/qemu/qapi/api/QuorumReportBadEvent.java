package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=QUORUM_REPORT_BAD, data={*error=str, node-name=str, sector-num=int, sector-count=int}}
public class QuorumReportBadEvent extends QApiEvent {
	@SerializedName("error")
	@CheckForNull public String error;
	@SerializedName("node-name")
	@Nonnull public String nodeName;
	@SerializedName("sector-num")
	@Nonnull public long sectorNum;
	@SerializedName("sector-count")
	@Nonnull public long sectorCount;
}
