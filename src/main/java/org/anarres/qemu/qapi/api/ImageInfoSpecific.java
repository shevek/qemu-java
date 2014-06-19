package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=ImageInfoSpecific, data={qcow2=ImageInfoSpecificQCow2, vmdk=ImageInfoSpecificVmdk}, innerTypes=null, fields=null}
public class ImageInfoSpecific extends QApiUnion {
	@SerializedName("qcow2")
	@Nonnull public ImageInfoSpecificQCow2 qcow2;
	@SerializedName("vmdk")
	@Nonnull public ImageInfoSpecificVmdk vmdk;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (qcow2 != null)
			count++;
		if (vmdk != null)
			count++;
		return (count == 1);
	}
}
