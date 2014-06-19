package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=DataFormat, data=[utf8, base64], fields=null}
public enum DataFormat {
	@SerializedName("utf8")
	utf8,
	@SerializedName("base64")
	base64,
	__UNKNOWN;
}
