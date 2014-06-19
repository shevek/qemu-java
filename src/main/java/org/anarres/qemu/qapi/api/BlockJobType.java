package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=BlockJobType, data=[commit, stream, mirror, backup], fields=null}
public enum BlockJobType {
	@SerializedName("commit")
	commit,
	@SerializedName("stream")
	stream,
	@SerializedName("mirror")
	mirror,
	@SerializedName("backup")
	backup,
	__UNKNOWN;
}
