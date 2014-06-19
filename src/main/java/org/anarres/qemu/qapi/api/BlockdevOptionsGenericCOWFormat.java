package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsGenericCOWFormat, data={*backing=BlockdevRef}, innerTypes=null}
public class BlockdevOptionsGenericCOWFormat extends QApiType {

	@SerializedName("backing")
	@CheckForNull public BlockdevRef backing;
}
