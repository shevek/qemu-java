package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NetdevBridgeOptions, data={*br=str, *helper=str}, innerTypes=null}
public class NetdevBridgeOptions extends QApiType {

	@SerializedName("br")
	@CheckForNull public String br;
	@SerializedName("helper")
	@CheckForNull public String helper;
}
