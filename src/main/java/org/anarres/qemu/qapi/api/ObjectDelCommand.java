package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=object-del, returns=null, data={id=str}}
public class ObjectDelCommand extends QApiCommand<ObjectDelCommand.ObjectDelArguments, Void> {
	public static class ObjectDelArguments {
		@SerializedName("id")
		@Nonnull public String id;
	}

	public ObjectDelCommand(@Nonnull ObjectDelCommand.ObjectDelArguments argument) {
		super("object-del", new TypeToken<Void>() {}, argument);
	}
}
