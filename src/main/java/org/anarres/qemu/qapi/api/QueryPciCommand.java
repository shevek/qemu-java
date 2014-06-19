package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-pci, returns=[PciInfo], data=null}
public class QueryPciCommand extends QApiCommand<Void, List<PciInfo>> {

	public QueryPciCommand() {
		super("query-pci", new TypeToken<List<PciInfo>>() {}, null);
	}
}
