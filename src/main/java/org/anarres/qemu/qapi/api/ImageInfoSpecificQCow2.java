package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ImageInfoSpecificQCow2, data={compat=str, *lazy-refcounts=bool}, innerTypes=null}
public class ImageInfoSpecificQCow2 extends QApiType {

	@SerializedName("compat")
	@Nonnull public String compat;
	@SerializedName("lazy-refcounts")
	@CheckForNull public boolean lazyRefcounts;
}
