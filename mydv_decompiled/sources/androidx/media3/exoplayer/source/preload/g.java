package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Consumer {
    public final /* synthetic */ byte I;
    public final /* synthetic */ PreCacheHelper.DownloadCallback J;
    public final /* synthetic */ IOException K;

    public /* synthetic */ g(PreCacheHelper.DownloadCallback downloadCallback, IOException iOException, byte b) {
        this.I = b;
        this.J = downloadCallback;
        this.K = iOException;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        byte b = this.I;
        IOException iOException = this.K;
        PreCacheHelper.DownloadCallback downloadCallback = this.J;
        PreCacheHelper.Listener listener = (PreCacheHelper.Listener) obj;
        switch (b) {
            case 0:
                downloadCallback.lambda$onPrepareError$1(iOException, listener);
                break;
            default:
                downloadCallback.lambda$onDownloadStopped$2(iOException, listener);
                break;
        }
    }
}
