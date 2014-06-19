package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=SpiceQueryMouseMode, data=[client, server, unknown], fields=null}
public enum SpiceQueryMouseMode {
	@SerializedName("client")
	client,
	@SerializedName("server")
	server,
	@SerializedName("unknown")
	unknown,
	__UNKNOWN;
}
