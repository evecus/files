package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ PreCacheHelper.DownloadCallback J;
    public final /* synthetic */ Object K;

    public /* synthetic */ f(PreCacheHelper.DownloadCallback downloadCallback, Object obj, byte b) {
        this.I = b;
        this.J = downloadCallback;
        this.K = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.K;
        PreCacheHelper.DownloadCallback downloadCallback = this.J;
        switch (b) {
            case 0:
                downloadCallback.lambda$onDownloadProgress$6((PreCacheHelper.Task) obj);
                break;
            case 1:
                downloadCallback.lambda$onDownloadStopped$4((PreCacheHelper.Task) obj);
                break;
            default:
                downloadCallback.lambda$notifyListeners$7((Consumer) obj);
                break;
        }
    }
}
