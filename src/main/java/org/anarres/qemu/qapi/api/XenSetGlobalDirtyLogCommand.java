package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=xen-set-global-dirty-log, returns=null, data={enable=bool}}
public class XenSetGlobalDirtyLogCommand extends QApiCommand<XenSetGlobalDirtyLogCommand.XenSetGlobalDirtyLogArguments, XenSetGlobalDirtyLogCommand.Response> {
	public static class XenSetGlobalDirtyLogArguments {
		@SerializedName("enable")
		@Nonnull public boolean enable;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public XenSetGlobalDirtyLogCommand(@Nonnull XenSetGlobalDirtyLogCommand.XenSetGlobalDirtyLogArguments argument) {
		super("xen-set-global-dirty-log", Response.class, argument);
	}
}
