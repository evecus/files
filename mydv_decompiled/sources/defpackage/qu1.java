package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qu1 implements PointerInputEventHandler {
    public final /* synthetic */ boolean I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ ab4 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ t43 N;

    public qu1(boolean z, hu2 hu2Var, ab4 ab4Var, t43 t43Var, boolean z2, t43 t43Var2) {
        this.I = z;
        this.J = hu2Var;
        this.K = ab4Var;
        this.L = t43Var;
        this.M = z2;
        this.N = t43Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        Object d = z15.d(xp3Var, null, null, null, new vt1(this.I, this.J, this.K, this.L, this.M, this.N, (byte) 1), fj0Var, 7);
        return d == el0.I ? d : wd5.a;
    }
}
