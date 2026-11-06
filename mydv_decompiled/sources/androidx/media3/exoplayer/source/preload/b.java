package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import defpackage.mr3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements mr3 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ DefaultPreloadManager.PreloadStatus J;

    public /* synthetic */ b(DefaultPreloadManager.PreloadStatus preloadStatus, byte b) {
        this.I = b;
        this.J = preloadStatus;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        boolean lambda$onPrepareError$1;
        boolean lambda$onPreCacheCompleted$0;
        boolean lambda$onDownloadError$2;
        boolean lambda$onUsedByPlayer$3;
        boolean lambda$onPreloadError$5;
        boolean lambda$onLoadedToTheEndOfSource$4;
        boolean lambda$continueOrCompletePreloading$6;
        byte b = this.I;
        DefaultPreloadManager.PreloadStatus preloadStatus = this.J;
        DefaultPreloadManager.PreloadStatus preloadStatus2 = (DefaultPreloadManager.PreloadStatus) obj;
        switch (b) {
            case 0:
                lambda$onPrepareError$1 = DefaultPreloadManager.PreCacheHelperListener.lambda$onPrepareError$1(preloadStatus, preloadStatus2);
                return lambda$onPrepareError$1;
            case 1:
                lambda$onPreCacheCompleted$0 = DefaultPreloadManager.PreCacheHelperListener.lambda$onPreCacheCompleted$0(preloadStatus, preloadStatus2);
                return lambda$onPreCacheCompleted$0;
            case 2:
                lambda$onDownloadError$2 = DefaultPreloadManager.PreCacheHelperListener.lambda$onDownloadError$2(preloadStatus, preloadStatus2);
                return lambda$onDownloadError$2;
            case 3:
                lambda$onUsedByPlayer$3 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$onUsedByPlayer$3(preloadStatus, preloadStatus2);
                return lambda$onUsedByPlayer$3;
            case 4:
                lambda$onPreloadError$5 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$onPreloadError$5(preloadStatus, preloadStatus2);
                return lambda$onPreloadError$5;
            case 5:
                lambda$onLoadedToTheEndOfSource$4 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$onLoadedToTheEndOfSource$4(preloadStatus, preloadStatus2);
                return lambda$onLoadedToTheEndOfSource$4;
            default:
                lambda$continueOrCompletePreloading$6 = DefaultPreloadManager.PreloadMediaSourceControl.lambda$continueOrCompletePreloading$6(preloadStatus, preloadStatus2);
                return lambda$continueOrCompletePreloading$6;
        }
    }
}
