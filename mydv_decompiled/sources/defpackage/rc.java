package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rc implements PointerInputEventHandler {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ rc(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        fj0 fj0Var2 = null;
        Object obj = this.J;
        switch (b) {
            case 0:
                Object k = e21.k(xp3Var, new qc((sc) obj, fj0Var2, (byte) 0), fj0Var);
                return k == el0Var ? k : wd5Var;
            default:
                Object o0 = i42.o0(new r((Object) xp3Var, obj, fj0Var2, (byte) 23), fj0Var);
                return o0 == el0Var ? o0 : wd5Var;
        }
    }
}
