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
 * <pre>QApiStructDescriptor{name=SchemaInfoBuiltin, data={json-type=JSONType}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=SchemaInfoBuiltin, data={json-type=JSONType}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SchemaInfoBuiltin extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("json-type")
	@Nonnull
	public JSONType jsonType;

	@Nonnull
	public SchemaInfoBuiltin withJsonType(JSONType value) {
		this.jsonType = value;
		return this;
	}

	public SchemaInfoBuiltin() {
	}

	public SchemaInfoBuiltin(JSONType jsonType) {
		this.jsonType = jsonType;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("json-type");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("json-type".equals(name))
			return jsonType;
		return super.getFieldByName(name);
	}
}
