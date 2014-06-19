package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ChardevFile, data={*in=str, out=str}, innerTypes=null, fields=null}
public class ChardevFile extends QApiObject {

	@SerializedName("in")
	@CheckForNull public String in;
	@SerializedName("out")
	@Nonnull public String out;
}
