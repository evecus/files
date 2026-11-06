package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bb0 implements PointerInputEventHandler {
    public final /* synthetic */ float I;
    public final /* synthetic */ rm1 J;

    public bb0(float f, rm1 rm1Var) {
        this.I = f;
        this.J = rm1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        o24 o24Var = new o24();
        v1 v1Var = new v1(o24Var, (byte) 12);
        za0 za0Var = new za0(o24Var, this.I, this.J);
        ab0 ab0Var = new ab0(o24Var, (byte) 0);
        float f = z21.a;
        Object k = e21.k(xp3Var, new v21(v1Var, ab0Var, za0Var, new u7((byte) 19), (fj0) null, (byte) 1), fj0Var);
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (k != el0Var) {
            k = wd5Var;
        }
        return k == el0Var ? k : wd5Var;
    }
}
