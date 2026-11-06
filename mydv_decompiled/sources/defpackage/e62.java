package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class e62 implements v52 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater I = AtomicReferenceFieldUpdater.newUpdater(e62.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long J;
    public static final /* synthetic */ long K;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = gq.a;
        K = unsafe.objectFieldOffset(e62.class.getDeclaredField("_state$volatile"));
        J = unsafe.objectFieldOffset(e62.class.getDeclaredField("_parentHandle$volatile"));
    }

    public e62(boolean z) {
        this._state$volatile = z ? p70.w : p70.v;
    }

    public static d60 V(ar2 ar2Var) {
        while (ar2Var.i()) {
            ar2Var = ar2Var.h();
        }
        while (true) {
            ar2Var = ar2Var.g();
            if (!ar2Var.i()) {
                if (ar2Var instanceof d60) {
                    return (d60) ar2Var;
                }
                if (ar2Var instanceof pa3) {
                    return null;
                }
            }
        }
    }

    public static String c0(Object obj) {
        if (!(obj instanceof c62)) {
            return obj instanceof wy1 ? ((wy1) obj).isActive() ? "Active" : "New" : obj instanceof ub0 ? "Cancelled" : "Completed";
        }
        c62 c62Var = (c62) obj;
        return c62Var.d() ? "Cancelling" : c62Var.e() ? "Completing" : "Active";
    }

    public final Throwable B(c62 c62Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c62Var.d()) {
                return new w52(u(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof v75) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof v75)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean C() {
        return true;
    }

    public boolean D() {
        return this instanceof qb0;
    }

    public final pa3 G(wy1 wy1Var) {
        pa3 b = wy1Var.b();
        if (b != null) {
            return b;
        }
        if (wy1Var instanceof i91) {
            return new pa3();
        }
        if (wy1Var instanceof y52) {
            a0((y52) wy1Var);
            return null;
        }
        zy.h(wy1Var, "State should have list: ");
        return null;
    }

    public final Object H() {
        return gq.a.getObjectVolatile(this, K);
    }

    public boolean I(Throwable th) {
        return false;
    }

    public final void K(v52 v52Var) {
        long j = J;
        ua3 ua3Var = ua3.I;
        if (v52Var == null) {
            gq.a.putObjectVolatile(this, j, ua3Var);
            return;
        }
        v52Var.start();
        c60 n = v52Var.n(this);
        Unsafe unsafe = gq.a;
        unsafe.putObjectVolatile(this, j, n);
        if (N()) {
            n.dispose();
            unsafe.putObjectVolatile(this, j, ua3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [vy1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cy0 L(boolean r7, defpackage.y52 r8) {
        /*
            r6 = this;
            r8.L = r6
        L2:
            java.lang.Object r4 = r6.H()
            boolean r0 = r4 instanceof defpackage.i91
            if (r0 == 0) goto L3f
            r0 = r4
            i91 r0 = (defpackage.i91) r0
            boolean r1 = r0.I
            if (r1 == 0) goto L2b
        L11:
            sun.misc.Unsafe r0 = defpackage.gq.a
            long r2 = defpackage.e62.K
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r8 = r1
            if (r6 == 0) goto L20
            goto L80
        L20:
            java.lang.Object r6 = r0.getObjectVolatile(r8, r2)
            if (r6 == r4) goto L28
            goto L81
        L28:
            r6 = r8
            r8 = r5
            goto L11
        L2b:
            r5 = r8
            r8 = r6
            pa3 r6 = new pa3
            r6.<init>()
            if (r1 == 0) goto L35
            goto L3b
        L35:
            vy1 r1 = new vy1
            r1.<init>(r6)
            r6 = r1
        L3b:
            defpackage.jp0.x(r8, r0, r6)
            goto L81
        L3f:
            r5 = r8
            r8 = r6
            boolean r6 = r4 instanceof defpackage.wy1
            ua3 r0 = defpackage.ua3.I
            r1 = 0
            if (r6 == 0) goto L85
            r6 = r4
            wy1 r6 = (defpackage.wy1) r6
            pa3 r2 = r6.b()
            if (r2 != 0) goto L57
            y52 r4 = (defpackage.y52) r4
            r8.a0(r4)
            goto L81
        L57:
            boolean r3 = r5.k()
            if (r3 == 0) goto L79
            boolean r3 = r6 instanceof defpackage.c62
            if (r3 == 0) goto L64
            c62 r6 = (defpackage.c62) r6
            goto L65
        L64:
            r6 = r1
        L65:
            if (r6 == 0) goto L6b
            java.lang.Throwable r1 = r6.c()
        L6b:
            if (r1 != 0) goto L73
            r6 = 5
            boolean r6 = r2.c(r5, r6)
            goto L7e
        L73:
            if (r7 == 0) goto L9a
            r5.l(r1)
            return r0
        L79:
            r6 = 1
            boolean r6 = r2.c(r5, r6)
        L7e:
            if (r6 == 0) goto L81
        L80:
            return r5
        L81:
            r6 = r8
            r8 = r5
            goto L2
        L85:
            if (r7 == 0) goto L9a
            java.lang.Object r6 = r8.H()
            boolean r7 = r6 instanceof defpackage.ub0
            if (r7 == 0) goto L92
            ub0 r6 = (defpackage.ub0) r6
            goto L93
        L92:
            r6 = r1
        L93:
            if (r6 == 0) goto L97
            java.lang.Throwable r1 = r6.a
        L97:
            r5.l(r1)
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e62.L(boolean, y52):cy0");
    }

    public Object M(fj0 fj0Var) {
        return p((gj0) fj0Var);
    }

    public final boolean N() {
        return !(H() instanceof wy1);
    }

    public boolean P() {
        return this instanceof mw;
    }

    @Override // defpackage.v52
    public final cy0 Q(tm1 tm1Var) {
        return L(true, new g52(tm1Var));
    }

    @Override // defpackage.v52
    public final cy0 R(boolean z, boolean z2, sd sdVar) {
        return L(z2, z ? new f52(sdVar) : new g52(sdVar));
    }

    public final boolean S(Object obj) {
        Object d0;
        do {
            d0 = d0(H(), obj);
            if (d0 == p70.q) {
                return false;
            }
            if (d0 == p70.r) {
                return true;
            }
        } while (d0 == p70.s);
        m(d0);
        return true;
    }

    public final Object T(Object obj) {
        Object d0;
        do {
            d0 = d0(H(), obj);
            if (d0 == p70.q) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ub0 ub0Var = obj instanceof ub0 ? (ub0) obj : null;
                throw new IllegalStateException(str, ub0Var != null ? ub0Var.a : null);
            }
        } while (d0 == p70.s);
        return d0;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.v52
    public final Object W(gj0 gj0Var) {
        Object H;
        wd5 wd5Var;
        do {
            H = H();
            boolean z = H instanceof wy1;
            wd5Var = wd5.a;
            if (!z) {
                vt0.p(gj0Var.getContext());
                return wd5Var;
            }
        } while (b0(H) < 0);
        k10 k10Var = new k10(1, mu0.G(gj0Var));
        k10Var.t();
        k10Var.w(new e10(vt0.D(this, new k54(k10Var)), (byte) 1));
        Object r = k10Var.r();
        el0 el0Var = el0.I;
        if (r != el0Var) {
            r = wd5Var;
        }
        return r == el0Var ? r : wd5Var;
    }

    public final void X(pa3 pa3Var, Throwable th) {
        pa3Var.c(new nk2(4), 4);
        Object f = pa3Var.f();
        f.getClass();
        vb0 vb0Var = null;
        for (ar2 ar2Var = (ar2) f; !ar2Var.equals(pa3Var); ar2Var = ar2Var.g()) {
            if ((ar2Var instanceof y52) && ((y52) ar2Var).k()) {
                try {
                    ((y52) ar2Var).l(th);
                } catch (Throwable th2) {
                    if (vb0Var != null) {
                        sv2.i(vb0Var, th2);
                    } else {
                        vb0Var = new vb0("Exception in completion handler " + ar2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (vb0Var != null) {
            J(vb0Var);
        }
        s(th);
    }

    public final void a0(y52 y52Var) {
        y52 y52Var2;
        e62 e62Var;
        pa3 pa3Var = new pa3();
        Unsafe unsafe = gq.a;
        unsafe.putObjectVolatile(pa3Var, ar2.J, y52Var);
        long j = ar2.I;
        unsafe.putObjectVolatile(pa3Var, j, y52Var);
        loop0: while (true) {
            if (y52Var.f() != y52Var) {
                y52Var2 = y52Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = gq.a;
                y52Var2 = y52Var;
                if (unsafe2.compareAndSwapObject(y52Var2, ar2.I, y52Var, pa3Var)) {
                    pa3Var.e(y52Var2);
                    break loop0;
                }
                e62Var = this;
                y52Var = y52Var2;
                if (unsafe2.getObjectVolatile(y52Var2, j) != y52Var2) {
                    break;
                } else {
                    this = e62Var;
                }
            }
            this = e62Var;
        }
        ar2 g = y52Var2.g();
        while (true) {
            Unsafe unsafe3 = gq.a;
            long j2 = K;
            e62 e62Var2 = this;
            if (unsafe3.compareAndSwapObject(e62Var2, j2, y52Var2, g) || unsafe3.getObjectVolatile(e62Var2, j2) != y52Var2) {
                return;
            } else {
                this = e62Var2;
            }
        }
    }

    public final int b0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof i91;
        long j = K;
        if (z) {
            if (((i91) obj).I) {
                return 0;
            }
            i91 i91Var = p70.w;
            do {
                unsafe2 = gq.a;
                if (unsafe2.compareAndSwapObject(this, K, obj, i91Var)) {
                    Z();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof vy1)) {
            return 0;
        }
        pa3 pa3Var = ((vy1) obj).I;
        do {
            unsafe = gq.a;
            if (unsafe.compareAndSwapObject(this, K, obj, pa3Var)) {
                Z();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object d0(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof wy1)) {
            return p70.q;
        }
        if ((!(obj instanceof i91) && !(obj instanceof y52)) || (obj instanceof d60) || (obj2 instanceof ub0)) {
            e62 e62Var = this;
            wy1 wy1Var = (wy1) obj;
            pa3 G = e62Var.G(wy1Var);
            if (G == null) {
                return p70.s;
            }
            c62 c62Var = wy1Var instanceof c62 ? (c62) wy1Var : null;
            if (c62Var == null) {
                c62Var = new c62(G, null);
            }
            c62 c62Var2 = c62Var;
            synchronized (c62Var2) {
                if (c62Var2.e()) {
                    return p70.q;
                }
                gq.a.putIntVolatile(c62Var2, c62.K, 1);
                if (c62Var2 != wy1Var) {
                    do {
                        unsafe = gq.a;
                        j = K;
                        e62 e62Var2 = e62Var;
                        e62Var = e62Var2;
                        if (unsafe.compareAndSwapObject(e62Var2, j, wy1Var, c62Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(e62Var, j) == wy1Var);
                    return p70.s;
                }
                boolean d = c62Var2.d();
                ub0 ub0Var = obj2 instanceof ub0 ? (ub0) obj2 : null;
                if (ub0Var != null) {
                    c62Var2.a(ub0Var.a);
                }
                Throwable c = d ? null : c62Var2.c();
                if (c != null) {
                    e62Var.X(G, c);
                }
                d60 V = V(G);
                if (V != null && e62Var.e0(c62Var2, V, obj2)) {
                    return p70.r;
                }
                G.c(new nk2(2), 2);
                d60 V2 = V(G);
                return (V2 == null || !e62Var.e0(c62Var2, V2, obj2)) ? e62Var.y(c62Var2, obj2) : p70.r;
            }
        }
        wy1 wy1Var2 = (wy1) obj;
        Object zy1Var = obj2 instanceof wy1 ? new zy1((wy1) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = gq.a;
            long j2 = K;
            e62 e62Var3 = this;
            if (unsafe2.compareAndSwapObject(e62Var3, j2, wy1Var2, zy1Var)) {
                e62Var3.Y(obj2);
                e62Var3.w(wy1Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(e62Var3, j2) != wy1Var2) {
                return p70.s;
            }
            this = e62Var3;
        }
    }

    @Override // defpackage.v52, defpackage.k20
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new w52(u(), null, this);
        }
        r(cancellationException);
    }

    public final boolean e0(c62 c62Var, d60 d60Var, Object obj) {
        while (d60Var.M.L(false, new b62(this, c62Var, d60Var, obj)) == ua3.I) {
            d60Var = V(d60Var);
            if (d60Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        return p70.Q(this, obj, hn1Var);
    }

    public Object g() {
        return z();
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        return p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        return q8.r0;
    }

    @Override // defpackage.v52
    public boolean isActive() {
        Object H = H();
        return (H instanceof wy1) && ((wy1) H).isActive();
    }

    @Override // defpackage.v52
    public final boolean isCancelled() {
        Object H = H();
        if (H instanceof ub0) {
            return true;
        }
        return (H instanceof c62) && ((c62) H).d();
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [vy1] */
    @Override // defpackage.v52
    public final c60 n(e62 e62Var) {
        e62 e62Var2;
        d60 d60Var = new d60(e62Var);
        d60Var.L = this;
        loop0: while (true) {
            Object H = this.H();
            if (H instanceof i91) {
                i91 i91Var = (i91) H;
                boolean z = i91Var.I;
                if (z) {
                    while (true) {
                        Unsafe unsafe = gq.a;
                        long j = K;
                        e62Var2 = this;
                        if (unsafe.compareAndSwapObject(e62Var2, j, H, d60Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(e62Var2, j) != H) {
                            break;
                        }
                        this = e62Var2;
                    }
                } else {
                    e62Var2 = this;
                    pa3 pa3Var = new pa3();
                    if (!z) {
                        pa3Var = new vy1(pa3Var);
                    }
                    jp0.x(e62Var2, i91Var, pa3Var);
                }
                this = e62Var2;
            } else {
                e62Var2 = this;
                boolean z2 = H instanceof wy1;
                ua3 ua3Var = ua3.I;
                if (!z2) {
                    Object H2 = e62Var2.H();
                    ub0 ub0Var = H2 instanceof ub0 ? (ub0) H2 : null;
                    d60Var.l(ub0Var != null ? ub0Var.a : null);
                    return ua3Var;
                }
                pa3 b = ((wy1) H).b();
                if (b == null) {
                    e62Var2.a0((y52) H);
                    this = e62Var2;
                } else if (!b.c(d60Var, 7)) {
                    boolean c = b.c(d60Var, 3);
                    Object H3 = e62Var2.H();
                    if (H3 instanceof c62) {
                        r0 = ((c62) H3).c();
                    } else {
                        ub0 ub0Var2 = H3 instanceof ub0 ? (ub0) H3 : null;
                        if (ub0Var2 != null) {
                            r0 = ub0Var2.a;
                        }
                    }
                    d60Var.l(r0);
                    if (c) {
                        break loop0;
                    }
                    return ua3Var;
                }
            }
        }
        return d60Var;
    }

    public void o(Object obj) {
        m(obj);
    }

    public final Object p(gj0 gj0Var) {
        Object H;
        do {
            H = H();
            if (!(H instanceof wy1)) {
                if (H instanceof ub0) {
                    throw ((ub0) H).a;
                }
                return p70.B0(H);
            }
        } while (b0(H) < 0);
        a62 a62Var = new a62(mu0.G(gj0Var), this);
        a62Var.t();
        a62Var.w(new e10(vt0.D(this, new j54(a62Var)), (byte) 1));
        return a62Var.r();
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == defpackage.p70.r) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e62.q(java.lang.Object):boolean");
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final boolean s(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        c60 c60Var = (c60) gq.a.getObjectVolatile(this, J);
        return (c60Var == null || c60Var == ua3.I) ? z : c60Var.a(th) || z;
    }

    @Override // defpackage.v52
    public final boolean start() {
        int b0;
        do {
            b0 = b0(H());
            if (b0 == 0) {
                return false;
            }
        } while (b0 != 1);
        return true;
    }

    @Override // defpackage.v52
    public final CancellationException t() {
        CancellationException cancellationException;
        Object H = H();
        if (H instanceof c62) {
            Throwable c = ((c62) H).c();
            if (c == null) {
                zy.h(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new w52(concat, c, this) : cancellationException;
        }
        if (H instanceof wy1) {
            zy.h(this, "Job is still new or active: ");
            return null;
        }
        if (!(H instanceof ub0)) {
            return new w52(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((ub0) H).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new w52(u(), th, this) : cancellationException;
    }

    public final String toString() {
        return (U() + '{' + c0(H()) + '}') + '@' + o7.y(this);
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && C();
    }

    public final void w(wy1 wy1Var, Object obj) {
        Unsafe unsafe = gq.a;
        long j = J;
        c60 c60Var = (c60) unsafe.getObjectVolatile(this, j);
        if (c60Var != null) {
            c60Var.dispose();
            unsafe.putObjectVolatile(this, j, ua3.I);
        }
        vb0 vb0Var = null;
        ub0 ub0Var = obj instanceof ub0 ? (ub0) obj : null;
        Throwable th = ub0Var != null ? ub0Var.a : null;
        if (wy1Var instanceof y52) {
            try {
                ((y52) wy1Var).l(th);
                return;
            } catch (Throwable th2) {
                J(new vb0("Exception in completion handler " + wy1Var + " for " + this, th2));
                return;
            }
        }
        pa3 b = wy1Var.b();
        if (b != null) {
            b.c(new nk2(1), 1);
            Object f = b.f();
            f.getClass();
            for (ar2 ar2Var = (ar2) f; !ar2Var.equals(b); ar2Var = ar2Var.g()) {
                if (ar2Var instanceof y52) {
                    try {
                        ((y52) ar2Var).l(th);
                    } catch (Throwable th3) {
                        if (vb0Var != null) {
                            sv2.i(vb0Var, th3);
                        } else {
                            vb0Var = new vb0("Exception in completion handler " + ar2Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (vb0Var != null) {
                J(vb0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable x(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        e62 e62Var = (e62) obj;
        Object H = e62Var.H();
        if (H instanceof c62) {
            cancellationException = ((c62) H).c();
        } else if (H instanceof ub0) {
            cancellationException = ((ub0) H).a;
        } else {
            if (H instanceof wy1) {
                zy.h(H, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new w52("Parent job is ".concat(c0(H)), cancellationException, e62Var) : cancellationException2;
    }

    public final Object y(c62 c62Var, Object obj) {
        c62 c62Var2;
        Throwable th;
        Throwable B;
        e62 e62Var;
        c62 c62Var3;
        ub0 ub0Var = obj instanceof ub0 ? (ub0) obj : null;
        Throwable th2 = ub0Var != null ? ub0Var.a : null;
        synchronized (c62Var) {
            try {
                c62Var.d();
                ArrayList f = c62Var.f(th2);
                B = B(c62Var, f);
                if (B != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            int size = f.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = f.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != B && th3 != B && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    sv2.i(B, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c62Var2 = c62Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                c62Var2 = c62Var;
                th = th5;
            }
        }
        if (B != null && B != th2) {
            obj = new ub0(B, false);
        }
        if (B != null && (s(B) || I(B))) {
            obj.getClass();
            gq.a.compareAndSwapInt((ub0) obj, ub0.b, 0, 1);
        }
        Y(obj);
        Object zy1Var = obj instanceof wy1 ? new zy1((wy1) obj) : obj;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = K;
            e62Var = this;
            c62Var3 = c62Var;
            if (!unsafe.compareAndSwapObject(e62Var, j, c62Var3, zy1Var) && unsafe.getObjectVolatile(e62Var, j) == c62Var3) {
                this = e62Var;
                c62Var = c62Var3;
            }
        }
        e62Var.w(c62Var3, obj);
        return obj;
    }

    public final Object z() {
        Object H = H();
        if (H instanceof wy1) {
            zy.i("This job has not completed yet");
            return null;
        }
        if (H instanceof ub0) {
            throw ((ub0) H).a;
        }
        return p70.B0(H);
    }

    public void Z() {
    }

    public void J(vb0 vb0Var) {
        throw vb0Var;
    }

    public void Y(Object obj) {
    }

    public void m(Object obj) {
    }
}
