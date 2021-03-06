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
 * <pre>QApiStructDescriptor{name=GuidInfo, data={guid=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=GuidInfo, data={guid=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GuidInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("guid")
	@Nonnull
	public java.lang.String guid;

	@Nonnull
	public GuidInfo withGuid(java.lang.String value) {
		this.guid = value;
		return this;
	}

	public GuidInfo() {
	}

	public GuidInfo(java.lang.String guid) {
		this.guid = guid;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("guid");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("guid".equals(name))
			return guid;
		return super.getFieldByName(name);
	}
}
