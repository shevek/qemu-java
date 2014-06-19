package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=nbd-server-start, returns=null, data={addr=SocketAddress}}
public class NbdServerStartCommand extends QApiCommand<NbdServerStartCommand.NbdServerStartArguments, Void> {
	public static class NbdServerStartArguments {
		@SerializedName("addr")
		@Nonnull public SocketAddress addr;
	}

	public NbdServerStartCommand(@Nonnull NbdServerStartCommand.NbdServerStartArguments argument) {
		super("nbd-server-start", new TypeToken<Void>() {}, argument);
	}
}
