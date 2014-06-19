package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=MachineInfo, data={name=str, *alias=str, *is-default=bool, cpu-max=int}, innerTypes=null}
public class MachineInfo extends QApiType {

	@SerializedName("name")
	@Nonnull public String name;
	@SerializedName("alias")
	@CheckForNull public String alias;
	@SerializedName("is-default")
	@CheckForNull public boolean isDefault;
	@SerializedName("cpu-max")
	@Nonnull public long cpuMax;
}
