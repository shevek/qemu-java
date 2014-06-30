package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockErrorAction, data=[ignore, report, stop], fields=null}
public enum BlockErrorAction {
	@SerializedName("ignore")
	ignore,
	@SerializedName("report")
	report,
	@SerializedName("stop")
	stop,
	__UNKNOWN;
}
