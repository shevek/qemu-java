package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=ImageCheck, data={filename=str, format=str, check-errors=int, *image-end-offset=int, *corruptions=int, *leaks=int, *corruptions-fixed=int, *leaks-fixed=int, *total-clusters=int, *allocated-clusters=int, *fragmented-clusters=int, *compressed-clusters=int}, innerTypes=null}
public class ImageCheck extends QApiType {

	@SerializedName("filename")
	@Nonnull public String filename;
	@SerializedName("format")
	@Nonnull public String format;
	@SerializedName("check-errors")
	@Nonnull public long checkErrors;
	@SerializedName("image-end-offset")
	@CheckForNull public long imageEndOffset;
	@SerializedName("corruptions")
	@CheckForNull public long corruptions;
	@SerializedName("leaks")
	@CheckForNull public long leaks;
	@SerializedName("corruptions-fixed")
	@CheckForNull public long corruptionsFixed;
	@SerializedName("leaks-fixed")
	@CheckForNull public long leaksFixed;
	@SerializedName("total-clusters")
	@CheckForNull public long totalClusters;
	@SerializedName("allocated-clusters")
	@CheckForNull public long allocatedClusters;
	@SerializedName("fragmented-clusters")
	@CheckForNull public long fragmentedClusters;
	@SerializedName("compressed-clusters")
	@CheckForNull public long compressedClusters;
}
