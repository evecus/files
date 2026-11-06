package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oe1 extends k13 implements na2 {
    public jx0 I;
    public float J;

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (!dh0.d(j) || this.I == jx0.I) {
            j2 = dh0.j(j);
            h = dh0.h(j);
        } else {
            int round = Math.round(dh0.h(j) * this.J);
            int j3 = dh0.j(j);
            j2 = dh0.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        }
        if (!dh0.c(j) || this.I == jx0.J) {
            int i3 = dh0.i(j);
            int g = dh0.g(j);
            i = i3;
            i2 = g;
        } else {
            int round2 = Math.round(dh0.g(j) * this.J);
            int i4 = dh0.i(j);
            i = dh0.g(j);
            if (round2 < i4) {
                round2 = i4;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        bn3 u = pw2Var.u(eh0.a(j2, h, i, i2));
        return ww2Var.A(u.I, u.J, p91.I, new sa(u, (byte) 2));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }
}
