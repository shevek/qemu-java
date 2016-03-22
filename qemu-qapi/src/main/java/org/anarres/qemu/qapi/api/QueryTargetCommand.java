package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=query-target, returns=TargetInfo, data=null}</pre>
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