package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=qom-set, returns=null, data={path=str, property=str, value=visitor}}
public class QomSetCommand extends QApiCommand<QomSetCommand.QomSetArguments, QomSetCommand.Response> {
	public static class QomSetArguments {
		@SerializedName("path")
		@Nonnull public String path;
		@SerializedName("property")
		@Nonnull public String property;
		@SerializedName("value")
		@Nonnull public Object value;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public QomSetCommand(@Nonnull QomSetCommand.QomSetArguments argument) {
		super("qom-set", Response.class, argument);
	}
}
