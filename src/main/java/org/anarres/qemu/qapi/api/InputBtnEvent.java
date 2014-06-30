package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=InputBtnEvent, data={button=InputButton, down=bool}, innerTypes=null}
public class InputBtnEvent extends QApiType {

	@SerializedName("button")
	@Nonnull public InputButton button;
	@SerializedName("down")
	@Nonnull public boolean down;
}
