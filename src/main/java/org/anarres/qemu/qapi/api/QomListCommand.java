package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=qom-list, returns=[ObjectPropertyInfo], data={path=str}}
public class QomListCommand extends QApiCommand<QomListCommand.Arguments, QomListCommand.Response> {
	public static class Arguments {
		@SerializedName("path")
		@Nonnull public String path;
	}

	public static class Response extends QApiResponse<List<ObjectPropertyInfo>> {
	}

	public QomListCommand(@Nonnull QomListCommand.Arguments argument) {
		super("qom-list", Response.class, argument);
	}
}
