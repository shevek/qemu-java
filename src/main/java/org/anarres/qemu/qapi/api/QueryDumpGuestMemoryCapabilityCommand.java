package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-dump-guest-memory-capability, returns=DumpGuestMemoryCapability, data=null}
public class QueryDumpGuestMemoryCapabilityCommand extends QApiCommand<Void, DumpGuestMemoryCapability> {

	public QueryDumpGuestMemoryCapabilityCommand() {
		super("query-dump-guest-memory-capability", new TypeToken<DumpGuestMemoryCapability>() {}, null);
	}
}
