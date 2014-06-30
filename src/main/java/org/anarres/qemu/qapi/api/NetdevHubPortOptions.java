package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=NetdevHubPortOptions, data={hubid=int32}, innerTypes=null}
public class NetdevHubPortOptions extends QApiType {

	@SerializedName("hubid")
	@Nonnull public int hubid;
}
