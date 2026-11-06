package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bi4 implements PointerInputEventHandler {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bi4(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        byte b = this.I;
        fj0 fj0Var2 = null;
        Object obj = this.J;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                Object j0 = ((r05) xp3Var).j0(new ai4((xj0) obj, null), fj0Var);
                return j0 == el0Var ? j0 : wd5Var;
            case 1:
                Object k = e21.k(xp3Var, new ue2((iy4) obj, fj0Var2, (byte) 2), fj0Var);
                return k == el0Var ? k : wd5Var;
            case 2:
                Object k2 = e21.k(xp3Var, new qc(new sd(1, (a35) obj, a35.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 3), fj0Var2, (byte) 1), fj0Var);
                if (k2 != el0Var) {
                    k2 = wd5Var;
                }
                return k2 == el0Var ? k2 : wd5Var;
            case 3:
                u45 u45Var = (u45) obj;
                zp4 zp4Var = u45Var.z;
                s45 s45Var = u45Var.y;
                r05 r05Var = (r05) xp3Var;
                r05Var.getClass();
                gr5 gr5Var = ut0.U(r05Var).i0;
                yv yvVar = new yv();
                yvVar.b = gr5Var;
                Object k3 = e21.k(xp3Var, new ue2(yvVar, zp4Var, s45Var, null), fj0Var);
                if (k3 != el0Var) {
                    k3 = wd5Var;
                }
                return k3 == el0Var ? k3 : wd5Var;
            case 4:
                Object o0 = i42.o0(new q30(xp3Var, (s35) obj, fj0Var2, (byte) 6), fj0Var);
                if (o0 != el0Var) {
                    o0 = wd5Var;
                }
                return o0 == el0Var ? o0 : wd5Var;
            default:
                Object d = z15.d(xp3Var, null, null, null, new ap3((Object) xp3Var, obj, (byte) 18), fj0Var, 7);
                return d == el0Var ? d : wd5Var;
        }
    }
}
