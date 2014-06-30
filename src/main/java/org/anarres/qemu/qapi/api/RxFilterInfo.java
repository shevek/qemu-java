package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=RxFilterInfo, data={name=str, promiscuous=bool, multicast=RxState, unicast=RxState, vlan=RxState, broadcast-allowed=bool, multicast-overflow=bool, unicast-overflow=bool, main-mac=str, vlan-table=[int], unicast-table=[str], multicast-table=[str]}, innerTypes=null}
public class RxFilterInfo extends QApiType {

	@SerializedName("name")
	@Nonnull public String name;
	@SerializedName("promiscuous")
	@Nonnull public boolean promiscuous;
	@SerializedName("multicast")
	@Nonnull public RxState multicast;
	@SerializedName("unicast")
	@Nonnull public RxState unicast;
	@SerializedName("vlan")
	@Nonnull public RxState vlan;
	@SerializedName("broadcast-allowed")
	@Nonnull public boolean broadcastAllowed;
	@SerializedName("multicast-overflow")
	@Nonnull public boolean multicastOverflow;
	@SerializedName("unicast-overflow")
	@Nonnull public boolean unicastOverflow;
	@SerializedName("main-mac")
	@Nonnull public String mainMac;
	@SerializedName("vlan-table")
	@Nonnull public List<Long> vlanTable;
	@SerializedName("unicast-table")
	@Nonnull public List<String> unicastTable;
	@SerializedName("multicast-table")
	@Nonnull public List<String> multicastTable;
}
