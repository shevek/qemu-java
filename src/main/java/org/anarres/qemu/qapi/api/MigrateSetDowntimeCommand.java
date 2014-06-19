package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate_set_downtime, returns=null, data={value=number}}
public class MigrateSetDowntimeCommand extends QApiCommand<MigrateSetDowntimeCommand.MigrateSetDowntimeArguments, Void> {
	public static class MigrateSetDowntimeArguments {
		@SerializedName("value")
		@Nonnull public double value;
	}

	public MigrateSetDowntimeCommand(@Nonnull MigrateSetDowntimeCommand.MigrateSetDowntimeArguments argument) {
		super("migrate_set_downtime", new TypeToken<Void>() {}, argument);
	}
}
