package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NetdevSocketOptions, data={*fd=str, *listen=str, *connect=str, *mcast=str, *localaddr=str, *udp=str}, innerTypes=null, fields=null}
public class NetdevSocketOptions extends QApiType {

	@SerializedName("fd")
	@CheckForNull public String fd;
	@SerializedName("listen")
	@CheckForNull public String listen;
	@SerializedName("connect")
	@CheckForNull public String connect;
	@SerializedName("mcast")
	@CheckForNull public String mcast;
	@SerializedName("localaddr")
	@CheckForNull public String localaddr;
	@SerializedName("udp")
	@CheckForNull public String udp;
}
