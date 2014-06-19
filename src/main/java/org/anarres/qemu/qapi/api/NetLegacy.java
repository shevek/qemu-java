package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NetLegacy, data={*vlan=int32, *id=str, *name=str, opts=NetClientOptions}, innerTypes=null, fields=null}
public class NetLegacy extends QApiObject {

	@SerializedName("vlan")
	@CheckForNull public int vlan;
	@SerializedName("id")
	@CheckForNull public String id;
	@SerializedName("name")
	@CheckForNull public String name;
	@SerializedName("opts")
	@Nonnull public NetClientOptions opts;
}
