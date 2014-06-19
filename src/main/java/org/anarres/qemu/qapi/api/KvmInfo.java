package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=KvmInfo, data={enabled=bool, present=bool}, innerTypes=null}
public class KvmInfo extends QApiType {

	@SerializedName("enabled")
	@Nonnull public boolean enabled;
	@SerializedName("present")
	@Nonnull public boolean present;
}
