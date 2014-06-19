package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockDirtyInfo, data={count=int, granularity=int}, innerTypes=null, fields=null}
public class BlockDirtyInfo extends QApiType {

	@SerializedName("count")
	@Nonnull public long count;
	@SerializedName("granularity")
	@Nonnull public long granularity;
}
