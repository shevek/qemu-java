package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=StatusInfo, data={running=bool, singlestep=bool, status=RunState}, innerTypes=null, fields=null}
public class StatusInfo extends QApiType {

	@SerializedName("running")
	@Nonnull public boolean running;
	@SerializedName("singlestep")
	@Nonnull public boolean singlestep;
	@SerializedName("status")
	@Nonnull public RunState status;
}
