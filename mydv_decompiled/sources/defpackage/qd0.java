package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qd0 {
    public final ht b;
    public final dl0 c;
    public iz e;
    public rv4 f;
    public boolean g;
    public final jt a = new jt(this, 0);
    public hn1 d = new od0(2, null);

    public qd0(dl0 dl0Var, tr3 tr3Var) {
        this.b = new ht(this, tr3Var);
        this.c = dl0Var;
    }

    public final boolean a() {
        return this.a.b && this.b.b;
    }

    public final void b() {
        iz izVar = this.e;
        if (izVar != null) {
            izVar.g(new CancellationException("onBack cancelled"), true);
        }
        rv4 rv4Var = this.f;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    public final void c() {
        if (this.e != null && !this.g) {
            b();
        }
        if (this.e == null) {
            this.g = false;
            this.e = qb.g(-2, 4, ez.I);
            this.f = p70.g0(this.c, null, null, new r(this, null, (byte) 9), 3);
        }
        iz izVar = this.e;
        if (izVar != null) {
            izVar.c(null);
        }
        this.g = false;
    }

    public final void d() {
        b();
        if (a()) {
            this.g = true;
            this.e = qb.g(-2, 4, ez.I);
            this.f = p70.g0(this.c, null, null, new r(this, null, (byte) 9), 3);
        }
    }

    public final void e(boolean z) {
        rv4 rv4Var;
        if (!z && a() && (rv4Var = this.f) != null && !rv4Var.isActive()) {
            b();
        }
        this.a.f(z);
        this.b.f(z);
    }
}
