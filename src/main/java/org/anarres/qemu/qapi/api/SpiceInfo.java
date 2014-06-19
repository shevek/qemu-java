package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=SpiceInfo, data={enabled=bool, migrated=bool, *host=str, *port=int, *tls-port=int, *auth=str, *compiled-version=str, mouse-mode=SpiceQueryMouseMode, *channels=[SpiceChannel]}, innerTypes=null, fields=null}
public class SpiceInfo extends QApiType {

	@SerializedName("enabled")
	@Nonnull public boolean enabled;
	@SerializedName("migrated")
	@Nonnull public boolean migrated;
	@SerializedName("host")
	@CheckForNull public String host;
	@SerializedName("port")
	@CheckForNull public long port;
	@SerializedName("tls-port")
	@CheckForNull public long tlsPort;
	@SerializedName("auth")
	@CheckForNull public String auth;
	@SerializedName("compiled-version")
	@CheckForNull public String compiledVersion;
	@SerializedName("mouse-mode")
	@Nonnull public SpiceQueryMouseMode mouseMode;
	@SerializedName("channels")
	@CheckForNull public List<SpiceChannel> channels;
}
