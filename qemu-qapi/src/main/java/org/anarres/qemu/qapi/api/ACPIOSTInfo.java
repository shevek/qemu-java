package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=ACPIOSTInfo, data={*device=str, slot=str, slot-type=ACPISlotType, source=int, status=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=ACPIOSTInfo, data={*device=str, slot=str, slot-type=ACPISlotType, source=int, status=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ACPIOSTInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("device")
	@CheckForNull
	public java.lang.String device;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("slot")
	@Nonnull
	public java.lang.String slot;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("slot-type")
	@Nonnull
	public ACPISlotType slotType;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("source")
	@Nonnull
	public long source;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("status")
	@Nonnull
	public long status;

	@Nonnull
	public ACPIOSTInfo withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public ACPIOSTInfo withSlot(java.lang.String value) {
		this.slot = value;
		return this;
	}

	@Nonnull
	public ACPIOSTInfo withSlotType(ACPISlotType value) {
		this.slotType = value;
		return this;
	}

	@Nonnull
	public ACPIOSTInfo withSource(long value) {
		this.source = value;
		return this;
	}

	@Nonnull
	public ACPIOSTInfo withStatus(long value) {
		this.status = value;
		return this;
	}

	public ACPIOSTInfo() {
	}

	public ACPIOSTInfo(java.lang.String device, java.lang.String slot, ACPISlotType slotType, long source, long status) {
		this.device = device;
		this.slot = slot;
		this.slotType = slotType;
		this.source = source;
		this.status = status;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("device");
		names.add("slot");
		names.add("slot-type");
		names.add("source");
		names.add("status");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("device".equals(name))
			return device;
		if ("slot".equals(name))
			return slot;
		if ("slot-type".equals(name))
			return slotType;
		if ("source".equals(name))
			return source;
		if ("status".equals(name))
			return status;
		return super.getFieldByName(name);
	}
}