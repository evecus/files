package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.preload.PreCacheHelper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ PreCacheHelper.ReleasableExecutorSupplier J;

    public /* synthetic */ i(PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier, byte b) {
        this.I = b;
        this.J = releasableExecutorSupplier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier = this.J;
        switch (b) {
            case 0:
                releasableExecutorSupplier.lambda$onExecutorReleased$0();
                break;
            default:
                releasableExecutorSupplier.onExecutorReleased();
                break;
        }
    }
}
