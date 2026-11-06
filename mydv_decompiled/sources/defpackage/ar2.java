package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ar2 {
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    public static final /* synthetic */ long K;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = gq.a;
        I = unsafe.objectFieldOffset(ar2.class.getDeclaredField("_next$volatile"));
        J = unsafe.objectFieldOffset(ar2.class.getDeclaredField("_prev$volatile"));
        K = unsafe.objectFieldOffset(ar2.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(ar2 ar2Var, int i) {
        ar2 ar2Var2;
        ar2 ar2Var3;
        while (true) {
            ar2 h = this.h();
            if (h instanceof nk2) {
                return (((nk2) h).L & i) == 0 && h.c(ar2Var, i);
            }
            Unsafe unsafe = gq.a;
            unsafe.putObjectVolatile(ar2Var, J, h);
            long j = I;
            unsafe.putObjectVolatile(ar2Var, j, this);
            while (true) {
                Unsafe unsafe2 = gq.a;
                ar2Var2 = this;
                ar2Var3 = ar2Var;
                if (unsafe2.compareAndSwapObject(h, I, ar2Var2, ar2Var3)) {
                    ar2Var3.e(ar2Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != ar2Var2) {
                    break;
                }
                this = ar2Var2;
                ar2Var = ar2Var3;
            }
            this = ar2Var2;
            ar2Var = ar2Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ar2 d() {
        /*
            r15 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.gq.a
            long r1 = defpackage.ar2.J
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            ar2 r7 = (defpackage.ar2) r7
            r0 = 0
            r9 = r0
            r8 = r7
        Le:
            if (r8 == 0) goto L7b
            sun.misc.Unsafe r3 = defpackage.gq.a
            long r4 = defpackage.ar2.I
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L36
            if (r7 != r8) goto L1d
            goto L2a
        L1d:
            sun.misc.Unsafe r3 = defpackage.gq.a
            long r5 = defpackage.ar2.J
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L33
        L31:
            r15 = r7
            goto L0
        L33:
            r15 = r7
            r7 = r14
            goto L1d
        L36:
            r14 = r7
            r7 = r15
            boolean r15 = r7.i()
            if (r15 == 0) goto L3f
            return r0
        L3f:
            boolean r15 = r6 instanceof defpackage.z34
            if (r15 == 0) goto L72
            if (r9 == 0) goto L62
            z34 r6 = (defpackage.z34) r6
            ar2 r13 = r6.a
        L49:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.gq.a
            long r10 = defpackage.ar2.I
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L5b
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto Le
        L5b:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L49
            goto L31
        L62:
            if (r8 == 0) goto L6e
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            ar2 r8 = (defpackage.ar2) r8
        L6b:
            r15 = r7
            r7 = r14
            goto Le
        L6e:
            defpackage.zl1.c()
            return r0
        L72:
            r6.getClass()
            r15 = r6
            ar2 r15 = (defpackage.ar2) r15
            r9 = r8
            r8 = r15
            goto L6b
        L7b:
            defpackage.zl1.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar2.d():ar2");
    }

    public final void e(ar2 ar2Var) {
        ar2 ar2Var2;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = J;
            ar2 ar2Var3 = (ar2) unsafe.getObjectVolatile(ar2Var, j);
            if (this.f() != ar2Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = gq.a;
                ar2Var2 = this;
                ar2 ar2Var4 = ar2Var;
                if (unsafe2.compareAndSwapObject(ar2Var4, J, ar2Var3, ar2Var2)) {
                    if (ar2Var2.i()) {
                        ar2Var4.d();
                        return;
                    }
                    return;
                } else {
                    ar2Var = ar2Var4;
                    if (unsafe2.getObjectVolatile(ar2Var4, j) != ar2Var3) {
                        break;
                    } else {
                        this = ar2Var2;
                    }
                }
            }
            this = ar2Var2;
        }
    }

    public final Object f() {
        return gq.a.getObjectVolatile(this, I);
    }

    public final ar2 g() {
        Object f = f();
        z34 z34Var = f instanceof z34 ? (z34) f : null;
        if (z34Var != null) {
            return z34Var.a;
        }
        f.getClass();
        return (ar2) f;
    }

    public final ar2 h() {
        ar2 d = d();
        if (d != null) {
            return d;
        }
        Unsafe unsafe = gq.a;
        long j = J;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            ar2 ar2Var = (ar2) objectVolatile;
            if (!ar2Var.i()) {
                return ar2Var;
            }
            objectVolatile = gq.a.getObjectVolatile(ar2Var, j);
        }
    }

    public boolean i() {
        return f() instanceof z34;
    }

    public String toString() {
        return new ed2(this) + '@' + o7.y(this);
    }
}
