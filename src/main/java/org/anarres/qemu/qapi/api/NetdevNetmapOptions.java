package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=NetdevNetmapOptions, data={ifname=str, *devname=str}, innerTypes=null}
public class NetdevNetmapOptions extends QApiType {

	@SerializedName("ifname")
	@Nonnull public String ifname;
	@SerializedName("devname")
	@CheckForNull public String devname;
}
