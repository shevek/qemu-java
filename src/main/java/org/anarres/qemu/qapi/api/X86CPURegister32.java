package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=X86CPURegister32, data=[EAX, EBX, ECX, EDX, ESP, EBP, ESI, EDI], fields=null}
public enum X86CPURegister32 {
	@SerializedName("EAX")
	EAX,
	@SerializedName("EBX")
	EBX,
	@SerializedName("ECX")
	ECX,
	@SerializedName("EDX")
	EDX,
	@SerializedName("ESP")
	ESP,
	@SerializedName("EBP")
	EBP,
	@SerializedName("ESI")
	ESI,
	@SerializedName("EDI")
	EDI,
	__UNKNOWN;
}
