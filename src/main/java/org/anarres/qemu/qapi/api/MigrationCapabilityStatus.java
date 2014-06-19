package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=MigrationCapabilityStatus, data={capability=MigrationCapability, state=bool}, innerTypes=null, fields=null}
public class MigrationCapabilityStatus extends QApiObject {

	@SerializedName("capability")
	@Nonnull public MigrationCapability capability;
	@SerializedName("state")
	@Nonnull public boolean state;
}
