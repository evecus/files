package defpackage;

import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qu implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ BasePreloadManager J;
    public final /* synthetic */ MediaSource K;
    public final /* synthetic */ mr3 L;

    public /* synthetic */ qu(BasePreloadManager basePreloadManager, MediaSource mediaSource, mr3 mr3Var, byte b) {
        this.I = b;
        this.J = basePreloadManager;
        this.K = mediaSource;
        this.L = mr3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        mr3 mr3Var = this.L;
        MediaSource mediaSource = this.K;
        BasePreloadManager basePreloadManager = this.J;
        switch (b) {
            case 0:
                basePreloadManager.lambda$onSkipped$8(mediaSource, mr3Var);
                break;
            default:
                basePreloadManager.lambda$onCompleted$1(mediaSource, mr3Var);
                break;
        }
    }
}
