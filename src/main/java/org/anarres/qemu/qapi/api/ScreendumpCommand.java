package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=screendump, returns=null, data={filename=str}}
public class ScreendumpCommand extends QApiCommand<ScreendumpCommand.Arguments, ScreendumpCommand.Response> {
	public static class Arguments {
		@SerializedName("filename")
		@Nonnull public String filename;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ScreendumpCommand(@Nonnull ScreendumpCommand.Arguments argument) {
		super("screendump", Response.class, argument);
	}
}
