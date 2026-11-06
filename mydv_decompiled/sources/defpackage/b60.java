package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b60 extends y52 {
    public final k10 M;

    public b60(k10 k10Var) {
        this.M = k10Var;
    }

    @Override // defpackage.y52
    public final boolean k() {
        return true;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        e62 j = j();
        k10 k10Var = this.M;
        Throwable q = k10Var.q(j);
        if (k10Var.x()) {
            nx0 nx0Var = (nx0) k10Var.L;
            long j2 = nx0.P;
            loop0: while (true) {
                Object objectVolatile = gq.a.getObjectVolatile(nx0Var, j2);
                ep epVar = qb.f;
                if (j42.c(objectVolatile, epVar)) {
                    do {
                        unsafe = gq.a;
                        if (unsafe.compareAndSwapObject(nx0Var, nx0.P, epVar, q)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(nx0Var, j2) == epVar);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = gq.a;
                        if (unsafe2.compareAndSwapObject(nx0Var, nx0.P, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(nx0Var, j2) == objectVolatile);
                }
            }
        }
        k10Var.j(q);
        if (k10Var.x()) {
            return;
        }
        k10Var.o();
    }
}
