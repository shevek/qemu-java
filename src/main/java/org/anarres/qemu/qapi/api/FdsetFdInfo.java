package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=FdsetFdInfo, data={fd=int, *opaque=str}, innerTypes=null, fields=null}
public class FdsetFdInfo extends QApiType {

	@SerializedName("fd")
	@Nonnull public long fd;
	@SerializedName("opaque")
	@CheckForNull public String opaque;
}
