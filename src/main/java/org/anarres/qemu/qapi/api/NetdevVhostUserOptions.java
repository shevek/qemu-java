package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool}, innerTypes=null}
public class NetdevVhostUserOptions extends QApiType {

	@SerializedName("chardev")
	@Nonnull public String chardev;
	@SerializedName("vhostforce")
	@CheckForNull public boolean vhostforce;
}
