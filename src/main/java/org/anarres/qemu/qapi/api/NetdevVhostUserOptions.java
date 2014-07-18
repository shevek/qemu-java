package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool}, innerTypes=null}
public class NetdevVhostUserOptions extends QApiType {

	@SerializedName("chardev")
	@Nonnull
	public java.lang.String chardev;
	@SerializedName("vhostforce")
	@CheckForNull
	public boolean vhostforce;

	public NetdevVhostUserOptions() {
	}

	public NetdevVhostUserOptions(java.lang.String chardev, boolean vhostforce) {
		this.chardev = chardev;
		this.vhostforce = vhostforce;
	}
}
