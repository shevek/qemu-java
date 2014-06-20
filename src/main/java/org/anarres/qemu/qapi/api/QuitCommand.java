package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=quit, returns=null, data=null}
public class QuitCommand extends QApiCommand<Void, QuitCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public QuitCommand() {
		super("quit", Response.class, null);
	}
}
