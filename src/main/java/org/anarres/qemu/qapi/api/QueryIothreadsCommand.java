package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-iothreads, returns=[IOThreadInfo], data=null}
public class QueryIothreadsCommand extends QApiCommand<Void, QueryIothreadsCommand.Response> {

	public static class Response extends QApiResponse<List<IOThreadInfo>> {
	}

	public QueryIothreadsCommand() {
		super("query-iothreads", Response.class, null);
	}
}
