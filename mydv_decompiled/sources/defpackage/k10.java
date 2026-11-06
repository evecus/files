package defpackage;

import androidx.media3.common.C;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class k10 extends px0 implements i10, fl0, os5 {
    public static final /* synthetic */ long N;
    public static final /* synthetic */ long O;
    public static final /* synthetic */ long P;
    public final fj0 L;
    public final tk0 M;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = gq.a;
        N = unsafe.objectFieldOffset(k10.class.getDeclaredField("_decisionAndIndex$volatile"));
        P = unsafe.objectFieldOffset(k10.class.getDeclaredField("_state$volatile"));
        O = unsafe.objectFieldOffset(k10.class.getDeclaredField("_parentHandle$volatile"));
    }

    public k10(int i, fj0 fj0Var) {
        super(i);
        this.L = fj0Var;
        this.M = fj0Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = e7.a;
    }

    public static Object D(za3 za3Var, Object obj, int i, in1 in1Var) {
        if (obj instanceof ub0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (in1Var != null || (za3Var instanceof f10)) {
            return new sb0(obj, za3Var instanceof f10 ? (f10) za3Var : null, in1Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(za3 za3Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + za3Var + ", already has " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.o();
        r9.j(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            r10 = this;
            fj0 r0 = r10.L
            boolean r1 = r0 instanceof defpackage.nx0
            r2 = 0
            if (r1 == 0) goto Lb
            nx0 r0 = (defpackage.nx0) r0
            r4 = r0
            goto Lc
        Lb:
            r4 = r2
        Lc:
            if (r4 == 0) goto L63
            long r0 = defpackage.nx0.P
        L10:
            sun.misc.Unsafe r3 = defpackage.gq.a
            java.lang.Object r7 = r3.getObjectVolatile(r4, r0)
            r3 = r7
            ep r7 = defpackage.qb.f
            if (r3 != r7) goto L32
        L1b:
            sun.misc.Unsafe r3 = defpackage.gq.a
            long r5 = defpackage.nx0.P
            r8 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r8
            if (r10 == 0) goto L28
            goto L46
        L28:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 == r7) goto L30
            r10 = r9
            goto L10
        L30:
            r10 = r9
            goto L1b
        L32:
            r9 = r10
            boolean r10 = r3 instanceof java.lang.Throwable
            if (r10 == 0) goto L5d
            r7 = r3
        L38:
            sun.misc.Unsafe r3 = defpackage.gq.a
            long r5 = defpackage.nx0.P
            r8 = 0
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L50
            r2 = r7
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L46:
            if (r2 != 0) goto L49
            goto L63
        L49:
            r9.o()
            r9.j(r2)
            return
        L50:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 != r7) goto L57
            goto L38
        L57:
            java.lang.String r10 = "Failed requirement."
            defpackage.s83.t(r10)
            return
        L5d:
            r7 = r3
            java.lang.String r10 = "Inconsistent state "
            defpackage.zy.h(r7, r10)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k10.A():void");
    }

    public final void B(Object obj, int i, in1 in1Var) {
        k10 k10Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = P;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof za3)) {
                k10 k10Var2 = this;
                if (objectVolatile instanceof m10) {
                    m10 m10Var = (m10) objectVolatile;
                    if (unsafe.compareAndSwapInt(m10Var, m10.c, 0, 1)) {
                        if (in1Var != null) {
                            k10Var2.m(in1Var, m10Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                zy.h(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object D = D((za3) objectVolatile, obj, i, in1Var);
            while (true) {
                Unsafe unsafe2 = gq.a;
                k10Var = this;
                if (unsafe2.compareAndSwapObject(k10Var, P, objectVolatile, D)) {
                    if (!k10Var.x()) {
                        k10Var.o();
                    }
                    k10Var.p(i);
                    return;
                } else if (unsafe2.getObjectVolatile(k10Var, j) != objectVolatile) {
                    break;
                } else {
                    this = k10Var;
                }
            }
            this = k10Var;
        }
    }

    public final void C(vk0 vk0Var) {
        fj0 fj0Var = this.L;
        nx0 nx0Var = fj0Var instanceof nx0 ? (nx0) fj0Var : null;
        B(wd5.a, (nx0Var != null ? nx0Var.L : null) == vk0Var ? 4 : this.K, null);
    }

    public final ep E(Object obj, in1 in1Var) {
        k10 k10Var;
        ep epVar = o7.c;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = P;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof za3)) {
                return null;
            }
            Object D = D((za3) objectVolatile, obj, this.K, in1Var);
            while (true) {
                Unsafe unsafe2 = gq.a;
                k10Var = this;
                if (unsafe2.compareAndSwapObject(k10Var, P, objectVolatile, D)) {
                    if (!k10Var.x()) {
                        k10Var.o();
                    }
                    return epVar;
                }
                if (unsafe2.getObjectVolatile(k10Var, j) != objectVolatile) {
                    break;
                }
                this = k10Var;
            }
            this = k10Var;
        }
    }

    @Override // defpackage.i10
    public final ep a(Object obj, in1 in1Var) {
        return E(obj, in1Var);
    }

    @Override // defpackage.os5
    public final void b(lh4 lh4Var, int i) {
        while (true) {
            Unsafe unsafe = gq.a;
            long j = N;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                zy.i("invokeOnCancellation should be called at most once");
                return;
            }
            k10 k10Var = this;
            if (unsafe.compareAndSwapInt(k10Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                k10Var.w(lh4Var);
                return;
            }
            this = k10Var;
        }
    }

    @Override // defpackage.px0
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        k10 k10Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = P;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof za3) {
                zy.i("Not completed");
                return;
            }
            if (objectVolatile instanceof ub0) {
                return;
            }
            if (objectVolatile instanceof sb0) {
                sb0 sb0Var = (sb0) objectVolatile;
                if (sb0Var.e != null) {
                    zy.i("Must be called at most once");
                    return;
                }
                sb0 a = sb0.a(sb0Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = gq.a;
                    k10 k10Var2 = this;
                    if (unsafe2.compareAndSwapObject(k10Var2, P, objectVolatile, a)) {
                        f10 f10Var = sb0Var.b;
                        if (f10Var != null) {
                            k10Var2.k(f10Var, cancellationException);
                        }
                        in1 in1Var = sb0Var.c;
                        if (in1Var != null) {
                            k10Var2.m(in1Var, cancellationException, sb0Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(k10Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        k10Var = k10Var2;
                        break;
                    }
                    this = k10Var2;
                }
            } else {
                k10 k10Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                sb0 sb0Var2 = new sb0(objectVolatile, (f10) null, (in1) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    sb0 sb0Var3 = sb0Var2;
                    Unsafe unsafe3 = gq.a;
                    k10Var = k10Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(k10Var, P, objectVolatile, sb0Var3);
                    sb0Var2 = sb0Var3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(k10Var, j) != objectVolatile) {
                        break;
                    } else {
                        k10Var3 = k10Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = k10Var;
        }
    }

    @Override // defpackage.px0
    public final fj0 d() {
        return this.L;
    }

    @Override // defpackage.px0
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.px0
    public final Object f(Object obj) {
        return obj instanceof sb0 ? ((sb0) obj).a : obj;
    }

    @Override // defpackage.fl0
    public final fl0 getCallerFrame() {
        fj0 fj0Var = this.L;
        if (fj0Var instanceof fl0) {
            return (fl0) fj0Var;
        }
        return null;
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return this.M;
    }

    @Override // defpackage.px0
    public final Object h() {
        return s();
    }

    @Override // defpackage.i10
    public final void i(Object obj, in1 in1Var) {
        B(obj, this.K, in1Var);
    }

    @Override // defpackage.i10
    public final boolean j(Throwable th) {
        Throwable th2;
        k10 k10Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = P;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof za3)) {
                return false;
            }
            boolean z = (objectVolatile instanceof f10) || (objectVolatile instanceof lh4);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            m10 m10Var = new m10(th2, z);
            while (true) {
                Unsafe unsafe2 = gq.a;
                k10Var = this;
                if (unsafe2.compareAndSwapObject(k10Var, P, objectVolatile, m10Var)) {
                    za3 za3Var = (za3) objectVolatile;
                    if (za3Var instanceof f10) {
                        k10Var.k((f10) objectVolatile, th);
                    } else if (za3Var instanceof lh4) {
                        k10Var.n((lh4) objectVolatile, th);
                    }
                    if (!k10Var.x()) {
                        k10Var.o();
                    }
                    k10Var.p(k10Var.K);
                    return true;
                }
                if (unsafe2.getObjectVolatile(k10Var, j) != objectVolatile) {
                    break;
                }
                this = k10Var;
            }
            this = k10Var;
        }
    }

    public final void k(f10 f10Var, Throwable th) {
        try {
            f10Var.a(th);
        } catch (Throwable th2) {
            o7.C(this.M, new vb0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.i10
    public final void l(Object obj) {
        p(this.K);
    }

    public final void m(in1 in1Var, Throwable th, Object obj) {
        tk0 tk0Var = this.M;
        try {
            in1Var.invoke(th, obj, tk0Var);
        } catch (Throwable th2) {
            o7.C(tk0Var, new vb0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(lh4 lh4Var, Throwable th) {
        tk0 tk0Var = this.M;
        int intVolatile = gq.a.getIntVolatile(this, N) & 536870911;
        if (intVolatile == 536870911) {
            zy.i("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            lh4Var.h(intVolatile, tk0Var);
        } catch (Throwable th2) {
            o7.C(tk0Var, new vb0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o() {
        Unsafe unsafe = gq.a;
        long j = O;
        cy0 cy0Var = (cy0) unsafe.getObjectVolatile(this, j);
        if (cy0Var == null) {
            return;
        }
        cy0Var.dispose();
        unsafe.putObjectVolatile(this, j, ua3.I);
    }

    public final void p(int i) {
        while (true) {
            Unsafe unsafe = gq.a;
            long j = N;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    zy.i("Already resumed");
                    return;
                }
                boolean z = i == 4;
                fj0 fj0Var = this.L;
                if (!z && (fj0Var instanceof nx0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.K;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        nx0 nx0Var = (nx0) fj0Var;
                        vk0 vk0Var = nx0Var.L;
                        tk0 context = nx0Var.M.getContext();
                        if (qb.e0(vk0Var, context)) {
                            qb.d0(vk0Var, context, this);
                            return;
                        }
                        eb1 a = x65.a();
                        if (a.I >= 4294967296L) {
                            a.b0(this);
                            return;
                        }
                        a.c0(true);
                        try {
                            ut0.W(this, fj0Var, true);
                            do {
                            } while (a.e0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                ut0.W(this, fj0Var, z);
                return;
            }
            k10 k10Var = this;
            if (unsafe.compareAndSwapInt(k10Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = k10Var;
            }
        }
    }

    public Throwable q(e62 e62Var) {
        return e62Var.t();
    }

    public final Object r() {
        v52 v52Var;
        boolean x = x();
        while (true) {
            Unsafe unsafe = gq.a;
            long j = N;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    zy.i("Already suspended");
                    return null;
                }
                if (x) {
                    this.A();
                }
                Object s = this.s();
                if (s instanceof ub0) {
                    throw ((ub0) s).a;
                }
                int i2 = this.K;
                if ((i2 != 1 && i2 != 2) || (v52Var = (v52) this.M.get(q8.r0)) == null || v52Var.isActive()) {
                    return this.f(s);
                }
                CancellationException t = v52Var.t();
                this.c(t);
                throw t;
            }
            k10 k10Var = this;
            if (unsafe.compareAndSwapInt(k10Var, j, intVolatile, C.BUFFER_FLAG_LAST_SAMPLE + (536870911 & intVolatile))) {
                if (((cy0) unsafe.getObjectVolatile(k10Var, O)) == null) {
                    k10Var.u();
                }
                if (x) {
                    k10Var.A();
                }
                return el0.I;
            }
            this = k10Var;
        }
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        Throwable a = h54.a(obj);
        if (a != null) {
            obj = new ub0(a, false);
        }
        B(obj, this.K, null);
    }

    public final Object s() {
        return gq.a.getObjectVolatile(this, P);
    }

    public final void t() {
        cy0 u = u();
        if (u == null || (s() instanceof za3)) {
            return;
        }
        u.dispose();
        gq.a.putObjectVolatile(this, O, ua3.I);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(z());
        sb.append('(');
        sb.append(o7.R(this.L));
        sb.append("){");
        Object s = s();
        sb.append(s instanceof za3 ? "Active" : s instanceof m10 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(o7.y(this));
        return sb.toString();
    }

    public final cy0 u() {
        v52 v52Var = (v52) this.M.get(q8.r0);
        if (v52Var == null) {
            return null;
        }
        cy0 D = vt0.D(v52Var, new b60(this));
        while (true) {
            Unsafe unsafe = gq.a;
            long j = O;
            k10 k10Var = this;
            if (!unsafe.compareAndSwapObject(k10Var, j, (Object) null, D) && unsafe.getObjectVolatile(k10Var, j) == null) {
                this = k10Var;
            }
        }
        return D;
    }

    public final void v(tm1 tm1Var) {
        w(new e10(tm1Var, (byte) 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        y(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.za3 r11) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k10.w(za3):void");
    }

    public final boolean x() {
        if (this.K == 2) {
            return gq.a.getObjectVolatile((nx0) this.L, nx0.P) != null;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
