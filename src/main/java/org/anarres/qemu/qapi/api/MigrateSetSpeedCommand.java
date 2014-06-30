package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate_set_speed, returns=null, data={value=int}}
public class MigrateSetSpeedCommand extends QApiCommand<MigrateSetSpeedCommand.Arguments, MigrateSetSpeedCommand.Response> {
	public static class Arguments {
		@SerializedName("value")
		@Nonnull public long value;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public MigrateSetSpeedCommand(@Nonnull MigrateSetSpeedCommand.Arguments argument) {
		super("migrate_set_speed", Response.class, argument);
	}
}
