package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-tpm-models, returns=[TpmModel], data=null}
public class QueryTpmModelsCommand extends QApiCommand<Void, List<TpmModel>> {

	public QueryTpmModelsCommand() {
		super("query-tpm-models", new TypeToken<List<TpmModel>>() {}, null);
	}
}
