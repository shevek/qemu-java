package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=change-vnc-password, returns=null, data={password=str}}
public class ChangeVncPasswordCommand extends QApiCommand<ChangeVncPasswordCommand.ChangeVncPasswordArguments, Void> {
	public static class ChangeVncPasswordArguments {
		@SerializedName("password")
		@Nonnull public String password;
	}

	public ChangeVncPasswordCommand(@Nonnull ChangeVncPasswordCommand.ChangeVncPasswordArguments argument) {
		super("change-vnc-password", new TypeToken<Void>() {}, argument);
	}
}
