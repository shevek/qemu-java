package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=BlockdevOptionsQuorum, data={*blkverify=bool, children=[BlockdevRef], vote-threshold=int}, innerTypes=null}
public class BlockdevOptionsQuorum extends QApiType {

	@SerializedName("blkverify")
	@CheckForNull public boolean blkverify;
	@SerializedName("children")
	@Nonnull public List<BlockdevRef> children;
	@SerializedName("vote-threshold")
	@Nonnull public long voteThreshold;
}
