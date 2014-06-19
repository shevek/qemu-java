package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=ErrorClass, data=[GenericError, CommandNotFound, DeviceEncrypted, DeviceNotActive, DeviceNotFound, KVMMissingCap], fields=null}
public enum ErrorClass {
	@SerializedName("GenericError")
	GenericError,
	@SerializedName("CommandNotFound")
	CommandNotFound,
	@SerializedName("DeviceEncrypted")
	DeviceEncrypted,
	@SerializedName("DeviceNotActive")
	DeviceNotActive,
	@SerializedName("DeviceNotFound")
	DeviceNotFound,
	@SerializedName("KVMMissingCap")
	KVMMissingCap,
	__UNKNOWN;
}
