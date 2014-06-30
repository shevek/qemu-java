package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=qom-get, returns=visitor, data={path=str, property=str}}
public class QomGetCommand extends QApiCommand<QomGetCommand.Arguments, QomGetCommand.Response> {
	public static class Arguments {
		@SerializedName("path")
		@Nonnull public String path;
		@SerializedName("property")
		@Nonnull public String property;
	}

	public static class Response extends QApiResponse<Object> {
	}

	public QomGetCommand(@Nonnull QomGetCommand.Arguments argument) {
		super("qom-get", Response.class, argument);
	}
}
