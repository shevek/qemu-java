package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=qom-list, returns=[ObjectPropertyInfo], data={path=str}}
public class QomListCommand extends QApiCommand<QomListCommand.QomListArguments, List<ObjectPropertyInfo>> {
	public static class QomListArguments {
		@SerializedName("path")
		@Nonnull public String path;
	}

	public QomListCommand(@Nonnull QomListCommand.QomListArguments argument) {
		super("qom-list", new TypeToken<List<ObjectPropertyInfo>>() {}, argument);
	}
}
