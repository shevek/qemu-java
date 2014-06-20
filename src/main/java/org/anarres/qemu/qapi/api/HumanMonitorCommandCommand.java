package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=human-monitor-command, returns=str, data={command-line=str, *cpu-index=int}}
public class HumanMonitorCommandCommand extends QApiCommand<HumanMonitorCommandCommand.HumanMonitorCommandArguments, HumanMonitorCommandCommand.Response> {
	public static class HumanMonitorCommandArguments {
		@SerializedName("command-line")
		@Nonnull public String commandLine;
		@SerializedName("cpu-index")
		@CheckForNull public long cpuIndex;
	}

	public static class Response extends QApiResponse<String> {
	}

	public HumanMonitorCommandCommand(@Nonnull HumanMonitorCommandCommand.HumanMonitorCommandArguments argument) {
		super("human-monitor-command", Response.class, argument);
	}
}
