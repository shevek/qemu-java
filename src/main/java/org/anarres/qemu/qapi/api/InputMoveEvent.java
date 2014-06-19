package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=InputMoveEvent, data={axis=InputAxis, value=int}, innerTypes=null, fields=null}
public class InputMoveEvent extends QApiType {

	@SerializedName("axis")
	@Nonnull public InputAxis axis;
	@SerializedName("value")
	@Nonnull public long value;
}
