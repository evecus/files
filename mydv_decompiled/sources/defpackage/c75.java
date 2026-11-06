package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c75 extends y52 {
    public static final /* synthetic */ long O = gq.a.objectFieldOffset(c75.class.getDeclaredField("_state$volatile"));
    public final Thread M = Thread.currentThread();
    public cy0 N;
    private volatile /* synthetic */ int _state$volatile;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.y52
    public final boolean k() {
        return true;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = gq.a;
            long j = O;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                n(intVolatile);
                throw null;
            }
            c75 c75Var = this;
            if (unsafe.compareAndSwapInt(c75Var, O, intVolatile, 2)) {
                c75Var.M.interrupt();
                unsafe.putIntVolatile(c75Var, j, 3);
                return;
            }
            this = c75Var;
        }
    }

    public final void m() {
        c75 c75Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = O;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                c75Var = this;
                if (unsafe.compareAndSwapInt(c75Var, j, intVolatile, 1)) {
                    cy0 cy0Var = c75Var.N;
                    if (cy0Var != null) {
                        cy0Var.dispose();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                c75Var = this;
            }
            this = c75Var;
        }
    }
}
