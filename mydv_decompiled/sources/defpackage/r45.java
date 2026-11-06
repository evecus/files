package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r45 implements s35 {
    public final /* synthetic */ u45 a;
    public final /* synthetic */ boolean b;

    public r45(u45 u45Var, boolean z) {
        this.a = u45Var;
        this.b = z;
    }

    @Override // defpackage.s35
    public final void b() {
        u45 u45Var = this.a;
        u45Var.q(null);
        u45Var.p(null);
        u45Var.u(true);
    }

    @Override // defpackage.s35
    public final void c() {
        u45 u45Var = this.a;
        u45Var.q(null);
        u45Var.p(null);
        u45Var.u(true);
    }

    @Override // defpackage.s35
    public final void d() {
        v55 d;
        boolean z = this.b;
        is1 is1Var = z ? is1.J : is1.K;
        u45 u45Var = this.a;
        u45Var.q(is1Var);
        long a = fi4.a(u45Var.j(z));
        oh2 oh2Var = u45Var.d;
        if (oh2Var == null || (d = oh2Var.d()) == null) {
            return;
        }
        long e = d.e(a);
        u45Var.n = e;
        u45Var.p(new pd3(e));
        u45Var.p = 0L;
        u45Var.s = -1;
        oh2 oh2Var2 = u45Var.d;
        if (oh2Var2 != null) {
            oh2Var2.q.setValue(Boolean.TRUE);
        }
        u45Var.u(false);
    }

    @Override // defpackage.s35
    public final void e(long j) {
        u45 u45Var = this.a;
        long f = pd3.f(u45Var.p, j);
        u45Var.p = f;
        u45Var.p(new pd3(pd3.f(u45Var.n, f)));
        d55 l = u45Var.l();
        pd3 g = u45Var.g();
        g.getClass();
        u45Var.v(l, g.a, false, this.b, n84.V, true, new us1(9));
        u45Var.u(false);
    }

    @Override // defpackage.s35
    public final void onCancel() {
    }

    @Override // defpackage.s35
    public final void a(long j, hn3 hn3Var) {
    }
}
