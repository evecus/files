package coil3.decode;

import defpackage.ke1;
import defpackage.mz;
import defpackage.ok3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ImageSource extends AutoCloseable {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static abstract class Metadata {
    }

    ok3 file();

    ok3 fileOrNull();

    ke1 getFileSystem();

    Metadata getMetadata();

    mz source();

    mz sourceOrNull();
}
