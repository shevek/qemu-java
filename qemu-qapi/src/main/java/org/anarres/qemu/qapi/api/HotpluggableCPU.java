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
 * <pre>QApiStructDescriptor{name=HotpluggableCPU, data={type=str, vcpus-count=int, props=CpuInstanceProperties, *qom-path=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=HotpluggableCPU, data={type=str, vcpus-count=int, props=CpuInstanceProperties, *qom-path=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HotpluggableCPU extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vcpus-count")
	@Nonnull
	public long vcpusCount;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("props")
	@Nonnull
	public CpuInstanceProperties props;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("qom-path")
	@CheckForNull
	public java.lang.String qomPath;

	@Nonnull
	public HotpluggableCPU withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	@Nonnull
	public HotpluggableCPU withVcpusCount(long value) {
		this.vcpusCount = value;
		return this;
	}

	@Nonnull
	public HotpluggableCPU withProps(CpuInstanceProperties value) {
		this.props = value;
		return this;
	}

	@Nonnull
	public HotpluggableCPU withQomPath(java.lang.String value) {
		this.qomPath = value;
		return this;
	}

	public HotpluggableCPU() {
	}

	public HotpluggableCPU(java.lang.String type, long vcpusCount, CpuInstanceProperties props, java.lang.String qomPath) {
		this.type = type;
		this.vcpusCount = vcpusCount;
		this.props = props;
		this.qomPath = qomPath;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("type");
		names.add("vcpus-count");
		names.add("props");
		names.add("qom-path");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("type".equals(name))
			return type;
		if ("vcpus-count".equals(name))
			return vcpusCount;
		if ("props".equals(name))
			return props;
		if ("qom-path".equals(name))
			return qomPath;
		return super.getFieldByName(name);
	}
}
