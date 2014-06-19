package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=TpmTypeOptions, data={passthrough=TPMPassthroughOptions}, innerTypes=null, fields=null}
public class TpmTypeOptions extends QApiObject {
	@SerializedName("passthrough")
	@Nonnull public TPMPassthroughOptions passthrough;

/*
	public boolean isUnion() {
		ONE: {
			if (passthrough != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (passthrough != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
