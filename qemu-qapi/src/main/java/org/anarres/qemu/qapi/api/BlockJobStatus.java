package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BlockJobStatus, data=[undefined, created, running, paused, ready, standby, waiting, pending, aborting, concluded, null], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BlockJobStatus, data=[undefined, created, running, paused, ready, standby, waiting, pending, aborting, concluded, null], fields=null}
public enum BlockJobStatus {
	undefined("undefined"),
	created("created"),
	running("running"),
	paused("paused"),
	ready("ready"),
	standby("standby"),
	waiting("waiting"),
	pending("pending"),
	aborting("aborting"),
	concluded("concluded"),
	_null("null"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockJobStatus(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
