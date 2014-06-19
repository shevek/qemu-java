package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-chardev, returns=[ChardevInfo], data=null}
public class QueryChardevCommand extends QApiCommand<Void, List<ChardevInfo>> {

	public QueryChardevCommand() {
		super("query-chardev", new TypeToken<List<ChardevInfo>>() {}, null);
	}
}
