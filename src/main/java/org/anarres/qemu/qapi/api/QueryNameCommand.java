package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-name, returns=NameInfo, data=null}
public class QueryNameCommand extends QApiCommand<Void, QueryNameCommand.Response> {

	public static class Response extends QApiResponse<NameInfo> {
	}

	public QueryNameCommand() {
		super("query-name", Response.class, null);
	}
}
