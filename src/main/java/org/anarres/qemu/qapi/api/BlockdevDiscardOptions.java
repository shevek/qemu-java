package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockdevDiscardOptions, data=[ignore, unmap], fields=null}
public enum BlockdevDiscardOptions {
	@SerializedName("ignore")
	ignore,
	@SerializedName("unmap")
	unmap,
	__UNKNOWN;
}
