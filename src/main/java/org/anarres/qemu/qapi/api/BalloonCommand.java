package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=balloon, returns=null, data={value=int}}
public class BalloonCommand extends QApiCommand<BalloonCommand.BalloonArguments, BalloonCommand.Response> {
	public static class BalloonArguments {
		@SerializedName("value")
		@Nonnull public long value;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BalloonCommand(@Nonnull BalloonCommand.BalloonArguments argument) {
		super("balloon", Response.class, argument);
	}
}
