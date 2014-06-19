package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=RxState, data=[normal, none, all], fields=null}
public enum RxState {
	@SerializedName("normal")
	normal,
	@SerializedName("none")
	none,
	@SerializedName("all")
	all,
	__UNKNOWN;
}
