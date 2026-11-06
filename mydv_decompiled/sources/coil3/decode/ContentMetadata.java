package coil3.decode;

import android.content.res.AssetFileDescriptor;
import coil3.Uri;
import coil3.decode.ImageSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ContentMetadata extends ImageSource.Metadata {
    private final AssetFileDescriptor assetFileDescriptor;
    private final Uri uri;

    public ContentMetadata(Uri uri, AssetFileDescriptor assetFileDescriptor) {
        this.uri = uri;
        this.assetFileDescriptor = assetFileDescriptor;
    }

    public final AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
