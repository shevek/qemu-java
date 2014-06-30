package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-rx-filter, returns=[RxFilterInfo], data={*name=str}}
public class QueryRxFilterCommand extends QApiCommand<QueryRxFilterCommand.Arguments, QueryRxFilterCommand.Response> {
	public static class Arguments {
		@SerializedName("name")
		@CheckForNull public String name;
	}

	public static class Response extends QApiResponse<List<RxFilterInfo>> {
	}

	public QueryRxFilterCommand(@Nonnull QueryRxFilterCommand.Arguments argument) {
		super("query-rx-filter", Response.class, argument);
	}
}
