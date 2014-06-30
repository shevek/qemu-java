package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=ChardevStdio, data={*signal=bool}, innerTypes=null}
public class ChardevStdio extends QApiType {

	@SerializedName("signal")
	@CheckForNull public boolean signal;
}
