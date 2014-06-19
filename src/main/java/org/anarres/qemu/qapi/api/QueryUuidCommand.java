package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-uuid, returns=UuidInfo, data=null}
public class QueryUuidCommand extends QApiCommand<Void, UuidInfo> {

	public QueryUuidCommand() {
		super("query-uuid", new TypeToken<UuidInfo>() {}, null);
	}
}
