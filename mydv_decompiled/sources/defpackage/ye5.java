package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ye5 extends k13 implements na2 {
    public float I;
    public float J;

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        int b = a42Var.b(i);
        int b2 = !Float.isNaN(this.J) ? r7.b(this.J, (hs2) b42Var) : 0;
        return b < b2 ? b2 : b;
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        int t = a42Var.t(i);
        int b = !Float.isNaN(this.I) ? r7.b(this.I, (hs2) b42Var) : 0;
        return t < b ? b : t;
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        int j2;
        int i;
        if (Float.isNaN(this.I) || dh0.j(j) != 0) {
            j2 = dh0.j(j);
        } else {
            int X = ww2Var.X(this.I);
            j2 = dh0.h(j);
            if (X < 0) {
                X = 0;
            }
            if (X <= j2) {
                j2 = X;
            }
        }
        int h = dh0.h(j);
        if (Float.isNaN(this.J) || dh0.i(j) != 0) {
            i = dh0.i(j);
        } else {
            int X2 = ww2Var.X(this.J);
            i = dh0.g(j);
            int i2 = X2 >= 0 ? X2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        bn3 u = pw2Var.u(eh0.a(j2, h, i, dh0.g(j)));
        return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 13));
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        int Q = a42Var.Q(i);
        int b = !Float.isNaN(this.J) ? r7.b(this.J, (hs2) b42Var) : 0;
        return Q < b ? b : Q;
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        int p = a42Var.p(i);
        int b = !Float.isNaN(this.I) ? r7.b(this.I, (hs2) b42Var) : 0;
        return p < b ? b : p;
    }
}
