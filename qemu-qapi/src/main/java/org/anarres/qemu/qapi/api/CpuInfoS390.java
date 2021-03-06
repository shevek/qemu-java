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
 * <pre>QApiStructDescriptor{name=CpuInfoS390, data={cpu-state=CpuS390State}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=CpuInfoS390, data={cpu-state=CpuS390State}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CpuInfoS390 extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cpu-state")
	@Nonnull
	public CpuS390State cpuState;

	@Nonnull
	public CpuInfoS390 withCpuState(CpuS390State value) {
		this.cpuState = value;
		return this;
	}

	public CpuInfoS390() {
	}

	public CpuInfoS390(CpuS390State cpuState) {
		this.cpuState = cpuState;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("cpu-state");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("cpu-state".equals(name))
			return cpuState;
		return super.getFieldByName(name);
	}
}
