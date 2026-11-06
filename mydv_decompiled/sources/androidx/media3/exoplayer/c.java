package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ c(Object obj, Object obj2, byte b) {
        this.I = b;
        this.K = obj;
        this.J = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.J;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) obj2).lambda$enable$1((Context) obj);
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) obj2).lambda$enable$1((Context) obj);
                break;
            case 2:
                ((ExoPlayerImpl) obj2).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) obj);
                break;
            default:
                ((ExoPlayerImplInternal) obj2).lambda$sendMessageToTargetThread$4((PlayerMessage) obj);
                break;
        }
    }
}
