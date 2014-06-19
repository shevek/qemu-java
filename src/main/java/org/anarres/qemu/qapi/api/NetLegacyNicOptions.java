package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NetLegacyNicOptions, data={*netdev=str, *macaddr=str, *model=str, *addr=str, *vectors=uint32}, innerTypes=null, fields=null}
public class NetLegacyNicOptions extends QApiObject {

	@SerializedName("netdev")
	@CheckForNull public String netdev;
	@SerializedName("macaddr")
	@CheckForNull public String macaddr;
	@SerializedName("model")
	@CheckForNull public String model;
	@SerializedName("addr")
	@CheckForNull public String addr;
	@SerializedName("vectors")
	@CheckForNull public long vectors;
}
