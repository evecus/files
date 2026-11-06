package coil3.decode;

import coil3.decode.ImageSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ResourceMetadata extends ImageSource.Metadata {
    private final int density;
    private final String packageName;
    private final int resId;

    public ResourceMetadata(String str, int i, int i2) {
        this.packageName = str;
        this.resId = i;
        this.density = i2;
    }

    public final int getDensity() {
        return this.density;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getResId() {
        return this.resId;
    }
}
