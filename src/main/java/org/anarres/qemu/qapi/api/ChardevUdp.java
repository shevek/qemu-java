package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=ChardevUdp, data={remote=SocketAddress, *local=SocketAddress}, innerTypes=null}
public class ChardevUdp extends QApiType {

	@SerializedName("remote")
	@Nonnull public SocketAddress remote;
	@SerializedName("local")
	@CheckForNull public SocketAddress local;
}
