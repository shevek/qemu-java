package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockDeviceMapEntry, data={start=int, length=int, depth=int, zero=bool, data=bool, *offset=int}, innerTypes=null}
public class BlockDeviceMapEntry extends QApiType {

	@SerializedName("start")
	@Nonnull public long start;
	@SerializedName("length")
	@Nonnull public long length;
	@SerializedName("depth")
	@Nonnull public long depth;
	@SerializedName("zero")
	@Nonnull public boolean zero;
	@SerializedName("data")
	@Nonnull public boolean data;
	@SerializedName("offset")
	@CheckForNull public long offset;
}
