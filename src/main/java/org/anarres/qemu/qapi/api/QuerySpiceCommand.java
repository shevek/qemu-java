package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-spice, returns=SpiceInfo, data=null}
public class QuerySpiceCommand extends QApiCommand<Void, SpiceInfo> {

	public QuerySpiceCommand() {
		super("query-spice", new TypeToken<SpiceInfo>() {}, null);
	}
}
