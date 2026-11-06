package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o04 extends ns4 {
    public final tm1 e;
    public int f;

    public o04(long j, us4 us4Var, tm1 tm1Var) {
        super(j, us4Var);
        this.e = tm1Var;
        this.f = 1;
    }

    @Override // defpackage.ns4
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
    public final tm1 i() {
        return null;
    }

    @Override // defpackage.ns4
    public final void k() {
        this.f++;
    }

    @Override // defpackage.ns4
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ns4
    public final void n(kw4 kw4Var) {
        ba4 ba4Var = ws4.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ns4
    public final ns4 u(tm1 tm1Var) {
        ws4.w(this);
        return new z83(this.b, this.a, ws4.i(tm1Var, this.e, true), this);
    }

    @Override // defpackage.ns4
    public final void m() {
    }
}
