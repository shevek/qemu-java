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
 * <pre>QApiStructDescriptor{name=BlockdevOptionsReplication, data={mode=ReplicationMode, *top-id=str}, innerTypes=null, fields=null, base=BlockdevOptionsGenericFormat}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsReplication, data={mode=ReplicationMode, *top-id=str}, innerTypes=null, fields=null, base=BlockdevOptionsGenericFormat}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsReplication extends BlockdevOptionsGenericFormat {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("mode")
	@Nonnull
	public ReplicationMode mode;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("top-id")
	@CheckForNull
	public java.lang.String topId;

	@Nonnull
	public BlockdevOptionsReplication withMode(ReplicationMode value) {
		this.mode = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsReplication withTopId(java.lang.String value) {
		this.topId = value;
		return this;
	}

	public BlockdevOptionsReplication() {
	}

	public BlockdevOptionsReplication(ReplicationMode mode, java.lang.String topId) {
		this.mode = mode;
		this.topId = topId;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("mode");
		names.add("top-id");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("mode".equals(name))
			return mode;
		if ("top-id".equals(name))
			return topId;
		return super.getFieldByName(name);
	}
}