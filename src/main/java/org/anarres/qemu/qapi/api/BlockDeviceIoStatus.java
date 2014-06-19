package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockDeviceIoStatus, data=[ok, failed, nospace], fields=null}
public enum BlockDeviceIoStatus {
	@SerializedName("ok")
	ok,
	@SerializedName("failed")
	failed,
	@SerializedName("nospace")
	nospace,
	__UNKNOWN;
}
