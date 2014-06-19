package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-events, returns=[EventInfo], data=null}
public class QueryEventsCommand extends QApiCommand<Void, List<EventInfo>> {

	public QueryEventsCommand() {
		super("query-events", new TypeToken<List<EventInfo>>() {}, null);
	}
}
