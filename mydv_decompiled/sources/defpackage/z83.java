package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z83 extends ns4 {
    public final tm1 e;
    public final ns4 f;

    public z83(long j, us4 us4Var, tm1 tm1Var, ns4 ns4Var) {
        super(j, us4Var);
        this.e = tm1Var;
        this.f = ns4Var;
        ns4Var.k();
    }

    @Override // defpackage.ns4
    public final void c() {
        ns4 ns4Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != ns4Var.g()) {
            a();
        }
        ns4Var.l();
        this.c = true;
        synchronized (ws4.c) {
            o();
        }
    }

    @Override // defpackage.ns4
    public final tm1 e() {
        return this.e;
    }

    @Override // defpackage.ns4
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ns4
    public final ns4 u(tm1 tm1Var) {
        return new z83(this.b, this.a, ws4.i(tm1Var, this.e, true), this.f);
    }
}
