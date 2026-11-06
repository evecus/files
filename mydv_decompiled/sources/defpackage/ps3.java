package defpackage;

import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ps3 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ PreloadMediaSource J;

    public /* synthetic */ ps3(PreloadMediaSource preloadMediaSource, byte b) {
        this.I = b;
        this.J = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        PreloadMediaSource preloadMediaSource = this.J;
        switch (b) {
            case 0:
                preloadMediaSource.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                preloadMediaSource.lambda$clear$1();
                break;
            default:
                preloadMediaSource.checkForPreloadError();
                break;
        }
    }
}
