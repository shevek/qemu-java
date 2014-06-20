package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-migrate, returns=MigrationInfo, data=null}
public class QueryMigrateCommand extends QApiCommand<Void, QueryMigrateCommand.Response> {

	public static class Response extends QApiResponse<MigrationInfo> {
	}

	public QueryMigrateCommand() {
		super("query-migrate", Response.class, null);
	}
}
