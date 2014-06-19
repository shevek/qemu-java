package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=FdsetInfo, data={fdset-id=int, fds=[FdsetFdInfo]}, innerTypes=null, fields=null}
public class FdsetInfo extends QApiObject {

	@SerializedName("fdset-id")
	@Nonnull public long fdsetId;
	@SerializedName("fds")
	@Nonnull public List<FdsetFdInfo> fds;
}
