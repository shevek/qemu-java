package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=RTC_CHANGE, data={offset=int}}
public class RtcChangeEvent extends QApiEvent {
	@SerializedName("offset")
	@Nonnull public long offset;
}
