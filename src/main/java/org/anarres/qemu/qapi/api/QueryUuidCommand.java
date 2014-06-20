package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-uuid, returns=UuidInfo, data=null}
public class QueryUuidCommand extends QApiCommand<Void, QueryUuidCommand.Response> {

	public static class Response extends QApiResponse<UuidInfo> {
	}

	public QueryUuidCommand() {
		super("query-uuid", Response.class, null);
	}
}
