package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-kvm, returns=KvmInfo, data=null}
public class QueryKvmCommand extends QApiCommand<Void, QueryKvmCommand.Response> {

	public static class Response extends QApiResponse<KvmInfo> {
	}

	public QueryKvmCommand() {
		super("query-kvm", Response.class, null);
	}
}
