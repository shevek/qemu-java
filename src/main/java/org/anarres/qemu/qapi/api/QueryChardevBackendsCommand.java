package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-chardev-backends, returns=[ChardevBackendInfo], data=null}
public class QueryChardevBackendsCommand extends QApiCommand<Void, List<ChardevBackendInfo>> {

	public QueryChardevBackendsCommand() {
		super("query-chardev-backends", new TypeToken<List<ChardevBackendInfo>>() {}, null);
	}
}
