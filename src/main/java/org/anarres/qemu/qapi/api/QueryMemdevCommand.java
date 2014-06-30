package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-memdev, returns=[Memdev], data=null}
public class QueryMemdevCommand extends QApiCommand<Void, QueryMemdevCommand.Response> {

	public static class Response extends QApiResponse<List<Memdev>> {
	}

	public QueryMemdevCommand() {
		super("query-memdev", Response.class, null);
	}
}
