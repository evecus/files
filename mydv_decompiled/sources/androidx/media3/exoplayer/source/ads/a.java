package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AdsMediaSource J;
    public final /* synthetic */ AdsMediaSource.ComponentListener K;

    public /* synthetic */ a(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, byte b) {
        this.I = b;
        this.J = adsMediaSource;
        this.K = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        AdsMediaSource.ComponentListener componentListener = this.K;
        AdsMediaSource adsMediaSource = this.J;
        switch (b) {
            case 0:
                adsMediaSource.lambda$prepareSourceInternal$0(componentListener);
                break;
            default:
                adsMediaSource.lambda$releaseSourceInternal$1(componentListener);
                break;
        }
    }
}
