package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=NIC_RX_FILTER_CHANGED, data={*name=str, path=str}}
public class NicRxFilterChangedEvent extends QApiEvent {
	@SerializedName("name")
	@CheckForNull public String name;
	@SerializedName("path")
	@Nonnull public String path;
}
