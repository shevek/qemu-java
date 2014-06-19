package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate-set-capabilities, returns=null, data={capabilities=[MigrationCapabilityStatus]}}
public class MigrateSetCapabilitiesCommand extends QApiCommand<MigrateSetCapabilitiesCommand.MigrateSetCapabilitiesArguments, Void> {
	public static class MigrateSetCapabilitiesArguments {
		@SerializedName("capabilities")
		@Nonnull public List<MigrationCapabilityStatus> capabilities;
	}

	public MigrateSetCapabilitiesCommand(@Nonnull MigrateSetCapabilitiesCommand.MigrateSetCapabilitiesArguments argument) {
		super("migrate-set-capabilities", new TypeToken<Void>() {}, argument);
	}
}
