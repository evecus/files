package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q45 implements s35 {
    public final /* synthetic */ u45 a;

    public q45(u45 u45Var) {
        this.a = u45Var;
    }

    @Override // defpackage.s35
    public final void a(long j, hn3 hn3Var) {
        v55 d;
        u45 u45Var = this.a;
        long a = fi4.a(u45Var.j(true));
        oh2 oh2Var = u45Var.d;
        if (oh2Var == null || (d = oh2Var.d()) == null) {
            return;
        }
        long e = d.e(a);
        u45Var.n = e;
        u45Var.p(new pd3(e));
        u45Var.p = 0L;
        u45Var.q(is1.I);
        u45Var.u(false);
    }

    @Override // defpackage.s35
    public final void b() {
        u45 u45Var = this.a;
        u45Var.q(null);
        u45Var.p(null);
    }

    @Override // defpackage.s35
    public final void c() {
        u45 u45Var = this.a;
        u45Var.q(null);
        u45Var.p(null);
    }

    @Override // defpackage.s35
    public final void e(long j) {
        v55 d;
        ts1 ts1Var;
        u45 u45Var = this.a;
        u45Var.p = pd3.f(u45Var.p, j);
        oh2 oh2Var = u45Var.d;
        if (oh2Var == null || (d = oh2Var.d()) == null) {
            return;
        }
        u45Var.p(new pd3(pd3.f(u45Var.n, u45Var.p)));
        td3 td3Var = u45Var.b;
        pd3 g = u45Var.g();
        g.getClass();
        int c = td3Var.c(d.b(g.a, true));
        long c2 = ui4.c(c, c);
        if (d65.b(c2, u45Var.l().b)) {
            return;
        }
        oh2 oh2Var2 = u45Var.d;
        if ((oh2Var2 == null || ((Boolean) oh2Var2.q.getValue()).booleanValue()) && (ts1Var = u45Var.j) != null) {
            ((kn3) ts1Var).a(9);
        }
        u45Var.c.invoke(u45.b(u45Var.l().a, c2));
        u45Var.v = new d65(c2);
    }

    @Override // defpackage.s35
    public final void d() {
    }

    @Override // defpackage.s35
    public final void onCancel() {
    }
}
