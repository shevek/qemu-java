package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=ImageInfoSpecific, data={qcow2=ImageInfoSpecificQCow2, vmdk=ImageInfoSpecificVmdk}, innerTypes=null, fields=null}
public class ImageInfoSpecific extends QApiObject {
	@SerializedName("qcow2")
	@Nonnull public ImageInfoSpecificQCow2 qcow2;
	@SerializedName("vmdk")
	@Nonnull public ImageInfoSpecificVmdk vmdk;

/*
	public boolean isUnion() {
		ONE: {
			if (qcow2 != null)
				break ONE;
			if (vmdk != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (qcow2 != null)
				return false;	// More than one field is set.
			if (vmdk != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
