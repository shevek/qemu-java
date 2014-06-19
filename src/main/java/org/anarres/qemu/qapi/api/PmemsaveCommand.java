package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=pmemsave, returns=null, data={val=int, size=int, filename=str}}
public class PmemsaveCommand extends QApiCommand<PmemsaveCommand.PmemsaveArguments, Void> {
	public static class PmemsaveArguments {
		@SerializedName("val")
		@Nonnull public long val;
		@SerializedName("size")
		@Nonnull public long size;
		@SerializedName("filename")
		@Nonnull public String filename;
	}

	public PmemsaveCommand(@Nonnull PmemsaveCommand.PmemsaveArguments argument) {
		super("pmemsave", new TypeToken<Void>() {}, argument);
	}
}
