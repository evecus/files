package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class hj4 {
    public static final /* synthetic */ AtomicLongFieldUpdater K;
    public static final /* synthetic */ AtomicLongFieldUpdater L;
    public static final /* synthetic */ AtomicIntegerFieldUpdater M;
    public static final /* synthetic */ long N;
    public static final /* synthetic */ long O;
    public static final /* synthetic */ long P;
    public final int I;
    public final ut1 J;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = gq.a;
        O = unsafe.objectFieldOffset(hj4.class.getDeclaredField("head$volatile"));
        K = AtomicLongFieldUpdater.newUpdater(hj4.class, "deqIdx$volatile");
        P = unsafe.objectFieldOffset(hj4.class.getDeclaredField("tail$volatile"));
        L = AtomicLongFieldUpdater.newUpdater(hj4.class, "enqIdx$volatile");
        M = AtomicIntegerFieldUpdater.newUpdater(hj4.class, "_availablePermits$volatile");
        N = unsafe.objectFieldOffset(hj4.class.getDeclaredField("_availablePermits$volatile"));
    }

    public hj4(int i) {
        this.I = i;
        if (i <= 0) {
            s83.h(hf1.u(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            s83.h(hf1.u(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        kj4 kj4Var = new kj4(0L, null, 2);
        this.head$volatile = kj4Var;
        this.tail$volatile = kj4Var;
        this._availablePermits$volatile = i;
        this.J = new ut1(this, (byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.i(r3, r4.J);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gj0 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.hj4.M
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.I
            if (r1 > r2) goto L0
            wd5 r3 = defpackage.wd5.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            fj0 r5 = defpackage.mu0.G(r5)
            k10 r5 = defpackage.mw2.G(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            ut1 r4 = r4.J     // Catch: java.lang.Throwable -> L3f
            r5.i(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.r()
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.A()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj4.a(gj0):java.lang.Object");
    }

    public final boolean b(os5 os5Var) {
        Object F;
        Unsafe unsafe;
        hj4 hj4Var = this;
        Unsafe unsafe2 = gq.a;
        long j = P;
        kj4 kj4Var = (kj4) unsafe2.getObjectVolatile(hj4Var, j);
        long andIncrement = L.getAndIncrement(hj4Var);
        fj4 fj4Var = fj4.I;
        long j2 = andIncrement / jj4.f;
        loop0: while (true) {
            F = qb.F(kj4Var, j2, fj4Var);
            if (oh4.m(F)) {
                break;
            }
            lh4 g = oh4.g(F);
            while (true) {
                lh4 lh4Var = (lh4) gq.a.getObjectVolatile(hj4Var, j);
                if (lh4Var.e >= g.e) {
                    hj4Var = this;
                    break loop0;
                }
                if (!g.j()) {
                    break;
                }
                do {
                    unsafe = gq.a;
                    hj4Var = this;
                    if (unsafe.compareAndSwapObject(hj4Var, P, lh4Var, g)) {
                        if (lh4Var.f()) {
                            lh4Var.e();
                        }
                    }
                } while (unsafe.getObjectVolatile(hj4Var, j) == lh4Var);
                if (g.f()) {
                    g.e();
                }
            }
            hj4Var = this;
        }
        kj4 kj4Var2 = (kj4) oh4.g(F);
        AtomicReferenceArray atomicReferenceArray = kj4Var2.h;
        int i = (int) (andIncrement % jj4.f);
        while (!atomicReferenceArray.compareAndSet(i, null, os5Var)) {
            if (atomicReferenceArray.get(i) != null) {
                ep epVar = jj4.b;
                ep epVar2 = jj4.c;
                while (!atomicReferenceArray.compareAndSet(i, epVar, epVar2)) {
                    if (atomicReferenceArray.get(i) != epVar) {
                        return false;
                    }
                }
                ((i10) os5Var).i(wd5.a, hj4Var.J);
                return true;
            }
        }
        os5Var.b(kj4Var2, i);
        return true;
    }

    public final void c() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object F;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = M.getAndIncrement(this);
            int i2 = this.I;
            if (andIncrement >= i2) {
                do {
                    unsafe = gq.a;
                    j = N;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.I;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = gq.a;
            long j2 = O;
            kj4 kj4Var = (kj4) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = K.getAndIncrement(this);
            long j3 = andIncrement2 / jj4.f;
            gj4 gj4Var = gj4.I;
            while (true) {
                F = qb.F(kj4Var, j3, gj4Var);
                if (oh4.m(F)) {
                    break;
                }
                lh4 g = oh4.g(F);
                while (true) {
                    lh4 lh4Var = (lh4) gq.a.getObjectVolatile(this, j2);
                    if (lh4Var.e >= g.e) {
                        break;
                    }
                    if (!g.j()) {
                        break;
                    }
                    do {
                        unsafe2 = gq.a;
                        if (unsafe2.compareAndSwapObject(this, O, lh4Var, g)) {
                            if (lh4Var.f()) {
                                lh4Var.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == lh4Var);
                    if (g.f()) {
                        g.e();
                    }
                }
            }
            kj4 kj4Var2 = (kj4) oh4.g(F);
            AtomicReferenceArray atomicReferenceArray = kj4Var2.h;
            kj4Var2.b();
            z = false;
            if (kj4Var2.e <= j3) {
                int i3 = (int) (andIncrement2 % jj4.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, jj4.b);
                if (andSet == null) {
                    int i4 = jj4.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == jj4.c) {
                            z = true;
                            break;
                        }
                    }
                    ep epVar = jj4.b;
                    ep epVar2 = jj4.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, epVar, epVar2)) {
                            if (atomicReferenceArray.get(i3) != epVar) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != jj4.e) {
                    if (!(andSet instanceof i10)) {
                        zy.h(andSet, "unexpected: ");
                        return;
                    }
                    i10 i10Var = (i10) andSet;
                    ep a = i10Var.a(wd5.a, this.J);
                    if (a != null) {
                        i10Var.l(a);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
