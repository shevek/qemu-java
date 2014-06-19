package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=balloon, returns=null, data={value=int}}
public class BalloonCommand extends QApiCommand<BalloonCommand.BalloonArguments, Void> {
	public static class BalloonArguments {
		@SerializedName("value")
		@Nonnull public long value;
	}

	public BalloonCommand(@Nonnull BalloonCommand.BalloonArguments argument) {
		super("balloon", new TypeToken<Void>() {}, argument);
	}
}
