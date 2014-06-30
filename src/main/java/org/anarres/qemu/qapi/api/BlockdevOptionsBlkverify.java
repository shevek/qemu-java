package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=BlockdevOptionsBlkverify, data={test=BlockdevRef, raw=BlockdevRef}, innerTypes=null}
public class BlockdevOptionsBlkverify extends QApiType {

	@SerializedName("test")
	@Nonnull public BlockdevRef test;
	@SerializedName("raw")
	@Nonnull public BlockdevRef raw;
}
