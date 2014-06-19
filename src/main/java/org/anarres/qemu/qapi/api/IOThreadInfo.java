package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=IOThreadInfo, data={id=str, thread-id=int}, innerTypes=null, fields=null}
public class IOThreadInfo extends QApiObject {

	@SerializedName("id")
	@Nonnull public String id;
	@SerializedName("thread-id")
	@Nonnull public long threadId;
}
