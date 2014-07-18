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
 * <p><pre>QApiTypeDescriptor{name=NetdevDumpOptions, data={*len=size, *file=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NetdevDumpOptions, data={*len=size, *file=str}, innerTypes=null}
public class NetdevDumpOptions extends QApiType {

	@SerializedName("len")
	@CheckForNull
	public long len;
	@SerializedName("file")
	@CheckForNull
	public java.lang.String file;

	public NetdevDumpOptions() {
	}

	public NetdevDumpOptions(long len, java.lang.String file) {
		this.len = len;
		this.file = file;
	}
}
