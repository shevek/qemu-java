package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=BlockdevOptions, data={file=BlockdevOptionsFile, host_device=BlockdevOptionsFile, host_cdrom=BlockdevOptionsFile, host_floppy=BlockdevOptionsFile, http=BlockdevOptionsFile, https=BlockdevOptionsFile, ftp=BlockdevOptionsFile, ftps=BlockdevOptionsFile, tftp=BlockdevOptionsFile, vvfat=BlockdevOptionsVVFAT, blkdebug=BlockdevOptionsBlkdebug, blkverify=BlockdevOptionsBlkverify, bochs=BlockdevOptionsGenericFormat, cloop=BlockdevOptionsGenericFormat, cow=BlockdevOptionsGenericCOWFormat, dmg=BlockdevOptionsGenericFormat, parallels=BlockdevOptionsGenericFormat, qcow=BlockdevOptionsGenericCOWFormat, qcow2=BlockdevOptionsQcow2, qed=BlockdevOptionsGenericCOWFormat, raw=BlockdevOptionsGenericFormat, vdi=BlockdevOptionsGenericFormat, vhdx=BlockdevOptionsGenericFormat, vmdk=BlockdevOptionsGenericCOWFormat, vpc=BlockdevOptionsGenericFormat, quorum=BlockdevOptionsQuorum}, innerTypes=null, fields=null}
public class BlockdevOptions extends QApiObject {
	@SerializedName("file")
	@Nonnull public BlockdevOptionsFile file;
	@SerializedName("host_device")
	@Nonnull public BlockdevOptionsFile hostDevice;
	@SerializedName("host_cdrom")
	@Nonnull public BlockdevOptionsFile hostCdrom;
	@SerializedName("host_floppy")
	@Nonnull public BlockdevOptionsFile hostFloppy;
	@SerializedName("http")
	@Nonnull public BlockdevOptionsFile http;
	@SerializedName("https")
	@Nonnull public BlockdevOptionsFile https;
	@SerializedName("ftp")
	@Nonnull public BlockdevOptionsFile ftp;
	@SerializedName("ftps")
	@Nonnull public BlockdevOptionsFile ftps;
	@SerializedName("tftp")
	@Nonnull public BlockdevOptionsFile tftp;
	@SerializedName("vvfat")
	@Nonnull public BlockdevOptionsVVFAT vvfat;
	@SerializedName("blkdebug")
	@Nonnull public BlockdevOptionsBlkdebug blkdebug;
	@SerializedName("blkverify")
	@Nonnull public BlockdevOptionsBlkverify blkverify;
	@SerializedName("bochs")
	@Nonnull public BlockdevOptionsGenericFormat bochs;
	@SerializedName("cloop")
	@Nonnull public BlockdevOptionsGenericFormat cloop;
	@SerializedName("cow")
	@Nonnull public BlockdevOptionsGenericCOWFormat cow;
	@SerializedName("dmg")
	@Nonnull public BlockdevOptionsGenericFormat dmg;
	@SerializedName("parallels")
	@Nonnull public BlockdevOptionsGenericFormat parallels;
	@SerializedName("qcow")
	@Nonnull public BlockdevOptionsGenericCOWFormat qcow;
	@SerializedName("qcow2")
	@Nonnull public BlockdevOptionsQcow2 qcow2;
	@SerializedName("qed")
	@Nonnull public BlockdevOptionsGenericCOWFormat qed;
	@SerializedName("raw")
	@Nonnull public BlockdevOptionsGenericFormat raw;
	@SerializedName("vdi")
	@Nonnull public BlockdevOptionsGenericFormat vdi;
	@SerializedName("vhdx")
	@Nonnull public BlockdevOptionsGenericFormat vhdx;
	@SerializedName("vmdk")
	@Nonnull public BlockdevOptionsGenericCOWFormat vmdk;
	@SerializedName("vpc")
	@Nonnull public BlockdevOptionsGenericFormat vpc;
	@SerializedName("quorum")
	@Nonnull public BlockdevOptionsQuorum quorum;

/*
	public boolean isUnion() {
		ONE: {
			if (file != null)
				break ONE;
			if (hostDevice != null)
				break ONE;
			if (hostCdrom != null)
				break ONE;
			if (hostFloppy != null)
				break ONE;
			if (http != null)
				break ONE;
			if (https != null)
				break ONE;
			if (ftp != null)
				break ONE;
			if (ftps != null)
				break ONE;
			if (tftp != null)
				break ONE;
			if (vvfat != null)
				break ONE;
			if (blkdebug != null)
				break ONE;
			if (blkverify != null)
				break ONE;
			if (bochs != null)
				break ONE;
			if (cloop != null)
				break ONE;
			if (cow != null)
				break ONE;
			if (dmg != null)
				break ONE;
			if (parallels != null)
				break ONE;
			if (qcow != null)
				break ONE;
			if (qcow2 != null)
				break ONE;
			if (qed != null)
				break ONE;
			if (raw != null)
				break ONE;
			if (vdi != null)
				break ONE;
			if (vhdx != null)
				break ONE;
			if (vmdk != null)
				break ONE;
			if (vpc != null)
				break ONE;
			if (quorum != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (file != null)
				return false;	// More than one field is set.
			if (hostDevice != null)
				return false;	// More than one field is set.
			if (hostCdrom != null)
				return false;	// More than one field is set.
			if (hostFloppy != null)
				return false;	// More than one field is set.
			if (http != null)
				return false;	// More than one field is set.
			if (https != null)
				return false;	// More than one field is set.
			if (ftp != null)
				return false;	// More than one field is set.
			if (ftps != null)
				return false;	// More than one field is set.
			if (tftp != null)
				return false;	// More than one field is set.
			if (vvfat != null)
				return false;	// More than one field is set.
			if (blkdebug != null)
				return false;	// More than one field is set.
			if (blkverify != null)
				return false;	// More than one field is set.
			if (bochs != null)
				return false;	// More than one field is set.
			if (cloop != null)
				return false;	// More than one field is set.
			if (cow != null)
				return false;	// More than one field is set.
			if (dmg != null)
				return false;	// More than one field is set.
			if (parallels != null)
				return false;	// More than one field is set.
			if (qcow != null)
				return false;	// More than one field is set.
			if (qcow2 != null)
				return false;	// More than one field is set.
			if (qed != null)
				return false;	// More than one field is set.
			if (raw != null)
				return false;	// More than one field is set.
			if (vdi != null)
				return false;	// More than one field is set.
			if (vhdx != null)
				return false;	// More than one field is set.
			if (vmdk != null)
				return false;	// More than one field is set.
			if (vpc != null)
				return false;	// More than one field is set.
			if (quorum != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
