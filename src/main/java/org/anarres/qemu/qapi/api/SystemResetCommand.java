package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=system_reset, returns=null, data=null}
public class SystemResetCommand extends QApiCommand<Void, SystemResetCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public SystemResetCommand() {
		super("system_reset", Response.class, null);
	}
}
