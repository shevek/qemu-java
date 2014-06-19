package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-cpus, returns=[CpuInfo], data=null}
public class QueryCpusCommand extends QApiCommand<Void, List<CpuInfo>> {

	public QueryCpusCommand() {
		super("query-cpus", new TypeToken<List<CpuInfo>>() {}, null);
	}
}
