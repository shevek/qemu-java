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
 * <pre>QApiStructDescriptor{name=BlockdevOptionsNbd, data={server=SocketAddress, *export=str, *tls-creds=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsNbd, data={server=SocketAddress, *export=str, *tls-creds=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsNbd extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("server")
	@Nonnull
	public SocketAddress server;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("export")
	@CheckForNull
	public java.lang.String export;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("tls-creds")
	@CheckForNull
	public java.lang.String tlsCreds;

	@Nonnull
	public BlockdevOptionsNbd withServer(SocketAddress value) {
		this.server = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsNbd withExport(java.lang.String value) {
		this.export = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsNbd withTlsCreds(java.lang.String value) {
		this.tlsCreds = value;
		return this;
	}

	public BlockdevOptionsNbd() {
	}

	public BlockdevOptionsNbd(SocketAddress server, java.lang.String export, java.lang.String tlsCreds) {
		this.server = server;
		this.export = export;
		this.tlsCreds = tlsCreds;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("server");
		names.add("export");
		names.add("tls-creds");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("server".equals(name))
			return server;
		if ("export".equals(name))
			return export;
		if ("tls-creds".equals(name))
			return tlsCreds;
		return super.getFieldByName(name);
	}
}
