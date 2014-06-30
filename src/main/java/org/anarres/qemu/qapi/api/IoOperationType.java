package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=IoOperationType, data=[read, write], fields=null}
public enum IoOperationType {
	@SerializedName("read")
	read,
	@SerializedName("write")
	write,
	__UNKNOWN;
}
