package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=TPMInfo, data={id=str, model=TpmModel, options=TpmTypeOptions}, innerTypes=null, fields=null}
public class TPMInfo extends QApiObject {

	@SerializedName("id")
	@Nonnull public String id;
	@SerializedName("model")
	@Nonnull public TpmModel model;
	@SerializedName("options")
	@Nonnull public TpmTypeOptions options;
}
