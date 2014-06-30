package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=ACPISlotType, data=[DIMM], fields=null}
public enum ACPISlotType {
	@SerializedName("DIMM")
	DIMM,
	__UNKNOWN;
}
