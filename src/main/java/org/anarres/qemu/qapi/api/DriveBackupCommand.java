package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=drive-backup, returns=null, data=DriveBackup}
public class DriveBackupCommand extends QApiCommand<DriveBackup, Void> {

	public DriveBackupCommand(@Nonnull DriveBackup argument) {
		super("drive-backup", new TypeToken<Void>() {}, argument);
	}
}
