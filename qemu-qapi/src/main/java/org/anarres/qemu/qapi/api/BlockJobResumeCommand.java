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
 * <pre>QApiCommandDescriptor{name=block-job-resume, returns=null, data={device=str}}</pre>
 */
// QApiCommandDescriptor{name=block-job-resume, returns=null, data={device=str}}
public class BlockJobResumeCommand extends QApiCommand<BlockJobResumeCommand.Arguments, BlockJobResumeCommand.Response> {
	/** Compound arguments to a BlockJobResumeCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;

		public Arguments() {
		}

		public Arguments(java.lang.String device) {
			this.device = device;
		}
	}

	/** Response to a BlockJobResumeCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockJobResumeCommand. */
	public BlockJobResumeCommand(@Nonnull BlockJobResumeCommand.Arguments argument) {
		super("block-job-resume", Response.class, argument);
	}

	/** Constructs a new BlockJobResumeCommand. */
	public BlockJobResumeCommand(java.lang.String device) {
		this(new Arguments(device));
	}
}