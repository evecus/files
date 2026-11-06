package defpackage;

import android.view.KeyEvent;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ik implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ik(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        int i = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                ((IntConsumer) obj).accept(i);
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$audioSessionIdChanged$12(i);
                break;
            default:
                kx2 kx2Var = (kx2) obj;
                kx2Var.a.dispatchKeyEvent(new KeyEvent(0, i));
                kx2Var.a.dispatchKeyEvent(new KeyEvent(1, i));
                break;
        }
    }
}
