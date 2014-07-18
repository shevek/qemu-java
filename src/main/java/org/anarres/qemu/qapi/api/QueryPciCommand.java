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
 * <p><pre>QApiCommandDescriptor{name=query-pci, returns=[PciInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-pci, returns=[PciInfo], data=null}
public class QueryPciCommand extends QApiCommand<java.lang.Void, QueryPciCommand.Response> {

	/** Response to a QueryPciCommand. */
	public static class Response extends QApiResponse<List<PciInfo>> {
	}

	/** Constructs a new QueryPciCommand. */
	public QueryPciCommand() {
		super("query-pci", Response.class, null);
	}

}
