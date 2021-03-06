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
 * <pre>QApiCommandDescriptor{name=set_password, returns=null, data={protocol=str, password=str, *connected=str}}</pre>
 */
// QApiCommandDescriptor{name=set_password, returns=null, data={protocol=str, password=str, *connected=str}}
public class SetPasswordCommand extends QApiCommand<SetPasswordCommand.Arguments, SetPasswordCommand.Response> {
	/** Compound arguments to a SetPasswordCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("protocol")
		@Nonnull
		public java.lang.String protocol;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("password")
		@Nonnull
		public java.lang.String password;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("connected")
		@CheckForNull
		public java.lang.String connected;

		public Arguments() {
		}

		public Arguments(java.lang.String protocol, java.lang.String password, java.lang.String connected) {
			this.protocol = protocol;
			this.password = password;
			this.connected = connected;
		}
	}

	/** Response to a SetPasswordCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new SetPasswordCommand. */
	public SetPasswordCommand(@Nonnull SetPasswordCommand.Arguments argument) {
		super("set_password", Response.class, argument);
	}

	/** Constructs a new SetPasswordCommand. */
	public SetPasswordCommand(java.lang.String protocol, java.lang.String password, java.lang.String connected) {
		this(new Arguments(protocol, password, connected));
	}
}
