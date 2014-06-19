package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=CpuInfo, data={CPU=int, current=bool, halted=bool, *pc=int, *nip=int, *npc=int, *PC=int, thread_id=int}, innerTypes=null}
public class CpuInfo extends QApiType {

	@SerializedName("CPU")
	@Nonnull public long cpu;
	@SerializedName("current")
	@Nonnull public boolean current;
	@SerializedName("halted")
	@Nonnull public boolean halted;
	@SerializedName("pc")
	@CheckForNull public long pc;
	@SerializedName("nip")
	@CheckForNull public long nip;
	@SerializedName("npc")
	@CheckForNull public long npc;
	@SerializedName("PC")
	@CheckForNull public long PC;
	@SerializedName("thread_id")
	@Nonnull public long threadId;
}
