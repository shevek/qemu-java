package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=human-monitor-command, returns=str, data={command-line=str, *cpu-index=int}}</pre>
 */
// QApiCommandDescriptor{name=human-monitor-command, returns=str, data={command-line=str, *cpu-index=int}}
public class HumanMonitorCommandCommand extends QApiCommand<HumanMonitorCommandCommand.Arguments, HumanMonitorCommandCommand.Response> {
	/** Compound arguments to a HumanMonitorCommandCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("command-line")
		@Nonnull
		public java.lang.String commandLine;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("cpu-index")
		@CheckForNull
		public java.lang.Long cpuIndex;

		public Arguments() {
		}

		public Arguments(java.lang.String commandLine, java.lang.Long cpuIndex) {
			this.commandLine = commandLine;
			this.cpuIndex = cpuIndex;
		}
	}

	/** Response to a HumanMonitorCommandCommand. */
	public static class Response extends QApiResponse<java.lang.String> {
	}

	/** Constructs a new HumanMonitorCommandCommand. */
	public HumanMonitorCommandCommand(@Nonnull HumanMonitorCommandCommand.Arguments argument) {
		super("human-monitor-command", Response.class, argument);
	}

	/** Constructs a new HumanMonitorCommandCommand. */
	public HumanMonitorCommandCommand(java.lang.String commandLine, java.lang.Long cpuIndex) {
		this(new Arguments(commandLine, cpuIndex));
	}
}