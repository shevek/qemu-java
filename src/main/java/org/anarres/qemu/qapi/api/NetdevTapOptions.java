package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NetdevTapOptions, data={*ifname=str, *fd=str, *fds=str, *script=str, *downscript=str, *helper=str, *sndbuf=size, *vnet_hdr=bool, *vhost=bool, *vhostfd=str, *vhostfds=str, *vhostforce=bool, *queues=uint32}, innerTypes=null, fields=null}
public class NetdevTapOptions extends QApiObject {

	@SerializedName("ifname")
	@CheckForNull public String ifname;
	@SerializedName("fd")
	@CheckForNull public String fd;
	@SerializedName("fds")
	@CheckForNull public String fds;
	@SerializedName("script")
	@CheckForNull public String script;
	@SerializedName("downscript")
	@CheckForNull public String downscript;
	@SerializedName("helper")
	@CheckForNull public String helper;
	@SerializedName("sndbuf")
	@CheckForNull public long sndbuf;
	@SerializedName("vnet_hdr")
	@CheckForNull public boolean vnetHdr;
	@SerializedName("vhost")
	@CheckForNull public boolean vhost;
	@SerializedName("vhostfd")
	@CheckForNull public String vhostfd;
	@SerializedName("vhostfds")
	@CheckForNull public String vhostfds;
	@SerializedName("vhostforce")
	@CheckForNull public boolean vhostforce;
	@SerializedName("queues")
	@CheckForNull public long queues;
}
