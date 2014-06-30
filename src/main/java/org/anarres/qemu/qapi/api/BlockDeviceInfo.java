package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=BlockDeviceInfo, data={file=str, *node-name=str, ro=bool, drv=str, *backing_file=str, backing_file_depth=int, encrypted=bool, encryption_key_missing=bool, detect_zeroes=BlockdevDetectZeroesOptions, bps=int, bps_rd=int, bps_wr=int, iops=int, iops_rd=int, iops_wr=int, image=ImageInfo, *bps_max=int, *bps_rd_max=int, *bps_wr_max=int, *iops_max=int, *iops_rd_max=int, *iops_wr_max=int, *iops_size=int}, innerTypes=null}
public class BlockDeviceInfo extends QApiType {

	@SerializedName("file")
	@Nonnull public String file;
	@SerializedName("node-name")
	@CheckForNull public String nodeName;
	@SerializedName("ro")
	@Nonnull public boolean ro;
	@SerializedName("drv")
	@Nonnull public String drv;
	@SerializedName("backing_file")
	@CheckForNull public String backingFile;
	@SerializedName("backing_file_depth")
	@Nonnull public long backingFileDepth;
	@SerializedName("encrypted")
	@Nonnull public boolean encrypted;
	@SerializedName("encryption_key_missing")
	@Nonnull public boolean encryptionKeyMissing;
	@SerializedName("detect_zeroes")
	@Nonnull public BlockdevDetectZeroesOptions detectZeroes;
	@SerializedName("bps")
	@Nonnull public long bps;
	@SerializedName("bps_rd")
	@Nonnull public long bpsRd;
	@SerializedName("bps_wr")
	@Nonnull public long bpsWr;
	@SerializedName("iops")
	@Nonnull public long iops;
	@SerializedName("iops_rd")
	@Nonnull public long iopsRd;
	@SerializedName("iops_wr")
	@Nonnull public long iopsWr;
	@SerializedName("image")
	@Nonnull public ImageInfo image;
	@SerializedName("bps_max")
	@CheckForNull public long bpsMax;
	@SerializedName("bps_rd_max")
	@CheckForNull public long bpsRdMax;
	@SerializedName("bps_wr_max")
	@CheckForNull public long bpsWrMax;
	@SerializedName("iops_max")
	@CheckForNull public long iopsMax;
	@SerializedName("iops_rd_max")
	@CheckForNull public long iopsRdMax;
	@SerializedName("iops_wr_max")
	@CheckForNull public long iopsWrMax;
	@SerializedName("iops_size")
	@CheckForNull public long iopsSize;
}
