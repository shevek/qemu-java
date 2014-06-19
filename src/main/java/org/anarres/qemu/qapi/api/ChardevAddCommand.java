package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=chardev-add, returns=ChardevReturn, data={id=str, backend=ChardevBackend}}
public class ChardevAddCommand extends QApiCommand<ChardevAddCommand.ChardevAddArguments, ChardevReturn> {
	public static class ChardevAddArguments {
		@SerializedName("id")
		@Nonnull public String id;
		@SerializedName("backend")
		@Nonnull public ChardevBackend backend;
	}

	public ChardevAddCommand(@Nonnull ChardevAddCommand.ChardevAddArguments argument) {
		super("chardev-add", new TypeToken<ChardevReturn>() {}, argument);
	}
}
