package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dg implements Choreographer.FrameCallback {
    public final /* synthetic */ k10 I;
    public final /* synthetic */ tm1 J;

    public dg(k10 k10Var, eg egVar, tm1 tm1Var) {
        this.I = k10Var;
        this.J = tm1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object g54Var;
        try {
            g54Var = this.J.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        this.I.resumeWith(g54Var);
    }
}
