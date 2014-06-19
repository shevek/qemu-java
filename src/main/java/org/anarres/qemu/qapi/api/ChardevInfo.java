package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ChardevInfo, data={label=str, filename=str}, innerTypes=null, fields=null}
public class ChardevInfo extends QApiObject {

	@SerializedName("label")
	@Nonnull public String label;
	@SerializedName("filename")
	@Nonnull public String filename;
}
