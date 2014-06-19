package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=LostTickPolicy, data=[discard, delay, merge, slew], fields=null}
public enum LostTickPolicy {
	@SerializedName("discard")
	discard,
	@SerializedName("delay")
	delay,
	@SerializedName("merge")
	merge,
	@SerializedName("slew")
	slew,
	__UNKNOWN;
}
