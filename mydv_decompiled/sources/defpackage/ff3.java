package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ff3 extends jg3 {
    public static final ff3 c = new ff3(0, 4, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        r23 r23Var = (r23) mo1Var.d(2);
        r23 r23Var2 = (r23) mo1Var.d(3);
        re0 re0Var = (re0) mo1Var.d(1);
        q23 q23Var = (q23) mo1Var.d(0);
        if (q23Var == null && (q23Var = re0Var.movableContentStateResolve$runtime(r23Var)) == null) {
            ke0.b("Could not resolve state for movable content");
            zy.n();
            return;
        }
        tr4 a = vr4.a(q23Var.a);
        if (wr4Var.n > 0 || wr4Var.t(wr4Var.t + 1) != 1) {
            ke0.a("Check failed");
        }
        int i = wr4Var.t;
        int i2 = wr4Var.i;
        int i3 = wr4Var.j;
        wr4Var.a(1);
        wr4Var.Q();
        wr4Var.d();
        wr4 j = a.j();
        try {
            List i4 = li4.i(j, 2, wr4Var, false, true, true);
            j.e(true);
            wr4Var.j();
            wr4Var.i();
            wr4Var.t = i;
            wr4Var.i = i2;
            wr4Var.j = i3;
            r23Var2.getClass();
            vt0.e(wr4Var, i4, null);
        } catch (Throwable th) {
            j.e(false);
            throw th;
        }
    }
}
