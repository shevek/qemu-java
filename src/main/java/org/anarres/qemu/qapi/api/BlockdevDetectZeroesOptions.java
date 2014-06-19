package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockdevDetectZeroesOptions, data=[off, on, unmap], fields=null}
public enum BlockdevDetectZeroesOptions {
	@SerializedName("off")
	off,
	@SerializedName("on")
	on,
	@SerializedName("unmap")
	unmap,
	__UNKNOWN;
}
