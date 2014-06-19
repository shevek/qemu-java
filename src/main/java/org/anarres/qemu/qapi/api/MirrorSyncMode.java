package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=MirrorSyncMode, data=[top, full, none], fields=null}
public enum MirrorSyncMode {
	@SerializedName("top")
	top,
	@SerializedName("full")
	full,
	@SerializedName("none")
	none,
	__UNKNOWN;
}
