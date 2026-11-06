package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.util.ReleasableExecutor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mx3 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ gz4 J;
    public final /* synthetic */ Consumer K;

    public /* synthetic */ mx3(gz4 gz4Var, Consumer consumer, byte b) {
        this.I = b;
        this.J = gz4Var;
        this.K = consumer;
    }

    @Override // defpackage.gz4
    public final Object get() {
        ReleasableExecutor lambda$setDownloadExecutor$1;
        ReleasableExecutor lambda$setDownloadExecutor$0;
        switch (this.I) {
            case 0:
                lambda$setDownloadExecutor$1 = ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1(this.J, this.K);
                return lambda$setDownloadExecutor$1;
            default:
                lambda$setDownloadExecutor$0 = SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0(this.J, this.K);
                return lambda$setDownloadExecutor$0;
        }
    }
}
