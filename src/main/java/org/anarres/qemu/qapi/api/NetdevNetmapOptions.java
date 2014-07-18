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
 * <p><pre>QApiTypeDescriptor{name=NetdevNetmapOptions, data={ifname=str, *devname=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NetdevNetmapOptions, data={ifname=str, *devname=str}, innerTypes=null}
public class NetdevNetmapOptions extends QApiType {

	@SerializedName("ifname")
	@Nonnull
	public java.lang.String ifname;
	@SerializedName("devname")
	@CheckForNull
	public java.lang.String devname;

	public NetdevNetmapOptions() {
	}

	public NetdevNetmapOptions(java.lang.String ifname, java.lang.String devname) {
		this.ifname = ifname;
		this.devname = devname;
	}
}
