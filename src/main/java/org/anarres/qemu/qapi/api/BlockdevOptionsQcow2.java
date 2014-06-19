package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsQcow2, data={*lazy-refcounts=bool, *pass-discard-request=bool, *pass-discard-snapshot=bool, *pass-discard-other=bool}, innerTypes=null, fields=null}
public class BlockdevOptionsQcow2 extends QApiObject {

	@SerializedName("lazy-refcounts")
	@CheckForNull public boolean lazyRefcounts;
	@SerializedName("pass-discard-request")
	@CheckForNull public boolean passDiscardRequest;
	@SerializedName("pass-discard-snapshot")
	@CheckForNull public boolean passDiscardSnapshot;
	@SerializedName("pass-discard-other")
	@CheckForNull public boolean passDiscardOther;
}
