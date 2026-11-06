package coil3.decode;

import coil3.decode.ImageSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AssetMetadata extends ImageSource.Metadata {
    private final String filePath;

    public AssetMetadata(String str) {
        this.filePath = str;
    }

    public final String getFilePath() {
        return this.filePath;
    }
}
