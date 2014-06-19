package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevCacheOptions, data={*writeback=bool, *direct=bool, *no-flush=bool}, innerTypes=null}
public class BlockdevCacheOptions extends QApiType {

	@SerializedName("writeback")
	@CheckForNull public boolean writeback;
	@SerializedName("direct")
	@CheckForNull public boolean direct;
	@SerializedName("no-flush")
	@CheckForNull public boolean noFlush;
}
