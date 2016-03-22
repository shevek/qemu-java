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
 * <pre>QApiCommandDescriptor{name=object-add, returns=null, data={qom-type=str, id=str, *props=any}}</pre>
 */
// QApiCommandDescriptor{name=object-add, returns=null, data={qom-type=str, id=str, *props=any}}
public class ObjectAddCommand extends QApiCommand<ObjectAddCommand.Arguments, ObjectAddCommand.Response> {
	/** Compound arguments to a ObjectAddCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("qom-type")
		@Nonnull
		public java.lang.String qomType;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("id")
		@Nonnull
		public java.lang.String id;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("props")
		@CheckForNull
		public java.lang.Object props;

		public Arguments() {
		}

		public Arguments(java.lang.String qomType, java.lang.String id, java.lang.Object props) {
			this.qomType = qomType;
			this.id = id;
			this.props = props;
		}
	}

	/** Response to a ObjectAddCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new ObjectAddCommand. */
	public ObjectAddCommand(@Nonnull ObjectAddCommand.Arguments argument) {
		super("object-add", Response.class, argument);
	}

	/** Constructs a new ObjectAddCommand. */
	public ObjectAddCommand(java.lang.String qomType, java.lang.String id, java.lang.Object props) {
		this(new Arguments(qomType, id, props));
	}
}