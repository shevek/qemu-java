package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsVVFAT, data={dir=str, *fat-type=int, *floppy=bool, *rw=bool}, innerTypes=null, fields=null}
public class BlockdevOptionsVVFAT extends QApiObject {

	@SerializedName("dir")
	@Nonnull public String dir;
	@SerializedName("fat-type")
	@CheckForNull public long fatType;
	@SerializedName("floppy")
	@CheckForNull public boolean floppy;
	@SerializedName("rw")
	@CheckForNull public boolean rw;
}
