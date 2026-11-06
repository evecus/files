package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tu1 implements PointerInputEventHandler {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ rm1 K;

    public /* synthetic */ tu1(boolean z, rm1 rm1Var, byte b) {
        this.I = b;
        this.J = z;
        this.K = rm1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        Object d;
        Object d2;
        Object d3;
        byte b = this.I;
        el0 el0Var = el0.I;
        rm1 rm1Var = this.K;
        boolean z = this.J;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return (z && (d = z15.d(xp3Var, null, null, null, new b40(rm1Var, (byte) 3), fj0Var, 7)) == el0Var) ? d : wd5Var;
            case 1:
                return (z && (d2 = z15.d(xp3Var, null, null, null, new b40(rm1Var, (byte) 20), fj0Var, 7)) == el0Var) ? d2 : wd5Var;
            default:
                return (z && (d3 = z15.d(xp3Var, null, null, null, new b40(rm1Var, (byte) 21), fj0Var, 7)) == el0Var) ? d3 : wd5Var;
        }
    }
}
