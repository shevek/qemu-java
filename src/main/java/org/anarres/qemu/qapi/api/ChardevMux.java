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
 * <p><pre>QApiTypeDescriptor{name=ChardevMux, data={chardev=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevMux, data={chardev=str}, innerTypes=null}
public class ChardevMux extends QApiType {

	@SerializedName("chardev")
	@Nonnull
	public java.lang.String chardev;

	public ChardevMux() {
	}

	public ChardevMux(java.lang.String chardev) {
		this.chardev = chardev;
	}
}
