package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-block, returns=[BlockInfo], data=null}
public class QueryBlockCommand extends QApiCommand<Void, QueryBlockCommand.Response> {

	public static class Response extends QApiResponse<List<BlockInfo>> {
	}

	public QueryBlockCommand() {
		super("query-block", Response.class, null);
	}
}
