package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class e42 extends k13 implements na2 {
    public abstract long j0(pw2 pw2Var, long j);

    public abstract boolean k0();

    @Override // defpackage.na2
    public int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return a42Var.b(i);
    }

    @Override // defpackage.na2
    public int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return a42Var.t(i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        long j0 = j0(pw2Var, j);
        if (k0()) {
            j0 = eh0.e(j, j0);
        }
        bn3 u = pw2Var.u(j0);
        return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 4));
    }

    @Override // defpackage.na2
    public int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return a42Var.Q(i);
    }

    @Override // defpackage.na2
    public int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return a42Var.p(i);
    }
}
