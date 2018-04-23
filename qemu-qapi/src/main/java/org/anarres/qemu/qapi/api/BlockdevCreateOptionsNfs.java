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
 * <pre>QApiStructDescriptor{name=BlockdevCreateOptionsNfs, data={location=BlockdevOptionsNfs, size=size}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevCreateOptionsNfs, data={location=BlockdevOptionsNfs, size=size}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevCreateOptionsNfs extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("location")
	@Nonnull
	public BlockdevOptionsNfs location;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("size")
	@Nonnull
	public long size;

	@Nonnull
	public BlockdevCreateOptionsNfs withLocation(BlockdevOptionsNfs value) {
		this.location = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsNfs withSize(long value) {
		this.size = value;
		return this;
	}

	public BlockdevCreateOptionsNfs() {
	}

	public BlockdevCreateOptionsNfs(BlockdevOptionsNfs location, long size) {
		this.location = location;
		this.size = size;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("location");
		names.add("size");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("location".equals(name))
			return location;
		if ("size".equals(name))
			return size;
		return super.getFieldByName(name);
	}
}