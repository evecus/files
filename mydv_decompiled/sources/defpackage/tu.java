package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadManagerListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tu implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ BasePreloadManager.MediaSourceHolder J;

    public /* synthetic */ tu(BasePreloadManager.MediaSourceHolder mediaSourceHolder, byte b) {
        this.I = b;
        this.J = mediaSourceHolder;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        byte b = this.I;
        BasePreloadManager.MediaSourceHolder mediaSourceHolder = this.J;
        PreloadManagerListener preloadManagerListener = (PreloadManagerListener) obj;
        switch (b) {
            case 0:
                BasePreloadManager.lambda$onCompleted$0(mediaSourceHolder, preloadManagerListener);
                break;
            default:
                BasePreloadManager.lambda$onCompleted$2(mediaSourceHolder, preloadManagerListener);
                break;
        }
    }
}
