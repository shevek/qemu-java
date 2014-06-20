package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=system_powerdown, returns=null, data=null}
public class SystemPowerdownCommand extends QApiCommand<Void, SystemPowerdownCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public SystemPowerdownCommand() {
		super("system_powerdown", Response.class, null);
	}
}
