package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=VersionInfo, data={qemu={major=int, minor=int, micro=int}, package=str}, innerTypes=null}
public class VersionInfo extends QApiType {
	// QApiTypeDescriptor{name=_Tqemu, data={major=int, minor=int, micro=int}, innerTypes=[]}
	public static class _Tqemu {
		@SerializedName("major")
		@Nonnull public long major;
		@SerializedName("minor")
		@Nonnull public long minor;
		@SerializedName("micro")
		@Nonnull public long micro;
	}

	@SerializedName("qemu")
	@Nonnull public _Tqemu qemu;
	@SerializedName("package")
	@Nonnull public String _package;
}
