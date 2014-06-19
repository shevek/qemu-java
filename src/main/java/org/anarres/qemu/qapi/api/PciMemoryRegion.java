package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=PciMemoryRegion, data={bar=int, type=str, address=int, size=int, *prefetch=bool, *mem_type_64=bool}, innerTypes=null}
public class PciMemoryRegion extends QApiType {

	@SerializedName("bar")
	@Nonnull public long bar;
	@SerializedName("type")
	@Nonnull public String type;
	@SerializedName("address")
	@Nonnull public long address;
	@SerializedName("size")
	@Nonnull public long size;
	@SerializedName("prefetch")
	@CheckForNull public boolean prefetch;
	@SerializedName("mem_type_64")
	@CheckForNull public boolean memType64;
}
