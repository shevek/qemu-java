package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=VncInfo, data={enabled=bool, *host=str, *family=str, *service=str, *auth=str, *clients=[VncClientInfo]}, innerTypes=null, fields=null}
public class VncInfo extends QApiObject {

	@SerializedName("enabled")
	@Nonnull public boolean enabled;
	@SerializedName("host")
	@CheckForNull public String host;
	@SerializedName("family")
	@CheckForNull public String family;
	@SerializedName("service")
	@CheckForNull public String service;
	@SerializedName("auth")
	@CheckForNull public String auth;
	@SerializedName("clients")
	@CheckForNull public List<VncClientInfo> clients;
}
