package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=BLOCK_IO_ERROR, data={device=str, operation=IoOperationType, action=BlockErrorAction, *nospace=bool, reason=str}}</pre>
 */
// QApiEventDescriptor{name=BLOCK_IO_ERROR, data={device=str, operation=IoOperationType, action=BlockErrorAction, *nospace=bool, reason=str}}
public class BlockIoErrorEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("operation")
		@Nonnull
		public IoOperationType operation;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("action")
		@Nonnull
		public BlockErrorAction action;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("nospace")
		@CheckForNull
		public java.lang.Boolean nospace;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("reason")
		@Nonnull
		public java.lang.String reason;
	}

	@JsonProperty("data")
	public Data data;
}