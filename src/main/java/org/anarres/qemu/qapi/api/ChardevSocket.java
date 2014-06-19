package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ChardevSocket, data={addr=SocketAddress, *server=bool, *wait=bool, *nodelay=bool, *telnet=bool}, innerTypes=null, fields=null}
public class ChardevSocket extends QApiObject {

	@SerializedName("addr")
	@Nonnull public SocketAddress addr;
	@SerializedName("server")
	@CheckForNull public boolean server;
	@SerializedName("wait")
	@CheckForNull public boolean wait;
	@SerializedName("nodelay")
	@CheckForNull public boolean nodelay;
	@SerializedName("telnet")
	@CheckForNull public boolean telnet;
}
