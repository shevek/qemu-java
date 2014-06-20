package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate-set-cache-size, returns=null, data={value=int}}
public class MigrateSetCacheSizeCommand extends QApiCommand<MigrateSetCacheSizeCommand.MigrateSetCacheSizeArguments, MigrateSetCacheSizeCommand.Response> {
	public static class MigrateSetCacheSizeArguments {
		@SerializedName("value")
		@Nonnull public long value;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public MigrateSetCacheSizeCommand(@Nonnull MigrateSetCacheSizeCommand.MigrateSetCacheSizeArguments argument) {
		super("migrate-set-cache-size", Response.class, argument);
	}
}
