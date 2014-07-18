package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=xen-save-devices-state, returns=null, data={filename=str}}</pre></p>
 */
// QApiCommandDescriptor{name=xen-save-devices-state, returns=null, data={filename=str}}
public class XenSaveDevicesStateCommand extends QApiCommand<XenSaveDevicesStateCommand.Arguments, XenSaveDevicesStateCommand.Response> {
	/** Compound arguments to a XenSaveDevicesStateCommand. */
	public static class Arguments {

		@SerializedName("filename")
		@Nonnull
		public java.lang.String filename;

		public Arguments() {
		}

		public Arguments(java.lang.String filename) {
			this.filename = filename;
		}
	}

	/** Response to a XenSaveDevicesStateCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new XenSaveDevicesStateCommand. */
	public XenSaveDevicesStateCommand(@Nonnull XenSaveDevicesStateCommand.Arguments argument) {
		super("xen-save-devices-state", Response.class, argument);
	}

	public XenSaveDevicesStateCommand(
		java.lang.String filename			) {
		this(new Arguments(filename));
	}
}
