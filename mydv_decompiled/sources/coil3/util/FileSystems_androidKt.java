package coil3.util;

import android.os.StatFs;
import defpackage.ke1;
import defpackage.ok3;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FileSystems_androidKt {
    public static final long remainingFreeSpaceBytes(ke1 ke1Var, ok3 ok3Var) {
        File file = ok3Var.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }
}
