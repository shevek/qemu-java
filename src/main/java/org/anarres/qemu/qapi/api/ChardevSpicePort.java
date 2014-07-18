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
 * <p><pre>QApiTypeDescriptor{name=ChardevSpicePort, data={fqdn=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevSpicePort, data={fqdn=str}, innerTypes=null}
public class ChardevSpicePort extends QApiType {

	@SerializedName("fqdn")
	@Nonnull
	public java.lang.String fqdn;

	public ChardevSpicePort() {
	}

	public ChardevSpicePort(java.lang.String fqdn) {
		this.fqdn = fqdn;
	}
}
