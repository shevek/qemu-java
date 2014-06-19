package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=InputEvent, data={key=InputKeyEvent, btn=InputBtnEvent, rel=InputMoveEvent, abs=InputMoveEvent}, innerTypes=null, fields=null}
public class InputEvent extends QApiObject {
	@SerializedName("key")
	@Nonnull public InputKeyEvent key;
	@SerializedName("btn")
	@Nonnull public InputBtnEvent btn;
	@SerializedName("rel")
	@Nonnull public InputMoveEvent rel;
	@SerializedName("abs")
	@Nonnull public InputMoveEvent abs;

/*
	public boolean isUnion() {
		ONE: {
			if (key != null)
				break ONE;
			if (btn != null)
				break ONE;
			if (rel != null)
				break ONE;
			if (abs != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (key != null)
				return false;	// More than one field is set.
			if (btn != null)
				return false;	// More than one field is set.
			if (rel != null)
				return false;	// More than one field is set.
			if (abs != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
