package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=BlockdevOptionsBlkverify, data={test=BlockdevRef, raw=BlockdevRef}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevOptionsBlkverify, data={test=BlockdevRef, raw=BlockdevRef}, innerTypes=null}
public class BlockdevOptionsBlkverify extends QApiType {

	@SerializedName("test")
	@Nonnull
	public BlockdevRef test;
	@SerializedName("raw")
	@Nonnull
	public BlockdevRef raw;

	public BlockdevOptionsBlkverify() {
	}

	public BlockdevOptionsBlkverify(BlockdevRef test, BlockdevRef raw) {
		this.test = test;
		this.raw = raw;
	}
}
