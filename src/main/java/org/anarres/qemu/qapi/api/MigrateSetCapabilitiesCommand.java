package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate-set-capabilities, returns=null, data={capabilities=[MigrationCapabilityStatus]}}
public class MigrateSetCapabilitiesCommand extends QApiCommand<MigrateSetCapabilitiesCommand.Arguments, MigrateSetCapabilitiesCommand.Response> {
	public static class Arguments {
		@SerializedName("capabilities")
		@Nonnull public List<MigrationCapabilityStatus> capabilities;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public MigrateSetCapabilitiesCommand(@Nonnull MigrateSetCapabilitiesCommand.Arguments argument) {
		super("migrate-set-capabilities", Response.class, argument);
	}
}
