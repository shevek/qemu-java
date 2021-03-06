package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=CpuModelCompareResult, data=[incompatible, identical, superset, subset], fields=null}</pre>
 */
// QApiEnumDescriptor{name=CpuModelCompareResult, data=[incompatible, identical, superset, subset], fields=null}
public enum CpuModelCompareResult {
	incompatible("incompatible"),
	identical("identical"),
	superset("superset"),
	subset("subset"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ CpuModelCompareResult(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
