package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-events, returns=[EventInfo], data=null}
public class QueryEventsCommand extends QApiCommand<Void, QueryEventsCommand.Response> {

	public static class Response extends QApiResponse<List<EventInfo>> {
	}

	public QueryEventsCommand() {
		super("query-events", Response.class, null);
	}
}
