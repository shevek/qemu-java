package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=SocketAddress, data={inet=InetSocketAddress, unix=UnixSocketAddress, fd=String}, innerTypes=null, fields=null}
public class SocketAddress extends QApiObject {
	@SerializedName("inet")
	@Nonnull public InetSocketAddress inet;
	@SerializedName("unix")
	@Nonnull public UnixSocketAddress unix;
	@SerializedName("fd")
	@Nonnull public String fd;

/*
	public boolean isUnion() {
		ONE: {
			if (inet != null)
				break ONE;
			if (unix != null)
				break ONE;
			if (fd != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (inet != null)
				return false;	// More than one field is set.
			if (unix != null)
				return false;	// More than one field is set.
			if (fd != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
