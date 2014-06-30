package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-command-line-options, returns=[CommandLineOptionInfo], data={*option=str}}
public class QueryCommandLineOptionsCommand extends QApiCommand<QueryCommandLineOptionsCommand.Arguments, QueryCommandLineOptionsCommand.Response> {
	public static class Arguments {
		@SerializedName("option")
		@CheckForNull public String option;
	}

	public static class Response extends QApiResponse<List<CommandLineOptionInfo>> {
	}

	public QueryCommandLineOptionsCommand(@Nonnull QueryCommandLineOptionsCommand.Arguments argument) {
		super("query-command-line-options", Response.class, argument);
	}
}
