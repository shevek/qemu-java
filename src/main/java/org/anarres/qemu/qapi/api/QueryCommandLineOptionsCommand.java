package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-command-line-options, returns=[CommandLineOptionInfo], data={*option=str}}
public class QueryCommandLineOptionsCommand extends QApiCommand<QueryCommandLineOptionsCommand.QueryCommandLineOptionsArguments, List<CommandLineOptionInfo>> {
	public static class QueryCommandLineOptionsArguments {
		@SerializedName("option")
		@CheckForNull public String option;
	}

	public QueryCommandLineOptionsCommand(@Nonnull QueryCommandLineOptionsCommand.QueryCommandLineOptionsArguments argument) {
		super("query-command-line-options", new TypeToken<List<CommandLineOptionInfo>>() {}, argument);
	}
}
