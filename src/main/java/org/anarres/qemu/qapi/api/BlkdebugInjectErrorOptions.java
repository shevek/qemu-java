package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=BlkdebugInjectErrorOptions, data={event=BlkdebugEvent, *state=int, *errno=int, *sector=int, *once=bool, *immediately=bool}, innerTypes=null}
public class BlkdebugInjectErrorOptions extends QApiType {

	@SerializedName("event")
	@Nonnull public BlkdebugEvent event;
	@SerializedName("state")
	@CheckForNull public long state;
	@SerializedName("errno")
	@CheckForNull public long errno;
	@SerializedName("sector")
	@CheckForNull public long sector;
	@SerializedName("once")
	@CheckForNull public boolean once;
	@SerializedName("immediately")
	@CheckForNull public boolean immediately;
}
