package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=chardev-remove, returns=null, data={id=str}}
public class ChardevRemoveCommand extends QApiCommand<ChardevRemoveCommand.ChardevRemoveArguments, Void> {
	public static class ChardevRemoveArguments {
		@SerializedName("id")
		@Nonnull public String id;
	}

	public ChardevRemoveCommand(@Nonnull ChardevRemoveCommand.ChardevRemoveArguments argument) {
		super("chardev-remove", new TypeToken<Void>() {}, argument);
	}
}
