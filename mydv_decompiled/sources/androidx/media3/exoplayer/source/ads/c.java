package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ c(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) obj2).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) obj);
                break;
            default:
                ((AdsMediaSource.ComponentListener) obj2).lambda$onAdPlaybackState$0((AdPlaybackState) obj);
                break;
        }
    }
}
