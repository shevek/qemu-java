package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=BlockdevOptions, data={file=BlockdevOptionsFile, host_device=BlockdevOptionsFile, host_cdrom=BlockdevOptionsFile, host_floppy=BlockdevOptionsFile, http=BlockdevOptionsFile, https=BlockdevOptionsFile, ftp=BlockdevOptionsFile, ftps=BlockdevOptionsFile, tftp=BlockdevOptionsFile, vvfat=BlockdevOptionsVVFAT, blkdebug=BlockdevOptionsBlkdebug, blkverify=BlockdevOptionsBlkverify, bochs=BlockdevOptionsGenericFormat, cloop=BlockdevOptionsGenericFormat, cow=BlockdevOptionsGenericCOWFormat, dmg=BlockdevOptionsGenericFormat, parallels=BlockdevOptionsGenericFormat, qcow=BlockdevOptionsGenericCOWFormat, qcow2=BlockdevOptionsQcow2, qed=BlockdevOptionsGenericCOWFormat, raw=BlockdevOptionsGenericFormat, vdi=BlockdevOptionsGenericFormat, vhdx=BlockdevOptionsGenericFormat, vmdk=BlockdevOptionsGenericCOWFormat, vpc=BlockdevOptionsGenericFormat, quorum=BlockdevOptionsQuorum}, innerTypes=null, fields=null}
public class BlockdevOptions extends QApiUnion {
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

	@Override
	public boolean isUnion() {
		int count = 0;
		if (file != null)
			count++;
		if (hostDevice != null)
			count++;
		if (hostCdrom != null)
			count++;
		if (hostFloppy != null)
			count++;
		if (http != null)
			count++;
		if (https != null)
			count++;
		if (ftp != null)
			count++;
		if (ftps != null)
			count++;
		if (tftp != null)
			count++;
		if (vvfat != null)
			count++;
		if (blkdebug != null)
			count++;
		if (blkverify != null)
			count++;
		if (bochs != null)
			count++;
		if (cloop != null)
			count++;
		if (cow != null)
			count++;
		if (dmg != null)
			count++;
		if (parallels != null)
			count++;
		if (qcow != null)
			count++;
		if (qcow2 != null)
			count++;
		if (qed != null)
			count++;
		if (raw != null)
			count++;
		if (vdi != null)
			count++;
		if (vhdx != null)
			count++;
		if (vmdk != null)
			count++;
		if (vpc != null)
			count++;
		if (quorum != null)
			count++;
		return (count == 1);
	}
}
