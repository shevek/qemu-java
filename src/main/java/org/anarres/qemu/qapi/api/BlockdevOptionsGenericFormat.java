package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsGenericFormat, data={file=BlockdevRef}, innerTypes=null}
public class BlockdevOptionsGenericFormat extends QApiType {

	@SerializedName("file")
	@Nonnull public BlockdevRef file;
}
