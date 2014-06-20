package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-block-jobs, returns=[BlockJobInfo], data=null}
public class QueryBlockJobsCommand extends QApiCommand<Void, QueryBlockJobsCommand.Response> {

	public static class Response extends QApiResponse<List<BlockJobInfo>> {
	}

	public QueryBlockJobsCommand() {
		super("query-block-jobs", Response.class, null);
	}
}
