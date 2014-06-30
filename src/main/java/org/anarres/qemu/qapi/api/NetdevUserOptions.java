package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=NetdevUserOptions, data={*hostname=str, *restrict=bool, *ip=str, *net=str, *host=str, *tftp=str, *bootfile=str, *dhcpstart=str, *dns=str, *dnssearch=[String], *smb=str, *smbserver=str, *hostfwd=[String], *guestfwd=[String]}, innerTypes=null}
public class NetdevUserOptions extends QApiType {

	@SerializedName("hostname")
	@CheckForNull public String hostname;
	@SerializedName("restrict")
	@CheckForNull public boolean restrict;
	@SerializedName("ip")
	@CheckForNull public String ip;
	@SerializedName("net")
	@CheckForNull public String net;
	@SerializedName("host")
	@CheckForNull public String host;
	@SerializedName("tftp")
	@CheckForNull public String tftp;
	@SerializedName("bootfile")
	@CheckForNull public String bootfile;
	@SerializedName("dhcpstart")
	@CheckForNull public String dhcpstart;
	@SerializedName("dns")
	@CheckForNull public String dns;
	@SerializedName("dnssearch")
	@CheckForNull public List<String> dnssearch;
	@SerializedName("smb")
	@CheckForNull public String smb;
	@SerializedName("smbserver")
	@CheckForNull public String smbserver;
	@SerializedName("hostfwd")
	@CheckForNull public List<String> hostfwd;
	@SerializedName("guestfwd")
	@CheckForNull public List<String> guestfwd;
}
