package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=MouseInfo, data={name=str, index=int, current=bool, absolute=bool}, innerTypes=null}
public class MouseInfo extends QApiType {

	@SerializedName("name")
	@Nonnull public String name;
	@SerializedName("index")
	@Nonnull public long index;
	@SerializedName("current")
	@Nonnull public boolean current;
	@SerializedName("absolute")
	@Nonnull public boolean absolute;
}
