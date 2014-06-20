package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-migrate-cache-size, returns=int, data=null}
public class QueryMigrateCacheSizeCommand extends QApiCommand<Void, QueryMigrateCacheSizeCommand.Response> {

	public static class Response extends QApiResponse<Long> {
	}

	public QueryMigrateCacheSizeCommand() {
		super("query-migrate-cache-size", Response.class, null);
	}
}
