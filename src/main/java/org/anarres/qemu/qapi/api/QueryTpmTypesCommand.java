package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-tpm-types, returns=[TpmType], data=null}
public class QueryTpmTypesCommand extends QApiCommand<Void, List<TpmType>> {

	public QueryTpmTypesCommand() {
		super("query-tpm-types", new TypeToken<List<TpmType>>() {}, null);
	}
}
