package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=xen-save-devices-state, returns=null, data={filename=str}}
public class XenSaveDevicesStateCommand extends QApiCommand<XenSaveDevicesStateCommand.XenSaveDevicesStateArguments, Void> {
	public static class XenSaveDevicesStateArguments {
		@SerializedName("filename")
		@Nonnull public String filename;
	}

	public XenSaveDevicesStateCommand(@Nonnull XenSaveDevicesStateCommand.XenSaveDevicesStateArguments argument) {
		super("xen-save-devices-state", new TypeToken<Void>() {}, argument);
	}
}
