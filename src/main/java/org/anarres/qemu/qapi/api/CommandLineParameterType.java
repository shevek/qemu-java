package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=CommandLineParameterType, data=[string, boolean, number, size], fields=null}
public enum CommandLineParameterType {
	@SerializedName("string")
	string,
	@SerializedName("boolean")
	_boolean,
	@SerializedName("number")
	number,
	@SerializedName("size")
	size,
	__UNKNOWN;
}
