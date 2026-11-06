package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ PreloadMediaSource.PreloadMediaPeriodCallback J;
    public final /* synthetic */ MediaPeriod K;

    public /* synthetic */ k(PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod, byte b) {
        this.I = b;
        this.J = preloadMediaPeriodCallback;
        this.K = mediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        MediaPeriod mediaPeriod = this.K;
        PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback = this.J;
        switch (b) {
            case 0:
                preloadMediaPeriodCallback.lambda$onPrepared$0(mediaPeriod);
                break;
            default:
                preloadMediaPeriodCallback.lambda$onContinueLoadingRequested$1(mediaPeriod);
                break;
        }
    }
}
