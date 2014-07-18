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
 * <p><pre>QApiTypeDescriptor{name=UuidInfo, data={UUID=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=UuidInfo, data={UUID=str}, innerTypes=null}
public class UuidInfo extends QApiType {

	@SerializedName("UUID")
	@Nonnull
	public java.lang.String uuid;

	public UuidInfo() {
	}

	public UuidInfo(java.lang.String uuid) {
		this.uuid = uuid;
	}
}
