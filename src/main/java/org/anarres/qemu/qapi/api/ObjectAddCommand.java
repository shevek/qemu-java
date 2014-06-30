package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=object-add, returns=null, data={qom-type=str, id=str, *props=dict}}
public class ObjectAddCommand extends QApiCommand<ObjectAddCommand.Arguments, ObjectAddCommand.Response> {
	public static class Arguments {
		@SerializedName("qom-type")
		@Nonnull public String qomType;
		@SerializedName("id")
		@Nonnull public String id;
		@SerializedName("props")
		@CheckForNull public Map<String, String> props;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ObjectAddCommand(@Nonnull ObjectAddCommand.Arguments argument) {
		super("object-add", Response.class, argument);
	}
}
