package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiUnionDescriptor{name=MemoryDeviceInfo, discriminator=null, data={dimm=PCDIMMDeviceInfo, nvdimm=PCDIMMDeviceInfo}, innerTypes=null, fields=null, base=null, discriminatorField=null}</pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MemoryDeviceInfo extends QApiType implements QApiUnion {
	public static enum Discriminator {
		dimm,
		nvdimm,
		__NONE;
	}

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@Nonnull
	@JsonProperty("type")
	public Discriminator type;

	@Nonnull
	public final Discriminator getType() {
		return type;
	}

	// union {
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("dimm")
	@JsonUnwrapped
	@CheckForNull
	public PCDIMMDeviceInfo dimm;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("nvdimm")
	@JsonUnwrapped
	@CheckForNull
	public PCDIMMDeviceInfo nvdimm;
	// }

	@Nonnull
	public static MemoryDeviceInfo dimm(@Nonnull PCDIMMDeviceInfo dimm) {
		MemoryDeviceInfo self = new MemoryDeviceInfo();
		self.type = Discriminator.dimm;
		self.dimm = dimm;
		return self;
	}

	@Nonnull
	public static MemoryDeviceInfo nvdimm(@Nonnull PCDIMMDeviceInfo nvdimm) {
		MemoryDeviceInfo self = new MemoryDeviceInfo();
		self.type = Discriminator.nvdimm;
		self.nvdimm = nvdimm;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("dimm");
		names.add("nvdimm");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("dimm".equals(name))
			return dimm;
		if ("nvdimm".equals(name))
			return nvdimm;
		return super.getFieldByName(name);
	}

	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (dimm != null)
			count++;
		if (nvdimm != null)
			count++;
		return (count == 1);
	}
}
