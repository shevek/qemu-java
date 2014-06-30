package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=SPICE_INITIALIZED, data={server=SpiceServerInfo, client=SpiceChannel}}
public class SpiceInitializedEvent extends QApiEvent {
	@SerializedName("server")
	@Nonnull public SpiceServerInfo server;
	@SerializedName("client")
	@Nonnull public SpiceChannel client;
}
