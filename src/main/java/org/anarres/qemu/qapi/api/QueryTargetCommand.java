package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-target, returns=TargetInfo, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-target, returns=TargetInfo, data=null}
public class QueryTargetCommand extends QApiCommand<java.lang.Void, QueryTargetCommand.Response> {

	/** Response to a QueryTargetCommand. */
	public static class Response extends QApiResponse<TargetInfo> {
	}

	/** Constructs a new QueryTargetCommand. */
	public QueryTargetCommand() {
		super("query-target", Response.class, null);
	}

}
