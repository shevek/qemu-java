package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=BlockdevRef, data={definition=BlockdevOptions, reference=str}, innerTypes=null, fields=null}
public class BlockdevRef extends QApiObject {
	@SerializedName("definition")
	@Nonnull public BlockdevOptions definition;
	@SerializedName("reference")
	@Nonnull public String reference;

/*
	public boolean isUnion() {
		ONE: {
			if (definition != null)
				break ONE;
			if (reference != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (definition != null)
				return false;	// More than one field is set.
			if (reference != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
