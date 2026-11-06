package defpackage;

import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mc implements Executor {
    public final /* synthetic */ byte I;

    public /* synthetic */ mc(byte b) {
        this.I = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.I) {
            case 0:
                runnable.run();
                break;
            default:
                PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
        }
    }
}
