package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import defpackage.mr3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements mr3 {
    public final /* synthetic */ byte I;

    public /* synthetic */ c(byte b) {
        this.I = b;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        boolean lambda$onSourcePrepared$0;
        boolean lambda$onTracksSelected$1;
        DefaultPreloadManager.PreloadStatus preloadStatus = (DefaultPreloadManager.PreloadStatus) obj;
        switch (this.I) {
            case 0:
                lambda$onSourcePrepared$0 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$onSourcePrepared$0(preloadStatus);
                return lambda$onSourcePrepared$0;
            default:
                lambda$onTracksSelected$1 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$onTracksSelected$1(preloadStatus);
                return lambda$onTracksSelected$1;
        }
    }
}
