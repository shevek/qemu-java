package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=transaction, returns=null, data={actions=[TransactionAction]}}
public class TransactionCommand extends QApiCommand<TransactionCommand.TransactionArguments, Void> {
	public static class TransactionArguments {
		@SerializedName("actions")
		@Nonnull public List<TransactionAction> actions;
	}

	public TransactionCommand(@Nonnull TransactionCommand.TransactionArguments argument) {
		super("transaction", new TypeToken<Void>() {}, argument);
	}
}
