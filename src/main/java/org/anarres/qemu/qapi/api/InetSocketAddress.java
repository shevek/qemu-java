package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=InetSocketAddress, data={host=str, port=str, *to=uint16, *ipv4=bool, *ipv6=bool}, innerTypes=null}
public class InetSocketAddress extends QApiType {

	@SerializedName("host")
	@Nonnull public String host;
	@SerializedName("port")
	@Nonnull public String port;
	@SerializedName("to")
	@CheckForNull public int to;
	@SerializedName("ipv4")
	@CheckForNull public boolean ipv4;
	@SerializedName("ipv6")
	@CheckForNull public boolean ipv6;
}
