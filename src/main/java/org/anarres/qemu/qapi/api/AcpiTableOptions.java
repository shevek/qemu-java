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
 * <p><pre>QApiTypeDescriptor{name=AcpiTableOptions, data={*sig=str, *rev=uint8, *oem_id=str, *oem_table_id=str, *oem_rev=uint32, *asl_compiler_id=str, *asl_compiler_rev=uint32, *file=str, *data=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=AcpiTableOptions, data={*sig=str, *rev=uint8, *oem_id=str, *oem_table_id=str, *oem_rev=uint32, *asl_compiler_id=str, *asl_compiler_rev=uint32, *file=str, *data=str}, innerTypes=null}
public class AcpiTableOptions extends QApiType {

	@SerializedName("sig")
	@CheckForNull
	public java.lang.String sig;
	@SerializedName("rev")
	@CheckForNull
	public char rev;
	@SerializedName("oem_id")
	@CheckForNull
	public java.lang.String oemId;
	@SerializedName("oem_table_id")
	@CheckForNull
	public java.lang.String oemTableId;
	@SerializedName("oem_rev")
	@CheckForNull
	public long oemRev;
	@SerializedName("asl_compiler_id")
	@CheckForNull
	public java.lang.String aslCompilerId;
	@SerializedName("asl_compiler_rev")
	@CheckForNull
	public long aslCompilerRev;
	@SerializedName("file")
	@CheckForNull
	public java.lang.String file;
	@SerializedName("data")
	@CheckForNull
	public java.lang.String data;

	public AcpiTableOptions() {
	}

	public AcpiTableOptions(java.lang.String sig, char rev, java.lang.String oemId, java.lang.String oemTableId, long oemRev, java.lang.String aslCompilerId, long aslCompilerRev, java.lang.String file, java.lang.String data) {
		this.sig = sig;
		this.rev = rev;
		this.oemId = oemId;
		this.oemTableId = oemTableId;
		this.oemRev = oemRev;
		this.aslCompilerId = aslCompilerId;
		this.aslCompilerRev = aslCompilerRev;
		this.file = file;
		this.data = data;
	}
}
