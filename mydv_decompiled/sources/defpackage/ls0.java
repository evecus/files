package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ls0 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ RenderersFactory J;

    public /* synthetic */ ls0(RenderersFactory renderersFactory, byte b) {
        this.I = b;
        this.J = renderersFactory;
    }

    @Override // defpackage.gz4
    public final Object get() {
        RenderersFactory lambda$setRenderersFactory$2;
        RenderersFactory lambda$new$6;
        RenderersFactory lambda$new$2;
        RenderersFactory lambda$new$8;
        byte b = this.I;
        RenderersFactory renderersFactory = this.J;
        switch (b) {
            case 0:
                lambda$setRenderersFactory$2 = DefaultPreloadManager.Builder.lambda$setRenderersFactory$2(renderersFactory);
                return lambda$setRenderersFactory$2;
            case 1:
                lambda$new$6 = ExoPlayer.Builder.lambda$new$6(renderersFactory);
                return lambda$new$6;
            case 2:
                lambda$new$2 = ExoPlayer.Builder.lambda$new$2(renderersFactory);
                return lambda$new$2;
            default:
                lambda$new$8 = ExoPlayer.Builder.lambda$new$8(renderersFactory);
                return lambda$new$8;
        }
    }
}
