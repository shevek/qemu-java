package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=WatchdogExpirationAction, data=[reset, shutdown, poweroff, pause, debug, none], fields=null}
public enum WatchdogExpirationAction {
	@SerializedName("reset")
	reset,
	@SerializedName("shutdown")
	shutdown,
	@SerializedName("poweroff")
	poweroff,
	@SerializedName("pause")
	pause,
	@SerializedName("debug")
	debug,
	@SerializedName("none")
	none,
	__UNKNOWN;
}
