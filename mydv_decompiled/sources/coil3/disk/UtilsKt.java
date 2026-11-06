package coil3.disk;

import coil3.disk.DiskCache;
import defpackage.ke1;
import defpackage.tg5;
import defpackage.u05;
import defpackage.uc2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final uc2 instance$delegate = new u05(new tg5(0));

    private static final DiskCache getInstance() {
        return (DiskCache) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiskCache instance_delegate$lambda$0() {
        return new DiskCache.Builder().directory(ke1.SYSTEM_TEMPORARY_DIRECTORY.f("coil3_disk_cache")).build();
    }

    public static final DiskCache singletonDiskCache() {
        return getInstance();
    }
}
