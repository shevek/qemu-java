package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=qom-get, returns=visitor, data={path=str, property=str}}
public class QomGetCommand extends QApiCommand<QomGetCommand.QomGetArguments, Object> {
	public static class QomGetArguments {
		@SerializedName("path")
		@Nonnull public String path;
		@SerializedName("property")
		@Nonnull public String property;
	}

	public QomGetCommand(@Nonnull QomGetCommand.QomGetArguments argument) {
		super("qom-get", new TypeToken<Object>() {}, argument);
	}
}
