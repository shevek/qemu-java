package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-status, returns=StatusInfo, data=null}
public class QueryStatusCommand extends QApiCommand<Void, QueryStatusCommand.Response> {

	public static class Response extends QApiResponse<StatusInfo> {
	}

	public QueryStatusCommand() {
		super("query-status", Response.class, null);
	}
}
