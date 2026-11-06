package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o53 extends hj4 implements m53 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Q = AtomicReferenceFieldUpdater.newUpdater(o53.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long R = gq.a.objectFieldOffset(o53.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public o53() {
        super(1);
        this.owner$volatile = i42.j;
    }

    public final boolean d() {
        return Math.max(gq.a.getIntVolatile(this, hj4.N), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r0.i(r1, r4.J);
     */
    @Override // defpackage.m53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fj0 r5) {
        /*
            r4 = this;
            boolean r0 = r4.f()
            wd5 r1 = defpackage.wd5.a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            fj0 r5 = defpackage.mu0.G(r5)
            k10 r5 = defpackage.mw2.G(r5)
            n53 r0 = new n53     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.hj4.M     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r4.I     // Catch: java.lang.Throwable -> L3c
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L28
            ut1 r4 = r4.J     // Catch: java.lang.Throwable -> L3c
            r0.i(r1, r4)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r2 = r4.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L16
        L2e:
            java.lang.Object r4 = r5.r()
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L37
            goto L38
        L37:
            r4 = r1
        L38:
            if (r4 != r5) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            r5.A()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o53.e(fj0):java.lang.Object");
    }

    public final boolean f() {
        o53 o53Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = hj4.N;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.I) {
                while (true) {
                    Unsafe unsafe2 = gq.a;
                    long j2 = hj4.N;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.I;
                    if (intVolatile2 <= i) {
                        o53Var = this;
                        break;
                    }
                    o53 o53Var2 = this;
                    o53Var = o53Var2;
                    if (unsafe2.compareAndSwapInt(o53Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = o53Var;
                }
            } else {
                o53Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(o53Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(o53Var, R, (Object) null);
                    return true;
                }
            }
            this = o53Var;
        }
    }

    @Override // defpackage.m53
    public final void g(Object obj) {
        while (this.d()) {
            Unsafe unsafe = gq.a;
            long j = R;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ep epVar = i42.j;
            if (objectVolatile != epVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    o53 o53Var = this;
                    if (gq.a.compareAndSwapObject(o53Var, R, objectVolatile, epVar)) {
                        o53Var.c();
                        return;
                    } else {
                        if (gq.a.getObjectVolatile(o53Var, j) != objectVolatile) {
                            this = o53Var;
                            break;
                        }
                        this = o53Var;
                    }
                }
            }
        }
        zy.i("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + o7.y(this) + "[isLocked=" + d() + ",owner=" + gq.a.getObjectVolatile(this, R) + ']';
    }
}
