package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=VncInfo, data={enabled=bool, *host=str, *family=NetworkAddressFamily, *service=str, *auth=str, *clients=[VncClientInfo]}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=VncInfo, data={enabled=bool, *host=str, *family=NetworkAddressFamily, *service=str, *auth=str, *clients=[VncClientInfo]}, innerTypes=null}
public class VncInfo extends QApiType {

	@SerializedName("enabled")
	@Nonnull
	public boolean enabled;
	@SerializedName("host")
	@CheckForNull
	public java.lang.String host;
	@SerializedName("family")
	@CheckForNull
	public NetworkAddressFamily family;
	@SerializedName("service")
	@CheckForNull
	public java.lang.String service;
	@SerializedName("auth")
	@CheckForNull
	public java.lang.String auth;
	@SerializedName("clients")
	@CheckForNull
	public List<VncClientInfo> clients;

	public VncInfo() {
	}

	public VncInfo(boolean enabled, java.lang.String host, NetworkAddressFamily family, java.lang.String service, java.lang.String auth, List<VncClientInfo> clients) {
		this.enabled = enabled;
		this.host = host;
		this.family = family;
		this.service = service;
		this.auth = auth;
		this.clients = clients;
	}
}
