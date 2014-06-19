package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=NewImageMode, data=[existing, absolute-paths], fields=null}
public enum NewImageMode {
	@SerializedName("existing")
	existing,
	@SerializedName("absolute-paths")
	absolute_paths,
	__UNKNOWN;
}
