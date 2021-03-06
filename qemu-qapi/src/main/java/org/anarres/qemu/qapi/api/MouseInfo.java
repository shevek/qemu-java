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
 * <pre>QApiStructDescriptor{name=MouseInfo, data={name=str, index=int, current=bool, absolute=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=MouseInfo, data={name=str, index=int, current=bool, absolute=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MouseInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("index")
	@Nonnull
	public long index;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("current")
	@Nonnull
	public boolean current;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("absolute")
	@Nonnull
	public boolean absolute;

	@Nonnull
	public MouseInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public MouseInfo withIndex(long value) {
		this.index = value;
		return this;
	}

	@Nonnull
	public MouseInfo withCurrent(boolean value) {
		this.current = value;
		return this;
	}

	@Nonnull
	public MouseInfo withAbsolute(boolean value) {
		this.absolute = value;
		return this;
	}

	public MouseInfo() {
	}

	public MouseInfo(java.lang.String name, long index, boolean current, boolean absolute) {
		this.name = name;
		this.index = index;
		this.current = current;
		this.absolute = absolute;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("name");
		names.add("index");
		names.add("current");
		names.add("absolute");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("name".equals(name))
			return name;
		if ("index".equals(name))
			return index;
		if ("current".equals(name))
			return current;
		if ("absolute".equals(name))
			return absolute;
		return super.getFieldByName(name);
	}
}
