package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockdevAioOptions, data=[threads, native], fields=null}
public enum BlockdevAioOptions {
	@SerializedName("threads")
	threads,
	@SerializedName("native")
	_native,
	__UNKNOWN;
}
