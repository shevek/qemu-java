package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=rtc-reset-reinjection, returns=null, data=null}
public class RtcResetReinjectionCommand extends QApiCommand<Void, RtcResetReinjectionCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public RtcResetReinjectionCommand() {
		super("rtc-reset-reinjection", Response.class, null);
	}
}
