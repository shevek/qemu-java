package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-tpm, returns=[TPMInfo], data=null}
public class QueryTpmCommand extends QApiCommand<Void, List<TPMInfo>> {

	public QueryTpmCommand() {
		super("query-tpm", new TypeToken<List<TPMInfo>>() {}, null);
	}
}
