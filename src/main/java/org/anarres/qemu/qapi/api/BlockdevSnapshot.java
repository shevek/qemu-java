package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=BlockdevSnapshot, data={*device=str, *node-name=str, snapshot-file=str, *snapshot-node-name=str, *format=str, *mode=NewImageMode}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevSnapshot, data={*device=str, *node-name=str, snapshot-file=str, *snapshot-node-name=str, *format=str, *mode=NewImageMode}, innerTypes=null}
public class BlockdevSnapshot extends QApiType {

	@SerializedName("device")
	@CheckForNull
	public java.lang.String device;
	@SerializedName("node-name")
	@CheckForNull
	public java.lang.String nodeName;
	@SerializedName("snapshot-file")
	@Nonnull
	public java.lang.String snapshotFile;
	@SerializedName("snapshot-node-name")
	@CheckForNull
	public java.lang.String snapshotNodeName;
	@SerializedName("format")
	@CheckForNull
	public java.lang.String format;
	@SerializedName("mode")
	@CheckForNull
	public NewImageMode mode;

	public BlockdevSnapshot() {
	}

	public BlockdevSnapshot(java.lang.String device, java.lang.String nodeName, java.lang.String snapshotFile, java.lang.String snapshotNodeName, java.lang.String format, NewImageMode mode) {
		this.device = device;
		this.nodeName = nodeName;
		this.snapshotFile = snapshotFile;
		this.snapshotNodeName = snapshotNodeName;
		this.format = format;
		this.mode = mode;
	}
}
