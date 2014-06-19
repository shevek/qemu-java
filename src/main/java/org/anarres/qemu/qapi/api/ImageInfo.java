package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ImageInfo, data={filename=str, format=str, *dirty-flag=bool, *actual-size=int, virtual-size=int, *cluster-size=int, *encrypted=bool, *compressed=bool, *backing-filename=str, *full-backing-filename=str, *backing-filename-format=str, *snapshots=[SnapshotInfo], *backing-image=ImageInfo, *format-specific=ImageInfoSpecific}, innerTypes=null}
public class ImageInfo extends QApiType {

	@SerializedName("filename")
	@Nonnull public String filename;
	@SerializedName("format")
	@Nonnull public String format;
	@SerializedName("dirty-flag")
	@CheckForNull public boolean dirtyFlag;
	@SerializedName("actual-size")
	@CheckForNull public long actualSize;
	@SerializedName("virtual-size")
	@Nonnull public long virtualSize;
	@SerializedName("cluster-size")
	@CheckForNull public long clusterSize;
	@SerializedName("encrypted")
	@CheckForNull public boolean encrypted;
	@SerializedName("compressed")
	@CheckForNull public boolean compressed;
	@SerializedName("backing-filename")
	@CheckForNull public String backingFilename;
	@SerializedName("full-backing-filename")
	@CheckForNull public String fullBackingFilename;
	@SerializedName("backing-filename-format")
	@CheckForNull public String backingFilenameFormat;
	@SerializedName("snapshots")
	@CheckForNull public List<SnapshotInfo> snapshots;
	@SerializedName("backing-image")
	@CheckForNull public ImageInfo backingImage;
	@SerializedName("format-specific")
	@CheckForNull public ImageInfoSpecific formatSpecific;
}
