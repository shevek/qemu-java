package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=NetClientOptions, data={none=NetdevNoneOptions, nic=NetLegacyNicOptions, user=NetdevUserOptions, tap=NetdevTapOptions, socket=NetdevSocketOptions, vde=NetdevVdeOptions, dump=NetdevDumpOptions, bridge=NetdevBridgeOptions, hubport=NetdevHubPortOptions, netmap=NetdevNetmapOptions}, innerTypes=null, fields=null}
public class NetClientOptions extends QApiObject {
	@SerializedName("none")
	@Nonnull public NetdevNoneOptions none;
	@SerializedName("nic")
	@Nonnull public NetLegacyNicOptions nic;
	@SerializedName("user")
	@Nonnull public NetdevUserOptions user;
	@SerializedName("tap")
	@Nonnull public NetdevTapOptions tap;
	@SerializedName("socket")
	@Nonnull public NetdevSocketOptions socket;
	@SerializedName("vde")
	@Nonnull public NetdevVdeOptions vde;
	@SerializedName("dump")
	@Nonnull public NetdevDumpOptions dump;
	@SerializedName("bridge")
	@Nonnull public NetdevBridgeOptions bridge;
	@SerializedName("hubport")
	@Nonnull public NetdevHubPortOptions hubport;
	@SerializedName("netmap")
	@Nonnull public NetdevNetmapOptions netmap;

/*
	public boolean isUnion() {
		ONE: {
			if (none != null)
				break ONE;
			if (nic != null)
				break ONE;
			if (user != null)
				break ONE;
			if (tap != null)
				break ONE;
			if (socket != null)
				break ONE;
			if (vde != null)
				break ONE;
			if (dump != null)
				break ONE;
			if (bridge != null)
				break ONE;
			if (hubport != null)
				break ONE;
			if (netmap != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (none != null)
				return false;	// More than one field is set.
			if (nic != null)
				return false;	// More than one field is set.
			if (user != null)
				return false;	// More than one field is set.
			if (tap != null)
				return false;	// More than one field is set.
			if (socket != null)
				return false;	// More than one field is set.
			if (vde != null)
				return false;	// More than one field is set.
			if (dump != null)
				return false;	// More than one field is set.
			if (bridge != null)
				return false;	// More than one field is set.
			if (hubport != null)
				return false;	// More than one field is set.
			if (netmap != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
