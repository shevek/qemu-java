package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=migrate_cancel, returns=null, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=migrate_cancel, returns=null, data=null}
public class MigrateCancelCommand extends QApiCommand<java.lang.Void, MigrateCancelCommand.Response> {

	/** Response to a MigrateCancelCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateCancelCommand. */
	public MigrateCancelCommand() {
		super("migrate_cancel", Response.class, null);
	}

}
