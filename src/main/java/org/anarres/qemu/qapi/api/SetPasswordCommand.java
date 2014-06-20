package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=set_password, returns=null, data={protocol=str, password=str, *connected=str}}
public class SetPasswordCommand extends QApiCommand<SetPasswordCommand.SetPasswordArguments, SetPasswordCommand.Response> {
	public static class SetPasswordArguments {
		@SerializedName("protocol")
		@Nonnull public String protocol;
		@SerializedName("password")
		@Nonnull public String password;
		@SerializedName("connected")
		@CheckForNull public String connected;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public SetPasswordCommand(@Nonnull SetPasswordCommand.SetPasswordArguments argument) {
		super("set_password", Response.class, argument);
	}
}
