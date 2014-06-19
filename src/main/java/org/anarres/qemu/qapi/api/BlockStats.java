package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockStats, data={*device=str, stats=BlockDeviceStats, *parent=BlockStats, *backing=BlockStats}, innerTypes=null, fields=null}
public class BlockStats extends QApiObject {

	@SerializedName("device")
	@CheckForNull public String device;
	@SerializedName("stats")
	@Nonnull public BlockDeviceStats stats;
	@SerializedName("parent")
	@CheckForNull public BlockStats parent;
	@SerializedName("backing")
	@CheckForNull public BlockStats backing;
}
