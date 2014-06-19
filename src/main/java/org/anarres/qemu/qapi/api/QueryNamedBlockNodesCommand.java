package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-named-block-nodes, returns=[BlockDeviceInfo], data=null}
public class QueryNamedBlockNodesCommand extends QApiCommand<Void, List<BlockDeviceInfo>> {

	public QueryNamedBlockNodesCommand() {
		super("query-named-block-nodes", new TypeToken<List<BlockDeviceInfo>>() {}, null);
	}
}
