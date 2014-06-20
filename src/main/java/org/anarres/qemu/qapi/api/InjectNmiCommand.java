package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=inject-nmi, returns=null, data=null}
public class InjectNmiCommand extends QApiCommand<Void, InjectNmiCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public InjectNmiCommand() {
		super("inject-nmi", Response.class, null);
	}
}
