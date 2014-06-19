package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=TPMPassthroughOptions, data={*path=str, *cancel-path=str}, innerTypes=null, fields=null}
public class TPMPassthroughOptions extends QApiType {

	@SerializedName("path")
	@CheckForNull public String path;
	@SerializedName("cancel-path")
	@CheckForNull public String cancelPath;
}
