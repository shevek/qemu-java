package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=Netdev, data={id=str, opts=NetClientOptions}, innerTypes=null}
public class Netdev extends QApiType {

	@SerializedName("id")
	@Nonnull public String id;
	@SerializedName("opts")
	@Nonnull public NetClientOptions opts;
}
