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
 * <pre>QApiTypeDescriptor{name=BlockJobInfo, data={type=str, device=str, len=int, offset=int, busy=bool, paused=bool, speed=int, io-status=BlockDeviceIoStatus, ready=bool}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockJobInfo, data={type=str, device=str, len=int, offset=int, busy=bool, paused=bool, speed=int, io-status=BlockDeviceIoStatus, ready=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockJobInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("len")
	@Nonnull
	public long len;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("offset")
	@Nonnull
	public long offset;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("busy")
	@Nonnull
	public boolean busy;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("paused")
	@Nonnull
	public boolean paused;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("speed")
	@Nonnull
	public long speed;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("io-status")
	@Nonnull
	public BlockDeviceIoStatus ioStatus;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ready")
	@Nonnull
	public boolean ready;

	@Nonnull
	public BlockJobInfo withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withLen(long value) {
		this.len = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withOffset(long value) {
		this.offset = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withBusy(boolean value) {
		this.busy = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withPaused(boolean value) {
		this.paused = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withSpeed(long value) {
		this.speed = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withIoStatus(BlockDeviceIoStatus value) {
		this.ioStatus = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withReady(boolean value) {
		this.ready = value;
		return this;
	}

	public BlockJobInfo() {
	}

	public BlockJobInfo(java.lang.String type, java.lang.String device, long len, long offset, boolean busy, boolean paused, long speed, BlockDeviceIoStatus ioStatus, boolean ready) {
		this.type = type;
		this.device = device;
		this.len = len;
		this.offset = offset;
		this.busy = busy;
		this.paused = paused;
		this.speed = speed;
		this.ioStatus = ioStatus;
		this.ready = ready;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("type");
		names.add("device");
		names.add("len");
		names.add("offset");
		names.add("busy");
		names.add("paused");
		names.add("speed");
		names.add("io-status");
		names.add("ready");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("type".equals(name))
			return type;
		if ("device".equals(name))
			return device;
		if ("len".equals(name))
			return len;
		if ("offset".equals(name))
			return offset;
		if ("busy".equals(name))
			return busy;
		if ("paused".equals(name))
			return paused;
		if ("speed".equals(name))
			return speed;
		if ("io-status".equals(name))
			return ioStatus;
		if ("ready".equals(name))
			return ready;
		return super.getFieldByName(name);
	}
}