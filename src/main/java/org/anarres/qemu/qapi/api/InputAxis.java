package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=InputAxis, data=[X, Y], fields=null}
public enum InputAxis {
	@SerializedName("X")
	X,
	@SerializedName("Y")
	Y,
	__UNKNOWN;
}
