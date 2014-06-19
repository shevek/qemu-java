package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=PciMemoryRange, data={base=int, limit=int}, innerTypes=null}
public class PciMemoryRange extends QApiType {

	@SerializedName("base")
	@Nonnull public long base;
	@SerializedName("limit")
	@Nonnull public long limit;
}
