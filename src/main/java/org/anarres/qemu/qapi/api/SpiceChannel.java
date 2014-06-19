package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=SpiceChannel, data={host=str, family=str, port=str, connection-id=int, channel-type=int, channel-id=int, tls=bool}, innerTypes=null, fields=null}
public class SpiceChannel extends QApiType {

	@SerializedName("host")
	@Nonnull public String host;
	@SerializedName("family")
	@Nonnull public String family;
	@SerializedName("port")
	@Nonnull public String port;
	@SerializedName("connection-id")
	@Nonnull public long connectionId;
	@SerializedName("channel-type")
	@Nonnull public long channelType;
	@SerializedName("channel-id")
	@Nonnull public long channelId;
	@SerializedName("tls")
	@Nonnull public boolean tls;
}
