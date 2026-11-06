package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i45 implements PointerInputEventHandler {
    public final /* synthetic */ dl0 I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t33 K;
    public final /* synthetic */ t43 L;

    public i45(dl0 dl0Var, t43 t43Var, t33 t33Var, t43 t43Var2) {
        this.I = dl0Var;
        this.J = t43Var;
        this.K = t33Var;
        this.L = t43Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        h45 h45Var = new h45(this.I, this.J, this.K, null);
        gm4 gm4Var = new gm4(this.L, (byte) 5);
        m31 m31Var = z15.a;
        Object o0 = i42.o0(new ld(xp3Var, h45Var, gm4Var, new ts3(xp3Var), null, (byte) 8), fj0Var);
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (o0 != el0Var) {
            o0 = wd5Var;
        }
        return o0 == el0Var ? o0 : wd5Var;
    }
}
