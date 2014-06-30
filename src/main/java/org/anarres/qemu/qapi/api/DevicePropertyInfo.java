package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=DevicePropertyInfo, data={name=str, type=str}, innerTypes=null}
public class DevicePropertyInfo extends QApiType {

	@SerializedName("name")
	@Nonnull public String name;
	@SerializedName("type")
	@Nonnull public String type;
}
