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
 * <pre>QApiStructDescriptor{name=DumpQueryResult, data={status=DumpStatus, completed=int, total=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=DumpQueryResult, data={status=DumpStatus, completed=int, total=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DumpQueryResult extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("status")
	@Nonnull
	public DumpStatus status;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("completed")
	@Nonnull
	public long completed;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("total")
	@Nonnull
	public long total;

	@Nonnull
	public DumpQueryResult withStatus(DumpStatus value) {
		this.status = value;
		return this;
	}

	@Nonnull
	public DumpQueryResult withCompleted(long value) {
		this.completed = value;
		return this;
	}

	@Nonnull
	public DumpQueryResult withTotal(long value) {
		this.total = value;
		return this;
	}

	public DumpQueryResult() {
	}

	public DumpQueryResult(DumpStatus status, long completed, long total) {
		this.status = status;
		this.completed = completed;
		this.total = total;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("status");
		names.add("completed");
		names.add("total");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("status".equals(name))
			return status;
		if ("completed".equals(name))
			return completed;
		if ("total".equals(name))
			return total;
		return super.getFieldByName(name);
	}
}
