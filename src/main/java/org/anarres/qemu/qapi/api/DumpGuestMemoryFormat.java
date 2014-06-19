package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=DumpGuestMemoryFormat, data=[elf, kdump-zlib, kdump-lzo, kdump-snappy], fields=null}
public enum DumpGuestMemoryFormat {
	@SerializedName("elf")
	elf,
	@SerializedName("kdump-zlib")
	kdump_zlib,
	@SerializedName("kdump-lzo")
	kdump_lzo,
	@SerializedName("kdump-snappy")
	kdump_snappy,
	__UNKNOWN;
}
