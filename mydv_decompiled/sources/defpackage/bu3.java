package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bu3 extends c2 implements k20, mj4 {
    public final iz M;

    public bu3(tk0 tk0Var, iz izVar) {
        super(tk0Var, true);
        this.M = izVar;
    }

    @Override // defpackage.mj4
    public final Object b(fj0 fj0Var, Object obj) {
        return this.M.b(fj0Var, obj);
    }

    @Override // defpackage.mj4
    public final boolean c(Throwable th) {
        return this.M.g(th, false);
    }

    @Override // defpackage.mj4
    public final Object d(Object obj) {
        return this.M.d(obj);
    }

    @Override // defpackage.e62, defpackage.v52, defpackage.k20
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new w52(u(), null, this);
        }
        r(cancellationException);
    }

    @Override // defpackage.k20
    public final Object f() {
        return this.M.f();
    }

    @Override // defpackage.c2
    public final void f0(Throwable th, boolean z) {
        if (this.M.g(th, false) || z) {
            return;
        }
        o7.C(this.L, th);
    }

    @Override // defpackage.c2
    public final void g0(Object obj) {
        this.M.c(null);
    }

    @Override // defpackage.k20
    public final Object h(fj0 fj0Var) {
        return this.M.h(fj0Var);
    }

    public final void i0(oe oeVar) {
        ep epVar;
        iz izVar = this.M;
        izVar.getClass();
        if (pt1.x(izVar, oeVar)) {
            return;
        }
        do {
            Object objectVolatile = gq.a.getObjectVolatile(izVar, iz.V);
            epVar = kz.q;
            if (objectVolatile != epVar) {
                if (objectVolatile == kz.r) {
                    zy.i("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    zy.h(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
        } while (!pt1.B(izVar, epVar, kz.r));
        oeVar.invoke(izVar.p());
    }

    @Override // defpackage.k20
    public final fz iterator() {
        iz izVar = this.M;
        izVar.getClass();
        return new fz(izVar);
    }

    @Override // defpackage.k20
    public final Object k(ia0 ia0Var) {
        iz izVar = this.M;
        izVar.getClass();
        return iz.E(izVar, ia0Var);
    }

    @Override // defpackage.e62
    public final void r(CancellationException cancellationException) {
        this.M.g(cancellationException, true);
        q(cancellationException);
    }
}
