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
 * <p><pre>QApiTypeDescriptor{name=NetdevBridgeOptions, data={*br=str, *helper=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NetdevBridgeOptions, data={*br=str, *helper=str}, innerTypes=null}
public class NetdevBridgeOptions extends QApiType {

	@SerializedName("br")
	@CheckForNull
	public java.lang.String br;
	@SerializedName("helper")
	@CheckForNull
	public java.lang.String helper;

	public NetdevBridgeOptions() {
	}

	public NetdevBridgeOptions(java.lang.String br, java.lang.String helper) {
		this.br = br;
		this.helper = helper;
	}
}
