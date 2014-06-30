package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-acpi-ospm-status, returns=[ACPIOSTInfo], data=null}
public class QueryAcpiOspmStatusCommand extends QApiCommand<Void, QueryAcpiOspmStatusCommand.Response> {

	public static class Response extends QApiResponse<List<ACPIOSTInfo>> {
	}

	public QueryAcpiOspmStatusCommand() {
		super("query-acpi-ospm-status", Response.class, null);
	}
}
