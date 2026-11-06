package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hf3 extends jg3 {
    public static final hf3 c = new hf3(0, 2, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        int i;
        w22 w22Var = (w22) mo1Var.d(0);
        int c2 = wr4Var.c((bo1) mo1Var.d(1));
        if (wr4Var.t >= c2) {
            ke0.a("Check failed");
        }
        jl2.f0(wr4Var, apVar, c2);
        int i2 = wr4Var.t;
        int i3 = wr4Var.v;
        while (i3 >= 0 && !wr4Var.x(i3)) {
            i3 = wr4Var.F(i3, wr4Var.b);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (wr4Var.u(i2, i4)) {
                if (wr4Var.x(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += wr4Var.x(i4) ? 1 : wr4Var.E(i4);
                i4 += wr4Var.t(i4);
            }
        }
        while (true) {
            i = wr4Var.t;
            if (i >= c2) {
                break;
            }
            if (wr4Var.u(c2, i)) {
                int i6 = wr4Var.t;
                if (i6 < wr4Var.u && (wr4Var.b[(wr4Var.q(i6) * 5) + 1] & 1073741824) != 0) {
                    apVar.b(wr4Var.D(wr4Var.t));
                    i5 = 0;
                }
                wr4Var.Q();
            } else {
                i5 += wr4Var.M();
            }
        }
        if (i != c2) {
            ke0.a("Check failed");
        }
        w22Var.a = i5;
    }
}
