package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-pci, returns=[PciInfo], data=null}
public class QueryPciCommand extends QApiCommand<Void, QueryPciCommand.Response> {

	public static class Response extends QApiResponse<List<PciInfo>> {
	}

	public QueryPciCommand() {
		super("query-pci", Response.class, null);
	}
}
