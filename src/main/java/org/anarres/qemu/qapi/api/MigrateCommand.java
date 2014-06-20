package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate, returns=null, data={uri=str, *blk=bool, *inc=bool, *detach=bool}}
public class MigrateCommand extends QApiCommand<MigrateCommand.MigrateArguments, MigrateCommand.Response> {
	public static class MigrateArguments {
		@SerializedName("uri")
		@Nonnull public String uri;
		@SerializedName("blk")
		@CheckForNull public boolean blk;
		@SerializedName("inc")
		@CheckForNull public boolean inc;
		@SerializedName("detach")
		@CheckForNull public boolean detach;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public MigrateCommand(@Nonnull MigrateCommand.MigrateArguments argument) {
		super("migrate", Response.class, argument);
	}
}
