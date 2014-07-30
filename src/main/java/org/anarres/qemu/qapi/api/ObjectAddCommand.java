package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=object-add, returns=null, data={qom-type=str, id=str, *props=dict}}</pre></p>
 */
// QApiCommandDescriptor{name=object-add, returns=null, data={qom-type=str, id=str, *props=dict}}
public class ObjectAddCommand extends QApiCommand<ObjectAddCommand.Arguments, ObjectAddCommand.Response> {
	/** Compound arguments to a ObjectAddCommand. */
	public static class Arguments {

		@SerializedName("qom-type")
		@Nonnull
		public java.lang.String qomType;
		@SerializedName("id")
		@Nonnull
		public java.lang.String id;
		@SerializedName("props")
		@CheckForNull
		public Map<String, String> props;

		public Arguments() {
		}

		public Arguments(java.lang.String qomType, java.lang.String id, Map<String, String> props) {
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
	public ObjectAddCommand(java.lang.String qomType, java.lang.String id, Map<String, String> props) {
		this(new Arguments(qomType, id, props));
	}
}