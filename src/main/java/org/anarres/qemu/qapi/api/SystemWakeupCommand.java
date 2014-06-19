package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=system_wakeup, returns=null, data=null}
public class SystemWakeupCommand extends QApiCommand<Void, Void> {

	public SystemWakeupCommand() {
		super("system_wakeup", new TypeToken<Void>() {}, null);
	}
}
