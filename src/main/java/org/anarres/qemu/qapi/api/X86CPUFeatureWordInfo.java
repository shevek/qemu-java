package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=X86CPUFeatureWordInfo, data={cpuid-input-eax=int, *cpuid-input-ecx=int, cpuid-register=X86CPURegister32, features=int}, innerTypes=null}
public class X86CPUFeatureWordInfo extends QApiType {

	@SerializedName("cpuid-input-eax")
	@Nonnull public long cpuidInputEax;
	@SerializedName("cpuid-input-ecx")
	@CheckForNull public long cpuidInputEcx;
	@SerializedName("cpuid-register")
	@Nonnull public X86CPURegister32 cpuidRegister;
	@SerializedName("features")
	@Nonnull public long features;
}
