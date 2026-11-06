package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ks0 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ LoadControl J;

    public /* synthetic */ ks0(LoadControl loadControl, byte b) {
        this.I = b;
        this.J = loadControl;
    }

    @Override // defpackage.gz4
    public final Object get() {
        LoadControl lambda$setLoadControl$3;
        LoadControl lambda$setLoadControl$19;
        LoadControl lambda$new$11;
        byte b = this.I;
        LoadControl loadControl = this.J;
        switch (b) {
            case 0:
                lambda$setLoadControl$3 = DefaultPreloadManager.Builder.lambda$setLoadControl$3(loadControl);
                return lambda$setLoadControl$3;
            case 1:
                lambda$setLoadControl$19 = ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
                return lambda$setLoadControl$19;
            default:
                lambda$new$11 = ExoPlayer.Builder.lambda$new$11(loadControl);
                return lambda$new$11;
        }
    }
}
