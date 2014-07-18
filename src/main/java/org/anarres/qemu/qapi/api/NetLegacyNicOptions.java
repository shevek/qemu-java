package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=NetLegacyNicOptions, data={*netdev=str, *macaddr=str, *model=str, *addr=str, *vectors=uint32}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NetLegacyNicOptions, data={*netdev=str, *macaddr=str, *model=str, *addr=str, *vectors=uint32}, innerTypes=null}
public class NetLegacyNicOptions extends QApiType {

	@SerializedName("netdev")
	@CheckForNull
	public java.lang.String netdev;
	@SerializedName("macaddr")
	@CheckForNull
	public java.lang.String macaddr;
	@SerializedName("model")
	@CheckForNull
	public java.lang.String model;
	@SerializedName("addr")
	@CheckForNull
	public java.lang.String addr;
	@SerializedName("vectors")
	@CheckForNull
	public long vectors;

	public NetLegacyNicOptions() {
	}

	public NetLegacyNicOptions(java.lang.String netdev, java.lang.String macaddr, java.lang.String model, java.lang.String addr, long vectors) {
		this.netdev = netdev;
		this.macaddr = macaddr;
		this.model = model;
		this.addr = addr;
		this.vectors = vectors;
	}
}
