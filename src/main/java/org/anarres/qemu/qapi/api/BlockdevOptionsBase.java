package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsBase, data={driver=BlockdevDriver, *id=str, *node-name=str, *discard=BlockdevDiscardOptions, *cache=BlockdevCacheOptions, *aio=BlockdevAioOptions, *rerror=BlockdevOnError, *werror=BlockdevOnError, *read-only=bool, *detect-zeroes=BlockdevDetectZeroesOptions}, innerTypes=null}
public class BlockdevOptionsBase extends QApiType {

	@SerializedName("driver")
	@Nonnull public BlockdevDriver driver;
	@SerializedName("id")
	@CheckForNull public String id;
	@SerializedName("node-name")
	@CheckForNull public String nodeName;
	@SerializedName("discard")
	@CheckForNull public BlockdevDiscardOptions discard;
	@SerializedName("cache")
	@CheckForNull public BlockdevCacheOptions cache;
	@SerializedName("aio")
	@CheckForNull public BlockdevAioOptions aio;
	@SerializedName("rerror")
	@CheckForNull public BlockdevOnError rerror;
	@SerializedName("werror")
	@CheckForNull public BlockdevOnError werror;
	@SerializedName("read-only")
	@CheckForNull public boolean readOnly;
	@SerializedName("detect-zeroes")
	@CheckForNull public BlockdevDetectZeroesOptions detectZeroes;
}
