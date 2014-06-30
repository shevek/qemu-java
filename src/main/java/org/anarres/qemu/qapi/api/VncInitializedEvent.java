package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=VNC_INITIALIZED, data={server=VncServerInfo, client=VncClientInfo}}
public class VncInitializedEvent extends QApiEvent {
	@SerializedName("server")
	@Nonnull public VncServerInfo server;
	@SerializedName("client")
	@Nonnull public VncClientInfo client;
}
