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
 * <pre>QApiStructDescriptor{name=GICCapability, data={version=int, emulated=bool, kernel=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=GICCapability, data={version=int, emulated=bool, kernel=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GICCapability extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("version")
	@Nonnull
	public long version;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("emulated")
	@Nonnull
	public boolean emulated;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("kernel")
	@Nonnull
	public boolean kernel;

	@Nonnull
	public GICCapability withVersion(long value) {
		this.version = value;
		return this;
	}

	@Nonnull
	public GICCapability withEmulated(boolean value) {
		this.emulated = value;
		return this;
	}

	@Nonnull
	public GICCapability withKernel(boolean value) {
		this.kernel = value;
		return this;
	}

	public GICCapability() {
	}

	public GICCapability(long version, boolean emulated, boolean kernel) {
		this.version = version;
		this.emulated = emulated;
		this.kernel = kernel;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("version");
		names.add("emulated");
		names.add("kernel");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("version".equals(name))
			return version;
		if ("emulated".equals(name))
			return emulated;
		if ("kernel".equals(name))
			return kernel;
		return super.getFieldByName(name);
	}
}
