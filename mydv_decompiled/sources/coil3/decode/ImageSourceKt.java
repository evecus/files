package coil3.decode;

import coil3.decode.ImageSource;
import defpackage.ke1;
import defpackage.mz;
import defpackage.ok3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageSourceKt {
    public static final ImageSource ImageSource(ok3 ok3Var, ke1 ke1Var, String str, AutoCloseable autoCloseable, ImageSource.Metadata metadata) {
        return new FileImageSource(ok3Var, ke1Var, str, autoCloseable, metadata);
    }

    public static /* synthetic */ ImageSource ImageSource$default(ok3 ok3Var, ke1 ke1Var, String str, AutoCloseable autoCloseable, ImageSource.Metadata metadata, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            autoCloseable = null;
        }
        if ((i & 16) != 0) {
            metadata = null;
        }
        return ImageSource(ok3Var, ke1Var, str, autoCloseable, metadata);
    }

    public static final ImageSource ImageSource(mz mzVar, ke1 ke1Var, ImageSource.Metadata metadata) {
        return new SourceImageSource(mzVar, ke1Var, metadata);
    }

    public static /* synthetic */ ImageSource ImageSource$default(mz mzVar, ke1 ke1Var, ImageSource.Metadata metadata, int i, Object obj) {
        if ((i & 4) != 0) {
            metadata = null;
        }
        return ImageSource(mzVar, ke1Var, metadata);
    }
}
