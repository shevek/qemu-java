package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-iothreads, returns=[IOThreadInfo], data=null}
public class QueryIothreadsCommand extends QApiCommand<Void, List<IOThreadInfo>> {

	public QueryIothreadsCommand() {
		super("query-iothreads", new TypeToken<List<IOThreadInfo>>() {}, null);
	}
}
