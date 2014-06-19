package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=PciBridgeInfo, data={bus={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, *devices=[PciDeviceInfo]}, innerTypes=null, fields=null}
public class PciBridgeInfo extends QApiObject {
	// QApiTypeDescriptor{name=_Tbus, data={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, innerTypes=[], fields=[org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@15e9fab0, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@3449440d, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@3612cc4c, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@c22ad50, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@38a06569, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@2a61ed8a]}
	public static class _Tbus {
		@SerializedName("number")
		@Nonnull public long number;
		@SerializedName("secondary")
		@Nonnull public long secondary;
		@SerializedName("subordinate")
		@Nonnull public long subordinate;
		@SerializedName("io_range")
		@Nonnull public PciMemoryRange ioRange;
		@SerializedName("memory_range")
		@Nonnull public PciMemoryRange memoryRange;
		@SerializedName("prefetchable_range")
		@Nonnull public PciMemoryRange prefetchableRange;
	}

	@SerializedName("bus")
	@Nonnull public _Tbus bus;
	@SerializedName("devices")
	@CheckForNull public List<PciDeviceInfo> devices;
}
