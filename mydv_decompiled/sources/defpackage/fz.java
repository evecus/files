package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fz implements os5 {
    public Object I = kz.p;
    public k10 J;
    public final /* synthetic */ iz K;

    public fz(iz izVar) {
        this.K = izVar;
    }

    public final Object a(gj0 gj0Var) {
        c50 c50Var;
        c50 c50Var2;
        Object obj = this.I;
        boolean z = true;
        if (obj == kz.p || obj == kz.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.O;
            iz izVar = this.K;
            c50 c50Var3 = (c50) atomicReferenceFieldUpdater.get(izVar);
            while (true) {
                if (izVar.x()) {
                    this.I = kz.l;
                    Throwable p = izVar.p();
                    if (p != null) {
                        int i = nu4.a;
                        throw p;
                    }
                    z = false;
                } else {
                    long andIncrement = iz.K.getAndIncrement(izVar);
                    long j = kz.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c50Var3.e != j2) {
                        c50 m = izVar.m(j2, c50Var3);
                        if (m == null) {
                            continue;
                        } else {
                            c50Var = m;
                        }
                    } else {
                        c50Var = c50Var3;
                    }
                    Object J = izVar.J(c50Var, i2, andIncrement, null);
                    ep epVar = kz.m;
                    if (J == epVar) {
                        zy.i("unreachable");
                        return null;
                    }
                    ep epVar2 = kz.o;
                    if (J == epVar2) {
                        if (andIncrement < izVar.t()) {
                            c50Var.b();
                        }
                        c50Var3 = c50Var;
                    } else {
                        if (J == kz.n) {
                            k10 G = mw2.G(mu0.G(gj0Var));
                            try {
                                this.J = G;
                                Object J2 = izVar.J(c50Var, i2, andIncrement, this);
                                if (J2 == epVar) {
                                    b(c50Var, i2);
                                } else {
                                    if (J2 == epVar2) {
                                        if (andIncrement < izVar.t()) {
                                            c50Var.b();
                                        }
                                        c50 c50Var4 = (c50) iz.O.get(izVar);
                                        while (true) {
                                            if (izVar.x()) {
                                                k10 k10Var = this.J;
                                                k10Var.getClass();
                                                this.J = null;
                                                this.I = kz.l;
                                                Throwable p2 = izVar.p();
                                                if (p2 == null) {
                                                    k10Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    k10Var.resumeWith(new g54(p2));
                                                }
                                            } else {
                                                long andIncrement2 = iz.K.getAndIncrement(izVar);
                                                long j3 = kz.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c50Var4.e != j4) {
                                                    c50 m2 = izVar.m(j4, c50Var4);
                                                    if (m2 != null) {
                                                        c50Var2 = m2;
                                                    }
                                                } else {
                                                    c50Var2 = c50Var4;
                                                }
                                                Object J3 = izVar.J(c50Var2, i3, andIncrement2, this);
                                                c50 c50Var5 = c50Var2;
                                                if (J3 == kz.m) {
                                                    b(c50Var5, i3);
                                                    break;
                                                }
                                                if (J3 == kz.o) {
                                                    if (andIncrement2 < izVar.t()) {
                                                        c50Var5.b();
                                                    }
                                                    c50Var4 = c50Var5;
                                                } else {
                                                    if (J3 == kz.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c50Var5.b();
                                                    this.I = J3;
                                                    this.J = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c50Var.b();
                                        this.I = J2;
                                        this.J = null;
                                    }
                                    G.i(Boolean.TRUE, null);
                                }
                                return G.r();
                            } catch (Throwable th) {
                                G.A();
                                throw th;
                            }
                        }
                        c50Var.b();
                        this.I = J;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.os5
    public final void b(lh4 lh4Var, int i) {
        k10 k10Var = this.J;
        if (k10Var != null) {
            k10Var.b(lh4Var, i);
        }
    }

    public final Object c() {
        Object obj = this.I;
        ep epVar = kz.p;
        if (obj == epVar) {
            zy.i("`hasNext()` has not been invoked");
            return null;
        }
        this.I = epVar;
        if (obj != kz.l) {
            return obj;
        }
        Throwable q = this.K.q();
        int i = nu4.a;
        throw q;
    }
}
