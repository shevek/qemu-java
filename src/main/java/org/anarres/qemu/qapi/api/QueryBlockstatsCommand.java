package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-blockstats, returns=[BlockStats], data=null}
public class QueryBlockstatsCommand extends QApiCommand<Void, List<BlockStats>> {

	public QueryBlockstatsCommand() {
		super("query-blockstats", new TypeToken<List<BlockStats>>() {}, null);
	}
}
