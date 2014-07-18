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
 * <p><pre>QApiTypeDescriptor{name=ChardevBackendInfo, data={name=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevBackendInfo, data={name=str}, innerTypes=null}
public class ChardevBackendInfo extends QApiType {

	@SerializedName("name")
	@Nonnull
	public java.lang.String name;

	public ChardevBackendInfo() {
	}

	public ChardevBackendInfo(java.lang.String name) {
		this.name = name;
	}
}
