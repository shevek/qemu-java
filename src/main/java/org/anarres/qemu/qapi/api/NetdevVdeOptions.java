package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=NetdevVdeOptions, data={*sock=str, *port=uint16, *group=str, *mode=uint16}, innerTypes=null, fields=null}
public class NetdevVdeOptions extends QApiObject {

	@SerializedName("sock")
	@CheckForNull public String sock;
	@SerializedName("port")
	@CheckForNull public int port;
	@SerializedName("group")
	@CheckForNull public String group;
	@SerializedName("mode")
	@CheckForNull public int mode;
}
