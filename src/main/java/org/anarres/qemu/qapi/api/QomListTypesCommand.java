package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=qom-list-types, returns=[ObjectTypeInfo], data={*implements=str, *abstract=bool}}
public class QomListTypesCommand extends QApiCommand<QomListTypesCommand.Arguments, QomListTypesCommand.Response> {
	public static class Arguments {
		@SerializedName("implements")
		@CheckForNull public String _implements;
		@SerializedName("abstract")
		@CheckForNull public boolean _abstract;
	}

	public static class Response extends QApiResponse<List<ObjectTypeInfo>> {
	}

	public QomListTypesCommand(@Nonnull QomListTypesCommand.Arguments argument) {
		super("qom-list-types", Response.class, argument);
	}
}
