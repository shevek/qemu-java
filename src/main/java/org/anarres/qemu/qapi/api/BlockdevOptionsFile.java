package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsFile, data={filename=str}, innerTypes=null, fields=null}
public class BlockdevOptionsFile extends QApiType {

	@SerializedName("filename")
	@Nonnull public String filename;
}
