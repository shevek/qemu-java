package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=CommandLineParameterInfo, data={name=str, type=CommandLineParameterType, *help=str, *default=str}, innerTypes=null, fields=null}
public class CommandLineParameterInfo extends QApiType {

	@SerializedName("name")
	@Nonnull public String name;
	@SerializedName("type")
	@Nonnull public CommandLineParameterType type;
	@SerializedName("help")
	@CheckForNull public String help;
	@SerializedName("default")
	@CheckForNull public String _default;
}
