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
 * <pre>QApiTypeDescriptor{name=FdsetInfo, data={fdset-id=int, fds=[FdsetFdInfo]}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=FdsetInfo, data={fdset-id=int, fds=[FdsetFdInfo]}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FdsetInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fdset-id")
	@Nonnull
	public long fdsetId;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fds")
	@Nonnull
	public java.util.List<FdsetFdInfo> fds;

	@Nonnull
	public FdsetInfo withFdsetId(long value) {
		this.fdsetId = value;
		return this;
	}

	@Nonnull
	public FdsetInfo withFds(java.util.List<FdsetFdInfo> value) {
		this.fds = value;
		return this;
	}

	public FdsetInfo() {
	}

	public FdsetInfo(long fdsetId, java.util.List<FdsetFdInfo> fds) {
		this.fdsetId = fdsetId;
		this.fds = fds;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("fdset-id");
		names.add("fds");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("fdset-id".equals(name))
			return fdsetId;
		if ("fds".equals(name))
			return fds;
		return super.getFieldByName(name);
	}
}