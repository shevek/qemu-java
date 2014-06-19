package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=PciDeviceInfo, data={bus=int, slot=int, function=int, class_info={*desc=str, class=int}, id={device=int, vendor=int}, *irq=int, qdev_id=str, *pci_bridge=PciBridgeInfo, regions=[PciMemoryRegion]}, innerTypes=null, fields=null}
public class PciDeviceInfo extends QApiObject {
	// QApiTypeDescriptor{name=_Tclass_info, data={*desc=str, class=int}, innerTypes=[], fields=[org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@5d0d8a46, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@23f12964]}
	public static class _Tclass_info {
		@SerializedName("desc")
		@CheckForNull public String desc;
		@SerializedName("class")
		@Nonnull public long _class;
	}
	// QApiTypeDescriptor{name=_Tid, data={device=int, vendor=int}, innerTypes=[], fields=[org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@411541d8, org.anarres.qemu.qapi.generator.model.AbstractQApiTypeDescriptor$Field@5a95ed49]}
	public static class _Tid {
		@SerializedName("device")
		@Nonnull public long device;
		@SerializedName("vendor")
		@Nonnull public long vendor;
	}

	@SerializedName("bus")
	@Nonnull public long bus;
	@SerializedName("slot")
	@Nonnull public long slot;
	@SerializedName("function")
	@Nonnull public long function;
	@SerializedName("class_info")
	@Nonnull public _Tclass_info classInfo;
	@SerializedName("id")
	@Nonnull public _Tid id;
	@SerializedName("irq")
	@CheckForNull public long irq;
	@SerializedName("qdev_id")
	@Nonnull public String qdevId;
	@SerializedName("pci_bridge")
	@CheckForNull public PciBridgeInfo pciBridge;
	@SerializedName("regions")
	@Nonnull public List<PciMemoryRegion> regions;
}
