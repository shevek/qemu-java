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
 * <pre>QApiCommandDescriptor{name=watchdog-set-action, returns=null, data={action=WatchdogAction}}</pre>
 */
// QApiCommandDescriptor{name=watchdog-set-action, returns=null, data={action=WatchdogAction}}
public class WatchdogSetActionCommand extends QApiCommand<WatchdogSetActionCommand.Arguments, WatchdogSetActionCommand.Response> {
	/** Compound arguments to a WatchdogSetActionCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("action")
		@Nonnull
		public WatchdogAction action;

		public Arguments() {
		}

		public Arguments(WatchdogAction action) {
			this.action = action;
		}
	}

	/** Response to a WatchdogSetActionCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new WatchdogSetActionCommand. */
	public WatchdogSetActionCommand(@Nonnull WatchdogSetActionCommand.Arguments argument) {
		super("watchdog-set-action", Response.class, argument);
	}

	/** Constructs a new WatchdogSetActionCommand. */
	public WatchdogSetActionCommand(WatchdogAction action) {
		this(new Arguments(action));
	}
}
