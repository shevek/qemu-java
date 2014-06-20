package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=send-key, returns=null, data={keys=[KeyValue], *hold-time=int}}
public class SendKeyCommand extends QApiCommand<SendKeyCommand.SendKeyArguments, SendKeyCommand.Response> {
	public static class SendKeyArguments {
		@SerializedName("keys")
		@Nonnull public List<KeyValue> keys;
		@SerializedName("hold-time")
		@CheckForNull public long holdTime;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public SendKeyCommand(@Nonnull SendKeyCommand.SendKeyArguments argument) {
		super("send-key", Response.class, argument);
	}
}
