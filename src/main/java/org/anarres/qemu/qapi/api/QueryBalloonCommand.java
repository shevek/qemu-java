package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-balloon, returns=BalloonInfo, data=null}
public class QueryBalloonCommand extends QApiCommand<Void, QueryBalloonCommand.Response> {

	public static class Response extends QApiResponse<BalloonInfo> {
	}

	public QueryBalloonCommand() {
		super("query-balloon", Response.class, null);
	}
}
