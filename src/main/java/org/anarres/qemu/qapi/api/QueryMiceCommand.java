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
 * <p><pre>QApiCommandDescriptor{name=query-mice, returns=[MouseInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-mice, returns=[MouseInfo], data=null}
public class QueryMiceCommand extends QApiCommand<java.lang.Void, QueryMiceCommand.Response> {

	/** Response to a QueryMiceCommand. */
	public static class Response extends QApiResponse<List<MouseInfo>> {
	}

	/** Constructs a new QueryMiceCommand. */
	public QueryMiceCommand() {
		super("query-mice", Response.class, null);
	}

}
