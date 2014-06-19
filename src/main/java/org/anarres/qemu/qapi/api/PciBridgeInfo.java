package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=PciBridgeInfo, data={bus={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, *devices=[PciDeviceInfo]}, innerTypes=null, fields=null}
public class PciBridgeInfo extends QApiType {
	// QApiTypeDescriptor{name=_Tbus, data={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, innerTypes=[], fields=[org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@4f4f5969, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@6277252c, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@7c299e34, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@1051a79b, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@60d2b97b, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@2a8f6be6]}
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
