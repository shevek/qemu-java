package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-version, returns=VersionInfo, data=null}
public class QueryVersionCommand extends QApiCommand<Void, VersionInfo> {

	public QueryVersionCommand() {
		super("query-version", new TypeToken<VersionInfo>() {}, null);
	}
}
