package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=AddfdInfo, data={fdset-id=int, fd=int}, innerTypes=null, fields=null}
public class AddfdInfo extends QApiObject {

	@SerializedName("fdset-id")
	@Nonnull public long fdsetId;
	@SerializedName("fd")
	@Nonnull public long fd;
}
