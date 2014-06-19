package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=KeyValue, data={number=int, qcode=QKeyCode}, innerTypes=null, fields=null}
public class KeyValue extends QApiObject {
	@SerializedName("number")
	@Nonnull public long number;
	@SerializedName("qcode")
	@Nonnull public QKeyCode qcode;

/*
	public boolean isUnion() {
		ONE: {
			if (number != null)
				break ONE;
			if (qcode != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (number != null)
				return false;	// More than one field is set.
			if (qcode != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
