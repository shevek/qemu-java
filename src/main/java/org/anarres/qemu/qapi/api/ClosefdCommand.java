package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=closefd, returns=null, data={fdname=str}}
public class ClosefdCommand extends QApiCommand<ClosefdCommand.Arguments, ClosefdCommand.Response> {
	public static class Arguments {
		@SerializedName("fdname")
		@Nonnull public String fdname;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ClosefdCommand(@Nonnull ClosefdCommand.Arguments argument) {
		super("closefd", Response.class, argument);
	}
}
