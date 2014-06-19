package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsBlkdebug, data={image=BlockdevRef, *config=str, *align=int, *inject-error=[BlkdebugInjectErrorOptions], *set-state=[BlkdebugSetStateOptions]}, innerTypes=null, fields=null}
public class BlockdevOptionsBlkdebug extends QApiObject {

	@SerializedName("image")
	@Nonnull public BlockdevRef image;
	@SerializedName("config")
	@CheckForNull public String config;
	@SerializedName("align")
	@CheckForNull public long align;
	@SerializedName("inject-error")
	@CheckForNull public List<BlkdebugInjectErrorOptions> injectError;
	@SerializedName("set-state")
	@CheckForNull public List<BlkdebugSetStateOptions> setState;
}
