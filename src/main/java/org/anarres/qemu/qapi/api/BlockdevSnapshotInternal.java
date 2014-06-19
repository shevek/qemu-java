package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevSnapshotInternal, data={device=str, name=str}, innerTypes=null}
public class BlockdevSnapshotInternal extends QApiType {

	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("name")
	@Nonnull public String name;
}
