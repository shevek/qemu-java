package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=chardev-remove, returns=null, data={id=str}}
public class ChardevRemoveCommand extends QApiCommand<ChardevRemoveCommand.Arguments, ChardevRemoveCommand.Response> {
	public static class Arguments {
		@SerializedName("id")
		@Nonnull public String id;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ChardevRemoveCommand(@Nonnull ChardevRemoveCommand.Arguments argument) {
		super("chardev-remove", Response.class, argument);
	}
}
