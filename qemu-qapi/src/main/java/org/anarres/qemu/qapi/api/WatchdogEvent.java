package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=WATCHDOG, data={action=WatchdogExpirationAction}}</pre>
 */
// QApiEventDescriptor{name=WATCHDOG, data={action=WatchdogExpirationAction}}
public class WatchdogEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("action")
		@Nonnull
		public WatchdogExpirationAction action;
	}

	@JsonProperty("data")
	public Data data;
}