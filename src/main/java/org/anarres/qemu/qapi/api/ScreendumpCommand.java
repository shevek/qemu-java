package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=screendump, returns=null, data={filename=str}}
public class ScreendumpCommand extends QApiCommand<ScreendumpCommand.ScreendumpArguments, ScreendumpCommand.Response> {
	public static class ScreendumpArguments {
		@SerializedName("filename")
		@Nonnull public String filename;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ScreendumpCommand(@Nonnull ScreendumpCommand.ScreendumpArguments argument) {
		super("screendump", Response.class, argument);
	}
}
