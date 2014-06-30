package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=BlockdevSnapshot, data={*device=str, *node-name=str, snapshot-file=str, *snapshot-node-name=str, *format=str, *mode=NewImageMode}, innerTypes=null}
public class BlockdevSnapshot extends QApiType {

	@SerializedName("device")
	@CheckForNull public String device;
	@SerializedName("node-name")
	@CheckForNull public String nodeName;
	@SerializedName("snapshot-file")
	@Nonnull public String snapshotFile;
	@SerializedName("snapshot-node-name")
	@CheckForNull public String snapshotNodeName;
	@SerializedName("format")
	@CheckForNull public String format;
	@SerializedName("mode")
	@CheckForNull public NewImageMode mode;
}
