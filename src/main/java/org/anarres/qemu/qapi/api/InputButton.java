package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=InputButton, data=[Left, Middle, Right, WheelUp, WheelDown], fields=null}
public enum InputButton {
	@SerializedName("Left")
	Left,
	@SerializedName("Middle")
	Middle,
	@SerializedName("Right")
	Right,
	@SerializedName("WheelUp")
	WheelUp,
	@SerializedName("WheelDown")
	WheelDown,
	__UNKNOWN;
}
