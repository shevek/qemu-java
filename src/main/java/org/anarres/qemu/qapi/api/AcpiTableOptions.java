package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=AcpiTableOptions, data={*sig=str, *rev=uint8, *oem_id=str, *oem_table_id=str, *oem_rev=uint32, *asl_compiler_id=str, *asl_compiler_rev=uint32, *file=str, *data=str}, innerTypes=null}
public class AcpiTableOptions extends QApiType {

	@SerializedName("sig")
	@CheckForNull public String sig;
	@SerializedName("rev")
	@CheckForNull public char rev;
	@SerializedName("oem_id")
	@CheckForNull public String oemId;
	@SerializedName("oem_table_id")
	@CheckForNull public String oemTableId;
	@SerializedName("oem_rev")
	@CheckForNull public long oemRev;
	@SerializedName("asl_compiler_id")
	@CheckForNull public String aslCompilerId;
	@SerializedName("asl_compiler_rev")
	@CheckForNull public long aslCompilerRev;
	@SerializedName("file")
	@CheckForNull public String file;
	@SerializedName("data")
	@CheckForNull public String data;
}
