package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=ChardevBackend, data={file=ChardevFile, serial=ChardevHostdev, parallel=ChardevHostdev, pipe=ChardevHostdev, socket=ChardevSocket, udp=ChardevUdp, pty=ChardevDummy, null=ChardevDummy, mux=ChardevMux, msmouse=ChardevDummy, braille=ChardevDummy, stdio=ChardevStdio, console=ChardevDummy, spicevmc=ChardevSpiceChannel, spiceport=ChardevSpicePort, vc=ChardevVC, ringbuf=ChardevRingbuf, memory=ChardevRingbuf}, innerTypes=null, fields=null}
public class ChardevBackend extends QApiObject {
	@SerializedName("file")
	@Nonnull public ChardevFile file;
	@SerializedName("serial")
	@Nonnull public ChardevHostdev serial;
	@SerializedName("parallel")
	@Nonnull public ChardevHostdev parallel;
	@SerializedName("pipe")
	@Nonnull public ChardevHostdev pipe;
	@SerializedName("socket")
	@Nonnull public ChardevSocket socket;
	@SerializedName("udp")
	@Nonnull public ChardevUdp udp;
	@SerializedName("pty")
	@Nonnull public ChardevDummy pty;
	@SerializedName("null")
	@Nonnull public ChardevDummy _null;
	@SerializedName("mux")
	@Nonnull public ChardevMux mux;
	@SerializedName("msmouse")
	@Nonnull public ChardevDummy msmouse;
	@SerializedName("braille")
	@Nonnull public ChardevDummy braille;
	@SerializedName("stdio")
	@Nonnull public ChardevStdio stdio;
	@SerializedName("console")
	@Nonnull public ChardevDummy console;
	@SerializedName("spicevmc")
	@Nonnull public ChardevSpiceChannel spicevmc;
	@SerializedName("spiceport")
	@Nonnull public ChardevSpicePort spiceport;
	@SerializedName("vc")
	@Nonnull public ChardevVC vc;
	@SerializedName("ringbuf")
	@Nonnull public ChardevRingbuf ringbuf;
	@SerializedName("memory")
	@Nonnull public ChardevRingbuf memory;

/*
	public boolean isUnion() {
		ONE: {
			if (file != null)
				break ONE;
			if (serial != null)
				break ONE;
			if (parallel != null)
				break ONE;
			if (pipe != null)
				break ONE;
			if (socket != null)
				break ONE;
			if (udp != null)
				break ONE;
			if (pty != null)
				break ONE;
			if (_null != null)
				break ONE;
			if (mux != null)
				break ONE;
			if (msmouse != null)
				break ONE;
			if (braille != null)
				break ONE;
			if (stdio != null)
				break ONE;
			if (console != null)
				break ONE;
			if (spicevmc != null)
				break ONE;
			if (spiceport != null)
				break ONE;
			if (vc != null)
				break ONE;
			if (ringbuf != null)
				break ONE;
			if (memory != null)
				break ONE;
			return false;	// No field is set.
		}
		TWO: {
			if (file != null)
				return false;	// More than one field is set.
			if (serial != null)
				return false;	// More than one field is set.
			if (parallel != null)
				return false;	// More than one field is set.
			if (pipe != null)
				return false;	// More than one field is set.
			if (socket != null)
				return false;	// More than one field is set.
			if (udp != null)
				return false;	// More than one field is set.
			if (pty != null)
				return false;	// More than one field is set.
			if (_null != null)
				return false;	// More than one field is set.
			if (mux != null)
				return false;	// More than one field is set.
			if (msmouse != null)
				return false;	// More than one field is set.
			if (braille != null)
				return false;	// More than one field is set.
			if (stdio != null)
				return false;	// More than one field is set.
			if (console != null)
				return false;	// More than one field is set.
			if (spicevmc != null)
				return false;	// More than one field is set.
			if (spiceport != null)
				return false;	// More than one field is set.
			if (vc != null)
				return false;	// More than one field is set.
			if (ringbuf != null)
				return false;	// More than one field is set.
			if (memory != null)
				return false;	// More than one field is set.
		}
		return true;
	}
*/
}
