package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class iz implements k20 {
    public static final /* synthetic */ AtomicLongFieldUpdater J = AtomicLongFieldUpdater.newUpdater(iz.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater K;
    public static final /* synthetic */ AtomicLongFieldUpdater L;
    public static final /* synthetic */ AtomicLongFieldUpdater M;
    public static final /* synthetic */ AtomicReferenceFieldUpdater N;
    public static final /* synthetic */ AtomicReferenceFieldUpdater O;
    public static final /* synthetic */ AtomicReferenceFieldUpdater P;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Q;
    public static final /* synthetic */ AtomicReferenceFieldUpdater R;
    public static final /* synthetic */ long S;
    public static final /* synthetic */ long T;
    public static final /* synthetic */ long U;
    public static final /* synthetic */ long V;
    public static final /* synthetic */ long W;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ long Z;
    public static final /* synthetic */ long a0;
    public final int I;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = gq.a;
        a0 = unsafe.objectFieldOffset(iz.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        K = AtomicLongFieldUpdater.newUpdater(iz.class, "receivers$volatile");
        Y = unsafe.objectFieldOffset(iz.class.getDeclaredField("receivers$volatile"));
        L = AtomicLongFieldUpdater.newUpdater(iz.class, "bufferEnd$volatile");
        T = unsafe.objectFieldOffset(iz.class.getDeclaredField("bufferEnd$volatile"));
        M = AtomicLongFieldUpdater.newUpdater(iz.class, "completedExpandBuffersAndPauseFlag$volatile");
        W = unsafe.objectFieldOffset(iz.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        N = AtomicReferenceFieldUpdater.newUpdater(iz.class, Object.class, "sendSegment$volatile");
        Z = unsafe.objectFieldOffset(iz.class.getDeclaredField("sendSegment$volatile"));
        O = AtomicReferenceFieldUpdater.newUpdater(iz.class, Object.class, "receiveSegment$volatile");
        X = unsafe.objectFieldOffset(iz.class.getDeclaredField("receiveSegment$volatile"));
        P = AtomicReferenceFieldUpdater.newUpdater(iz.class, Object.class, "bufferEndSegment$volatile");
        U = unsafe.objectFieldOffset(iz.class.getDeclaredField("bufferEndSegment$volatile"));
        Q = AtomicReferenceFieldUpdater.newUpdater(iz.class, Object.class, "_closeCause$volatile");
        S = unsafe.objectFieldOffset(iz.class.getDeclaredField("_closeCause$volatile"));
        R = AtomicReferenceFieldUpdater.newUpdater(iz.class, Object.class, "closeHandler$volatile");
        V = unsafe.objectFieldOffset(iz.class.getDeclaredField("closeHandler$volatile"));
    }

    public iz(int i) {
        this.I = i;
        if (i < 0) {
            s83.h(r7.z("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        c50 c50Var = kz.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = o();
        c50 c50Var2 = new c50(0L, null, this, 3);
        this.sendSegment$volatile = c50Var2;
        this.receiveSegment$volatile = c50Var2;
        if (A()) {
            c50Var2 = kz.a;
            c50Var2.getClass();
        }
        this.bufferEndSegment$volatile = c50Var2;
        this._closeCause$volatile = kz.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object E(defpackage.iz r13, defpackage.gj0 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.gz
            if (r0 == 0) goto L14
            r0 = r14
            gz r0 = (defpackage.gz) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            gz r0 = new gz
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.I
            int r0 = r6.K
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.mu0.V(r14)
            a50 r14 = (defpackage.a50) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r13)
            return r1
        L32:
            defpackage.mu0.V(r14)
            sun.misc.Unsafe r14 = defpackage.gq.a
            long r3 = defpackage.iz.X
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            c50 r14 = (defpackage.c50) r14
        L3f:
            boolean r0 = r13.x()
            if (r0 == 0) goto L4f
            java.lang.Throwable r13 = r13.p()
            y40 r14 = new y40
            r14.<init>(r13)
            return r14
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.iz.K
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.kz.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L6c
            c50 r0 = r13.m(r9, r14)
            if (r0 != 0) goto L6a
            goto L3f
        L6a:
            r8 = r0
            goto L6d
        L6c:
            r8 = r14
        L6d:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.J(r8, r9, r10, r12)
            ep r14 = defpackage.kz.m
            if (r13 == r14) goto La1
            ep r14 = defpackage.kz.o
            if (r13 != r14) goto L8b
            long r13 = r7.t()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r8.b()
        L88:
            r13 = r7
            r14 = r8
            goto L3f
        L8b:
            ep r14 = defpackage.kz.n
            if (r13 != r14) goto L9d
            r6.K = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.F(r2, r3, r4, r6)
            el0 r14 = defpackage.el0.I
            if (r13 != r14) goto L9c
            return r14
        L9c:
            return r13
        L9d:
            r8.b()
            return r13
        La1:
            java.lang.String r13 = "unexpected"
            defpackage.zy.i(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.E(iz, gj0):java.lang.Object");
    }

    public static boolean I(Object obj) {
        if (!(obj instanceof i10)) {
            zy.h(obj, "Unexpected waiter: ");
            return false;
        }
        i10 i10Var = (i10) obj;
        c50 c50Var = kz.a;
        ep a = i10Var.a(wd5.a, null);
        if (a == null) {
            return false;
        }
        i10Var.l(a);
        return true;
    }

    public final boolean A() {
        long o = o();
        return o == 0 || o == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(long r5, defpackage.c50 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.e
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            sf0 r0 = r7.c()
            c50 r0 = (defpackage.c50) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            sf0 r5 = r7.c()
            c50 r5 = (defpackage.c50) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            sun.misc.Unsafe r5 = defpackage.gq.a
            long r0 = defpackage.iz.U
            java.lang.Object r5 = r5.getObjectVolatile(r4, r0)
            lh4 r5 = (defpackage.lh4) r5
            long r0 = r5.e
            long r2 = r7.e
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L35
            goto L4b
        L35:
            boolean r6 = r7.j()
            if (r6 != 0) goto L3c
            goto L11
        L3c:
            boolean r6 = defpackage.pt1.y(r4, r5, r7)
            if (r6 == 0) goto L4c
            boolean r4 = r5.f()
            if (r4 == 0) goto L4b
            r5.e()
        L4b:
            return
        L4c:
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.B(long, c50):void");
    }

    public final Object C(fj0 fj0Var, Object obj) {
        k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        k10Var.resumeWith(new g54(s()));
        Object r = k10Var.r();
        return r == el0.I ? r : wd5.a;
    }

    public final void D(Object obj, k10 k10Var) {
        k10Var.resumeWith(new g54(s()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.c50 r10, int r11, long r12, defpackage.gj0 r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.F(c50, int, long, gj0):java.lang.Object");
    }

    public final void G(os5 os5Var, boolean z) {
        if (os5Var instanceof i10) {
            ((fj0) os5Var).resumeWith(new g54(z ? q() : s()));
            return;
        }
        if (os5Var instanceof v04) {
            ((v04) os5Var).I.resumeWith(new a50(new y40(p())));
            return;
        }
        if (!(os5Var instanceof fz)) {
            zy.h(os5Var, "Unexpected waiter: ");
            return;
        }
        fz fzVar = (fz) os5Var;
        k10 k10Var = fzVar.J;
        k10Var.getClass();
        fzVar.J = null;
        fzVar.I = kz.l;
        Throwable p = fzVar.K.p();
        if (p == null) {
            k10Var.resumeWith(Boolean.FALSE);
        } else {
            k10Var.resumeWith(new g54(p));
        }
    }

    public final boolean H(Object obj, Object obj2) {
        if (obj instanceof v04) {
            k10 k10Var = ((v04) obj).I;
            a50 a50Var = new a50(obj2);
            c50 c50Var = kz.a;
            ep a = k10Var.a(a50Var, null);
            if (a == null) {
                return false;
            }
            k10Var.l(a);
            return true;
        }
        if (!(obj instanceof fz)) {
            if (!(obj instanceof i10)) {
                zy.h(obj, "Unexpected receiver type: ");
                return false;
            }
            i10 i10Var = (i10) obj;
            c50 c50Var2 = kz.a;
            ep a2 = i10Var.a(obj2, null);
            if (a2 == null) {
                return false;
            }
            i10Var.l(a2);
            return true;
        }
        fz fzVar = (fz) obj;
        k10 k10Var2 = fzVar.J;
        k10Var2.getClass();
        fzVar.J = null;
        fzVar.I = obj2;
        Boolean bool = Boolean.TRUE;
        c50 c50Var3 = kz.a;
        ep a3 = k10Var2.a(bool, null);
        if (a3 == null) {
            return false;
        }
        k10Var2.l(a3);
        return true;
    }

    public final Object J(c50 c50Var, int i, long j, Object obj) {
        Object l = c50Var.l(i);
        AtomicReferenceArray atomicReferenceArray = c50Var.i;
        long j2 = a0;
        if (l == null) {
            if (j >= (gq.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return kz.n;
                }
                if (c50Var.k(i, l, obj)) {
                    l();
                    return kz.m;
                }
            }
        } else if (l == kz.d && c50Var.k(i, l, kz.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c50Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = c50Var.l(i);
            if (l2 == null || l2 == kz.e) {
                if (j < (gq.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (c50Var.k(i, l2, kz.h)) {
                        l();
                        return kz.o;
                    }
                } else {
                    if (obj == null) {
                        return kz.n;
                    }
                    if (c50Var.k(i, l2, obj)) {
                        l();
                        return kz.m;
                    }
                }
            } else if (l2 != kz.d) {
                ep epVar = kz.j;
                if (l2 == epVar) {
                    return kz.o;
                }
                if (l2 == kz.h) {
                    return kz.o;
                }
                if (l2 == kz.l) {
                    l();
                    return kz.o;
                }
                if (l2 != kz.g && c50Var.k(i, l2, kz.f)) {
                    boolean z = l2 instanceof ps5;
                    if (z) {
                        l2 = ((ps5) l2).a;
                    }
                    if (I(l2)) {
                        c50Var.o(i, kz.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c50Var.n(i, null);
                        return obj3;
                    }
                    c50Var.o(i, epVar);
                    c50Var.i();
                    if (z) {
                        l();
                    }
                    return kz.o;
                }
            } else if (c50Var.k(i, l2, kz.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c50Var.n(i, null);
                return obj4;
            }
        }
    }

    public final int K(c50 c50Var, int i, Object obj, long j, Object obj2, boolean z) {
        c50Var.n(i, obj);
        if (z) {
            return L(c50Var, i, obj, j, obj2, z);
        }
        Object l = c50Var.l(i);
        if (l == null) {
            if (a(j)) {
                if (c50Var.k(i, null, kz.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c50Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof os5) {
            c50Var.n(i, null);
            if (H(l, obj)) {
                c50Var.o(i, kz.i);
                return 0;
            }
            ep epVar = kz.k;
            if (c50Var.i.getAndSet((i * 2) + 1, epVar) == epVar) {
                return 5;
            }
            c50Var.m(i, true);
            return 5;
        }
        return L(c50Var, i, obj, j, obj2, z);
    }

    public final int L(c50 c50Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = c50Var.l(i);
            if (l == null) {
                if (!a(j) || z) {
                    if (z) {
                        if (c50Var.k(i, null, kz.j)) {
                            c50Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c50Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c50Var.k(i, null, kz.d)) {
                    break;
                }
            } else {
                if (l != kz.e) {
                    ep epVar = kz.k;
                    if (l == epVar) {
                        c50Var.n(i, null);
                        return 5;
                    }
                    if (l == kz.h) {
                        c50Var.n(i, null);
                        return 5;
                    }
                    if (l == kz.l) {
                        c50Var.n(i, null);
                        y();
                        return 4;
                    }
                    c50Var.n(i, null);
                    if (l instanceof ps5) {
                        l = ((ps5) l).a;
                    }
                    if (H(l, obj)) {
                        c50Var.o(i, kz.i);
                        return 0;
                    }
                    if (c50Var.i.getAndSet((i * 2) + 1, epVar) != epVar) {
                        c50Var.m(i, true);
                    }
                    return 5;
                }
                if (c50Var.k(i, l, kz.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void M(long j) {
        iz izVar = this;
        if (izVar.A()) {
            return;
        }
        while (izVar.o() <= j) {
            izVar = this;
        }
        int i = kz.c;
        int i2 = 0;
        while (true) {
            long j2 = W;
            if (i2 < i) {
                long o = izVar.o();
                if (o == (gq.a.getLongVolatile(izVar, j2) & 4611686018427387903L) && o == izVar.o()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = gq.a;
                    long longVolatile = unsafe.getLongVolatile(izVar, j2);
                    if (unsafe.compareAndSwapLong(izVar, W, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        izVar = this;
                    }
                }
                while (true) {
                    long o2 = izVar.o();
                    Unsafe unsafe2 = gq.a;
                    long longVolatile2 = unsafe2.getLongVolatile(izVar, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (o2 == j3 && o2 == izVar.o()) {
                        break;
                    }
                    if (z) {
                        izVar = this;
                    } else {
                        izVar = this;
                        unsafe2.compareAndSwapLong(izVar, W, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = gq.a;
                    long longVolatile3 = unsafe3.getLongVolatile(izVar, j2);
                    if (unsafe3.compareAndSwapLong(izVar, W, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        izVar = this;
                    }
                }
            }
        }
    }

    public final boolean a(long j) {
        return j < o() || j < r() + ((long) this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // defpackage.mj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.fj0 r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.b(fj0, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mj4
    public final boolean c(Throwable th) {
        return g(th, false);
    }

    @Override // defpackage.mj4
    public Object d(Object obj) {
        iz izVar = this;
        Unsafe unsafe = gq.a;
        long j = 1152921504606846975L;
        boolean z = izVar.w(unsafe.getLongVolatile(izVar, a0), false) ? false : !izVar.a(r2 & 1152921504606846975L);
        z40 z40Var = a50.b;
        if (z) {
            return z40Var;
        }
        Object obj2 = kz.j;
        c50 c50Var = (c50) unsafe.getObjectVolatile(izVar, Z);
        while (true) {
            long andIncrement = J.getAndIncrement(izVar);
            long j2 = andIncrement & j;
            boolean w = izVar.w(andIncrement, false);
            int i = kz.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c50Var.e != j4) {
                c50 n = izVar.n(j4, c50Var);
                if (n != null) {
                    c50Var = n;
                } else {
                    if (w) {
                        return new y40(izVar.s());
                    }
                    j = 1152921504606846975L;
                }
            }
            int K2 = izVar.K(c50Var, i2, obj, j2, obj2, w);
            wd5 wd5Var = wd5.a;
            if (K2 == 0) {
                c50Var.b();
                return wd5Var;
            }
            if (K2 == 1) {
                return wd5Var;
            }
            if (K2 == 2) {
                if (w) {
                    c50Var.i();
                    return new y40(s());
                }
                os5 os5Var = obj2 instanceof os5 ? (os5) obj2 : null;
                if (os5Var != null) {
                    os5Var.b(c50Var, i2 + i);
                }
                c50Var.i();
                return z40Var;
            }
            if (K2 == 3) {
                zy.i("unexpected");
                return null;
            }
            if (K2 == 4) {
                if (j2 < r()) {
                    c50Var.b();
                }
                return new y40(s());
            }
            if (K2 == 5) {
                c50Var.b();
            }
            j = 1152921504606846975L;
            izVar = this;
        }
    }

    @Override // defpackage.k20
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    @Override // defpackage.k20
    public final Object f() {
        c50 c50Var;
        Unsafe unsafe = gq.a;
        long longVolatile = unsafe.getLongVolatile(this, Y);
        long longVolatile2 = unsafe.getLongVolatile(this, a0);
        if (w(longVolatile2, true)) {
            return new y40(p());
        }
        long j = longVolatile2 & 1152921504606846975L;
        z40 z40Var = a50.b;
        if (longVolatile >= j) {
            return z40Var;
        }
        Object obj = kz.k;
        c50 c50Var2 = (c50) unsafe.getObjectVolatile(this, X);
        while (!this.x()) {
            long andIncrement = K.getAndIncrement(this);
            long j2 = kz.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (c50Var2.e != j3) {
                c50 m = this.m(j3, c50Var2);
                if (m == null) {
                    continue;
                } else {
                    c50Var = m;
                }
            } else {
                c50Var = c50Var2;
            }
            iz izVar = this;
            Object J2 = izVar.J(c50Var, i, andIncrement, obj);
            c50Var2 = c50Var;
            if (J2 == kz.m) {
                os5 os5Var = obj instanceof os5 ? (os5) obj : null;
                if (os5Var != null) {
                    os5Var.b(c50Var2, i);
                }
                izVar.M(andIncrement);
                c50Var2.i();
                return z40Var;
            }
            if (J2 != kz.o) {
                if (J2 != kz.n) {
                    c50Var2.b();
                    return J2;
                }
                zy.i("unexpected");
                return null;
            }
            if (andIncrement < izVar.t()) {
                c50Var2.b();
            }
            this = izVar;
        }
        return new y40(this.p());
    }

    public final boolean g(Throwable th, boolean z) {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        long j3;
        long longVolatile2;
        Unsafe unsafe3;
        long j4;
        long longVolatile3;
        if (z) {
            do {
                unsafe3 = gq.a;
                j4 = a0;
                longVolatile3 = unsafe3.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                c50 c50Var = kz.a;
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        boolean C = pt1.C(this, kz.s, th);
        if (z) {
            do {
                unsafe2 = gq.a;
                j3 = a0;
                longVolatile2 = unsafe2.getLongVolatile(this, j3);
            } while (!unsafe2.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = gq.a;
                j = a0;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        y();
        if (C) {
            do {
                objectVolatile = gq.a.getObjectVolatile(this, V);
            } while (!pt1.A(this, objectVolatile, objectVolatile == null ? kz.q : kz.r));
            if (objectVolatile != null) {
                p70.A(1, objectVolatile);
                ((tm1) objectVolatile).invoke(p());
            }
        }
        return C;
    }

    @Override // defpackage.k20
    public final Object h(fj0 fj0Var) {
        c50 c50Var;
        Throwable th;
        c50 c50Var2;
        Unsafe unsafe = gq.a;
        long j = X;
        c50 c50Var3 = (c50) unsafe.getObjectVolatile(this, j);
        while (!this.x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = K;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = kz.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (c50Var3.e != j3) {
                c50 m = this.m(j3, c50Var3);
                if (m == null) {
                    continue;
                } else {
                    c50Var = m;
                }
            } else {
                c50Var = c50Var3;
            }
            iz izVar = this;
            Object J2 = izVar.J(c50Var, i, andIncrement, null);
            ep epVar = kz.m;
            if (J2 == epVar) {
                zy.i("unexpected");
                return null;
            }
            ep epVar2 = kz.o;
            if (J2 == epVar2) {
                if (andIncrement < izVar.t()) {
                    c50Var.b();
                }
                this = izVar;
                c50Var3 = c50Var;
            } else {
                if (J2 != kz.n) {
                    c50Var.b();
                    return J2;
                }
                k10 G = mw2.G(mu0.G(fj0Var));
                try {
                    Object J3 = izVar.J(c50Var, i, andIncrement, G);
                    if (J3 == epVar) {
                        G.b(c50Var, i);
                    } else {
                        if (J3 == epVar2) {
                            if (andIncrement < izVar.t()) {
                                c50Var.b();
                            }
                            c50 c50Var4 = (c50) gq.a.getObjectVolatile(izVar, j);
                            while (true) {
                                if (izVar.x()) {
                                    G.resumeWith(new g54(izVar.q()));
                                    break;
                                }
                                k10 k10Var = G;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(izVar);
                                    long j4 = kz.b;
                                    long j5 = andIncrement2 / j4;
                                    int i2 = (int) (andIncrement2 % j4);
                                    if (c50Var4.e != j5) {
                                        try {
                                            c50 m2 = izVar.m(j5, c50Var4);
                                            if (m2 == null) {
                                                G = k10Var;
                                            } else {
                                                c50Var2 = m2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            G = k10Var;
                                            G.A();
                                            throw th;
                                        }
                                    } else {
                                        c50Var2 = c50Var4;
                                    }
                                    iz izVar2 = izVar;
                                    J3 = izVar2.J(c50Var2, i2, andIncrement2, k10Var);
                                    izVar = izVar2;
                                    c50 c50Var5 = c50Var2;
                                    G = k10Var;
                                    if (J3 == kz.m) {
                                        G.b(c50Var5, i2);
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
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    G = k10Var;
                                    th = th;
                                    G.A();
                                    throw th;
                                }
                            }
                        } else {
                            c50Var.b();
                        }
                        G.i(J3, null);
                    }
                    return G.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable q = this.q();
        int i3 = nu4.a;
        throw q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
    
        r0 = (defpackage.c50) ((defpackage.sf0) defpackage.gq.a.getObjectVolatile(r0, defpackage.sf0.d));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c50 i(long r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.i(long):c50");
    }

    @Override // defpackage.k20
    public final fz iterator() {
        return new fz(this);
    }

    public final void j(long j) {
        c50 c50Var = (c50) gq.a.getObjectVolatile(this, X);
        while (true) {
            Unsafe unsafe = gq.a;
            long j2 = Y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.I + longVolatile, this.o())) {
                return;
            }
            iz izVar = this;
            if (unsafe.compareAndSwapLong(izVar, j2, longVolatile, 1 + longVolatile)) {
                long j3 = kz.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (c50Var.e != j4) {
                    c50 m = izVar.m(j4, c50Var);
                    if (m != null) {
                        c50Var = m;
                    }
                }
                c50 c50Var2 = c50Var;
                if (izVar.J(c50Var2, i, longVolatile, null) != kz.o) {
                    c50Var2.b();
                } else if (longVolatile < izVar.t()) {
                    c50Var2.b();
                }
                this = izVar;
                c50Var = c50Var2;
            }
            this = izVar;
        }
    }

    @Override // defpackage.k20
    public final Object k(ia0 ia0Var) {
        return E(this, ia0Var);
    }

    public final void l() {
        long j;
        Object F;
        if (A()) {
            return;
        }
        Unsafe unsafe = gq.a;
        long j2 = U;
        c50 c50Var = (c50) unsafe.getObjectVolatile(this, j2);
        loop0: while (true) {
            long andIncrement = L.getAndIncrement(this);
            long j3 = andIncrement / kz.b;
            if (t() <= andIncrement) {
                if (c50Var.e < j3 && c50Var.c() != null) {
                    B(j3, c50Var);
                }
                u(1L);
                return;
            }
            if (c50Var.e != j3) {
                jz jzVar = jz.I;
                while (true) {
                    F = qb.F(c50Var, j3, jzVar);
                    if (!oh4.m(F)) {
                        lh4 g = oh4.g(F);
                        while (true) {
                            lh4 lh4Var = (lh4) gq.a.getObjectVolatile(this, j2);
                            j = j2;
                            if (lh4Var.e >= g.e) {
                                break;
                            }
                            if (!g.j()) {
                                break;
                            }
                            if (!pt1.z(this, lh4Var, g)) {
                                if (g.f()) {
                                    g.e();
                                }
                                j2 = j;
                            } else if (lh4Var.f()) {
                                lh4Var.e();
                            }
                        }
                    } else {
                        j = j2;
                        break;
                    }
                    j2 = j;
                }
                c50 c50Var2 = null;
                if (oh4.m(F)) {
                    y();
                    B(j3, c50Var);
                    u(1L);
                } else {
                    c50 c50Var3 = (c50) oh4.g(F);
                    long j4 = c50Var3.e;
                    if (j4 > j3) {
                        long j5 = kz.b * j4;
                        if (gq.a.compareAndSwapLong(this, T, 1 + andIncrement, j5)) {
                            u(j5 - andIncrement);
                        } else {
                            u(1L);
                        }
                    } else {
                        c50Var2 = c50Var3;
                    }
                }
                if (c50Var2 == null) {
                    continue;
                    j2 = j;
                } else {
                    c50Var = c50Var2;
                }
            } else {
                j = j2;
            }
            int i = (int) (andIncrement % kz.b);
            Object l = c50Var.l(i);
            boolean z = l instanceof os5;
            long j6 = Y;
            if (!z || andIncrement < gq.a.getLongVolatile(this, j6) || !c50Var.k(i, l, kz.g)) {
                while (true) {
                    Object l2 = c50Var.l(i);
                    if (!(l2 instanceof os5)) {
                        if (l2 != kz.j) {
                            if (l2 != null) {
                                if (l2 == kz.d || l2 == kz.h || l2 == kz.i || l2 == kz.k || l2 == kz.l) {
                                    break loop0;
                                } else if (l2 != kz.f) {
                                    zy.h(l2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (c50Var.k(i, l2, kz.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < gq.a.getLongVolatile(this, j6)) {
                        if (c50Var.k(i, l2, new ps5((os5) l2))) {
                            break loop0;
                        }
                    } else if (c50Var.k(i, l2, kz.g)) {
                        if (I(l2)) {
                            c50Var.o(i, kz.d);
                            break;
                        } else {
                            c50Var.o(i, kz.j);
                            c50Var.i();
                        }
                    }
                }
                u(1L);
            } else if (I(l)) {
                c50Var.o(i, kz.d);
                break;
            } else {
                c50Var.o(i, kz.j);
                c50Var.i();
                u(1L);
            }
            j2 = j;
        }
        u(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.f() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c50 m(long r16, defpackage.c50 r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.m(long, c50):c50");
    }

    public final c50 n(long j, c50 c50Var) {
        Object F;
        c50 c50Var2;
        long j2;
        Unsafe unsafe;
        iz izVar = this;
        c50 c50Var3 = kz.a;
        jz jzVar = jz.I;
        loop0: while (true) {
            F = qb.F(c50Var, j, jzVar);
            if (!oh4.m(F)) {
                lh4 g = oh4.g(F);
                while (true) {
                    Unsafe unsafe2 = gq.a;
                    long j3 = Z;
                    lh4 lh4Var = (lh4) unsafe2.getObjectVolatile(izVar, j3);
                    if (lh4Var.e >= g.e) {
                        break loop0;
                    }
                    if (!g.j()) {
                        break;
                    }
                    do {
                        unsafe = gq.a;
                        if (unsafe.compareAndSwapObject(izVar, Z, lh4Var, g)) {
                            if (lh4Var.f()) {
                                lh4Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(izVar, j3) == lh4Var);
                    if (g.f()) {
                        g.e();
                    }
                }
            } else {
                break;
            }
        }
        c50 c50Var4 = null;
        if (oh4.m(F)) {
            izVar.y();
            if (c50Var.e * kz.b >= izVar.r()) {
                return null;
            }
            c50Var.b();
            return null;
        }
        c50 c50Var5 = (c50) oh4.g(F);
        long j4 = c50Var5.e;
        if (j4 <= j) {
            return c50Var5;
        }
        long j5 = j4 * kz.b;
        while (true) {
            Unsafe unsafe3 = gq.a;
            long j6 = a0;
            long longVolatile = unsafe3.getLongVolatile(izVar, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                c50Var2 = c50Var4;
                j2 = j4;
                break;
            }
            c50Var2 = c50Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(izVar, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            izVar = this;
            c50Var4 = c50Var2;
            j4 = j2;
        }
        if (j2 * kz.b >= r()) {
            return c50Var2;
        }
        c50Var5.b();
        return c50Var2;
    }

    public final long o() {
        return gq.a.getLongVolatile(this, T);
    }

    public final Throwable p() {
        return (Throwable) gq.a.getObjectVolatile(this, S);
    }

    public final Throwable q() {
        Throwable p = p();
        return p == null ? new a70() : p;
    }

    public final long r() {
        return gq.a.getLongVolatile(this, Y);
    }

    public final Throwable s() {
        Throwable p = p();
        return p == null ? new b70() : p;
    }

    public final long t() {
        return gq.a.getLongVolatile(this, a0) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a2, code lost:
    
        r16 = r8;
        r15 = null;
        r3 = (defpackage.c50) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ac, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.toString():java.lang.String");
    }

    public final void u(long j) {
        if ((M.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((gq.a.getLongVolatile(this, W) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a0, code lost:
    
        r12 = (defpackage.c50) ((defpackage.sf0) defpackage.gq.a.getObjectVolatile(r12, defpackage.sf0.d));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(gq.a.getLongVolatile(this, a0), true);
    }

    public final boolean y() {
        return w(gq.a.getLongVolatile(this, a0), false);
    }

    public boolean z() {
        return false;
    }
}
