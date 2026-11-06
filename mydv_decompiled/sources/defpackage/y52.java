package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class y52 extends ar2 implements cy0, wy1 {
    public e62 L;

    @Override // defpackage.wy1
    public final pa3 b() {
        return null;
    }

    @Override // defpackage.cy0
    public final void dispose() {
        y52 y52Var;
        Unsafe unsafe;
        long j;
        e62 j2 = j();
        while (true) {
            Object H = j2.H();
            if (H instanceof y52) {
                if (H != this) {
                    return;
                }
                i91 i91Var = p70.w;
                do {
                    unsafe = gq.a;
                    j = e62.K;
                    if (unsafe.compareAndSwapObject(j2, j, H, i91Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == H);
            } else {
                if (!(H instanceof wy1) || ((wy1) H).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (f instanceof z34) {
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    ar2 ar2Var = (ar2) f;
                    Unsafe unsafe2 = gq.a;
                    long j3 = ar2.K;
                    z34 z34Var = (z34) unsafe2.getObjectVolatile(ar2Var, j3);
                    if (z34Var == null) {
                        z34Var = new z34(ar2Var);
                        unsafe2.putObjectVolatile(ar2Var, j3, z34Var);
                    }
                    z34 z34Var2 = z34Var;
                    while (true) {
                        Unsafe unsafe3 = gq.a;
                        long j4 = ar2.I;
                        y52Var = this;
                        if (unsafe3.compareAndSwapObject(y52Var, j4, f, z34Var2)) {
                            ar2Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(y52Var, j4) != f) {
                            break;
                        } else {
                            this = y52Var;
                        }
                    }
                    this = y52Var;
                }
            }
        }
    }

    @Override // defpackage.wy1
    public final boolean isActive() {
        return true;
    }

    public final e62 j() {
        e62 e62Var = this.L;
        if (e62Var != null) {
            return e62Var;
        }
        j42.g0("job");
        throw null;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(Throwable th);

    @Override // defpackage.ar2
    public final String toString() {
        return getClass().getSimpleName() + '@' + o7.y(this) + "[job@" + o7.y(j()) + ']';
    }
}
