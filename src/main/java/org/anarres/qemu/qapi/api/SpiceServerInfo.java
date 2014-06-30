package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=SpiceServerInfo, data={*auth=str}, innerTypes=null}
public class SpiceServerInfo extends QApiType {

	@SerializedName("auth")
	@CheckForNull public String auth;
}
