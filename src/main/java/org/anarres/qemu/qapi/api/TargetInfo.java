package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=TargetInfo, data={arch=str}, innerTypes=null, fields=null}
public class TargetInfo extends QApiType {

	@SerializedName("arch")
	@Nonnull public String arch;
}
