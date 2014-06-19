package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=TpmType, data=[passthrough], fields=null}
public enum TpmType {
	@SerializedName("passthrough")
	passthrough,
	__UNKNOWN;
}
