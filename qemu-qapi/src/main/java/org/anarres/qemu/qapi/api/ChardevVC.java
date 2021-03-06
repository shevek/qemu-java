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
 * <pre>QApiStructDescriptor{name=ChardevVC, data={*width=int, *height=int, *cols=int, *rows=int}, innerTypes=null, fields=null, base=ChardevCommon}</pre>
 */
// QApiStructDescriptor{name=ChardevVC, data={*width=int, *height=int, *cols=int, *rows=int}, innerTypes=null, fields=null, base=ChardevCommon}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevVC extends ChardevCommon {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("width")
	@CheckForNull
	public java.lang.Long width;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("height")
	@CheckForNull
	public java.lang.Long height;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cols")
	@CheckForNull
	public java.lang.Long cols;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rows")
	@CheckForNull
	public java.lang.Long rows;

	@Nonnull
	public ChardevVC withWidth(java.lang.Long value) {
		this.width = value;
		return this;
	}

	@Nonnull
	public ChardevVC withHeight(java.lang.Long value) {
		this.height = value;
		return this;
	}

	@Nonnull
	public ChardevVC withCols(java.lang.Long value) {
		this.cols = value;
		return this;
	}

	@Nonnull
	public ChardevVC withRows(java.lang.Long value) {
		this.rows = value;
		return this;
	}

	public ChardevVC() {
	}

	public ChardevVC(java.lang.Long width, java.lang.Long height, java.lang.Long cols, java.lang.Long rows) {
		this.width = width;
		this.height = height;
		this.cols = cols;
		this.rows = rows;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("width");
		names.add("height");
		names.add("cols");
		names.add("rows");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("width".equals(name))
			return width;
		if ("height".equals(name))
			return height;
		if ("cols".equals(name))
			return cols;
		if ("rows".equals(name))
			return rows;
		return super.getFieldByName(name);
	}
}
