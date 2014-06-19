package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ChardevVC, data={*width=int, *height=int, *cols=int, *rows=int}, innerTypes=null, fields=null}
public class ChardevVC extends QApiObject {

	@SerializedName("width")
	@CheckForNull public long width;
	@SerializedName("height")
	@CheckForNull public long height;
	@SerializedName("cols")
	@CheckForNull public long cols;
	@SerializedName("rows")
	@CheckForNull public long rows;
}
