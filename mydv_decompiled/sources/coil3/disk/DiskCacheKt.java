package coil3.disk;

import coil3.disk.DiskCache;
import defpackage.o63;
import defpackage.ok3;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DiskCacheKt {
    public static final DiskCache.Builder directory(DiskCache.Builder builder, File file) {
        String str = ok3.J;
        return builder.directory(o63.g(file));
    }
}
