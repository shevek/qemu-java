package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=TpmModel, data=[tpm-tis], fields=null}
public enum TpmModel {
	@SerializedName("tpm-tis")
	tpm_tis,
	__UNKNOWN;
}
