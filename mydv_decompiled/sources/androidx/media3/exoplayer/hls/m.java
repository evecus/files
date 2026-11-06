package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.upstream.Loader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Loader.Callback J;

    public /* synthetic */ m(Loader.Callback callback, byte b) {
        this.I = b;
        this.J = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Loader.Callback callback = this.J;
        switch (b) {
            case 0:
                ((HlsSampleStreamWrapper) callback).maybeFinishPrepare();
                break;
            case 1:
                ((HlsSampleStreamWrapper) callback).onTracksEnded();
                break;
            default:
                ((HlsInterstitialsAdsLoader.LoaderCallback) callback).lambda$onLoadCanceled$3();
                break;
        }
    }
}
