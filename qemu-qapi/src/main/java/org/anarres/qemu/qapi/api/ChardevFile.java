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
 * <pre>QApiStructDescriptor{name=ChardevFile, data={*in=str, out=str, *append=bool}, innerTypes=null, fields=null, base=ChardevCommon}</pre>
 */
// QApiStructDescriptor{name=ChardevFile, data={*in=str, out=str, *append=bool}, innerTypes=null, fields=null, base=ChardevCommon}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevFile extends ChardevCommon {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("in")
	@CheckForNull
	public java.lang.String in;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("out")
	@Nonnull
	public java.lang.String out;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("append")
	@CheckForNull
	public java.lang.Boolean append;

	@Nonnull
	public ChardevFile withIn(java.lang.String value) {
		this.in = value;
		return this;
	}

	@Nonnull
	public ChardevFile withOut(java.lang.String value) {
		this.out = value;
		return this;
	}

	@Nonnull
	public ChardevFile withAppend(java.lang.Boolean value) {
		this.append = value;
		return this;
	}

	public ChardevFile() {
	}

	public ChardevFile(java.lang.String in, java.lang.String out, java.lang.Boolean append) {
		this.in = in;
		this.out = out;
		this.append = append;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("in");
		names.add("out");
		names.add("append");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("in".equals(name))
			return in;
		if ("out".equals(name))
			return out;
		if ("append".equals(name))
			return append;
		return super.getFieldByName(name);
	}
}
