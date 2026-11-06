package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bg extends vk0 {
    public static final u05 S = new u05(new q7(6));
    public static final zf T = new zf();
    public final Choreographer I;
    public final Handler J;
    public boolean O;
    public boolean P;
    public final eg R;
    public final Object K = new Object();
    public final pp L = new pp();
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public final ag Q = new ag(this);

    public bg(Choreographer choreographer, Handler handler) {
        this.I = choreographer;
        this.J = handler;
        this.R = new eg(choreographer, this);
    }

    public final Runnable a0() {
        Runnable runnable;
        synchronized (this.K) {
            pp ppVar = this.L;
            runnable = (Runnable) (ppVar.isEmpty() ? null : ppVar.removeFirst());
        }
        return runnable;
    }

    public final void b0() {
        boolean z;
        do {
            Runnable a0 = a0();
            while (a0 != null) {
                a0.run();
                a0 = a0();
            }
            synchronized (this.K) {
                if (this.L.isEmpty()) {
                    z = false;
                    this.O = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        synchronized (this.K) {
            this.L.addLast(runnable);
            if (!this.O) {
                this.O = true;
                this.J.post(this.Q);
                if (!this.P) {
                    this.P = true;
                    this.I.postFrameCallback(this.Q);
                }
            }
        }
    }
}
