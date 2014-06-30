package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=NetworkAddressFamily, data=[ipv4, ipv6, unix, unknown], fields=null}
public enum NetworkAddressFamily {
	@SerializedName("ipv4")
	ipv4,
	@SerializedName("ipv6")
	ipv6,
	@SerializedName("unix")
	unix,
	@SerializedName("unknown")
	unknown,
	__UNKNOWN;
}
