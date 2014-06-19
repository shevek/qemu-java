package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-mice, returns=[MouseInfo], data=null}
public class QueryMiceCommand extends QApiCommand<Void, List<MouseInfo>> {

	public QueryMiceCommand() {
		super("query-mice", new TypeToken<List<MouseInfo>>() {}, null);
	}
}
