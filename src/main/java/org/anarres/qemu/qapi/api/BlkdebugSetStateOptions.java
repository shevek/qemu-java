package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=BlkdebugSetStateOptions, data={event=BlkdebugEvent, *state=int, new_state=int}, innerTypes=null}
public class BlkdebugSetStateOptions extends QApiType {

	@SerializedName("event")
	@Nonnull public BlkdebugEvent event;
	@SerializedName("state")
	@CheckForNull public long state;
	@SerializedName("new_state")
	@Nonnull public long newState;
}
