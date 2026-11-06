package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class jb1 extends eb1 implements pt0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater M = AtomicReferenceFieldUpdater.newUpdater(jb1.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ long N;
    public static final /* synthetic */ long O;
    public static final /* synthetic */ long P;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = gq.a;
        P = unsafe.objectFieldOffset(jb1.class.getDeclaredField("_queue$volatile"));
        N = unsafe.objectFieldOffset(jb1.class.getDeclaredField("_delayed$volatile"));
        O = unsafe.objectFieldOffset(jb1.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.pt0
    public final void K(long j, k10 k10Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            fb1 fb1Var = new fb1(this, j2 + nanoTime, k10Var);
            l0(nanoTime, fb1Var);
            k10Var.w(new e10(fb1Var, (byte) 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // defpackage.eb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d0() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb1.d0():long");
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        f0(runnable);
    }

    public void f0(Runnable runnable) {
        g0();
        if (!h0(runnable)) {
            ir0.Q.f0(runnable);
            return;
        }
        Thread i0 = i0();
        if (Thread.currentThread() != i0) {
            LockSupport.unpark(i0);
        }
    }

    public final void g0() {
        hb1 hb1Var;
        ib1 ib1Var = (ib1) gq.a.getObjectVolatile(this, N);
        if (ib1Var == null || ib1Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (ib1Var) {
                try {
                    hb1[] hb1VarArr = ib1Var.a;
                    hb1Var = null;
                    hb1 hb1Var2 = hb1VarArr != null ? hb1VarArr[0] : null;
                    if (hb1Var2 != null) {
                        if (nanoTime - hb1Var2.I >= 0 ? h0(hb1Var2) : false) {
                            hb1Var = ib1Var.d(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (hb1Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(java.lang.Runnable r10) {
        /*
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.gq.a
            long r6 = defpackage.jb1.P
            java.lang.Object r4 = r0.getObjectVolatile(r9, r6)
            long r2 = defpackage.jb1.O
            int r0 = r0.getIntVolatile(r9, r2)
            r8 = 1
            if (r0 != r8) goto L12
            goto L57
        L12:
            if (r4 != 0) goto L29
        L14:
            sun.misc.Unsafe r0 = defpackage.gq.a
            long r2 = defpackage.jb1.P
            r4 = 0
            r1 = r9
            r5 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L22
            goto L74
        L22:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == 0) goto L14
            goto L0
        L29:
            boolean r0 = r4 instanceof defpackage.dr2
            if (r0 == 0) goto L53
            r0 = r4
            dr2 r0 = (defpackage.dr2) r0
            int r2 = r0.a(r10)
            if (r2 == 0) goto L74
            if (r2 == r8) goto L3c
            r0 = 2
            if (r2 == r0) goto L57
            goto L0
        L3c:
            dr2 r5 = r0.c()
        L40:
            sun.misc.Unsafe r0 = defpackage.gq.a
            long r2 = defpackage.jb1.P
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L4c
            goto L0
        L4c:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L40
            goto L0
        L53:
            ep r0 = defpackage.qb.h
            if (r4 != r0) goto L59
        L57:
            r0 = 0
            return r0
        L59:
            dr2 r5 = new dr2
            r0 = 8
            r5.<init>(r0, r8)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.a(r0)
            r5.a(r10)
        L69:
            sun.misc.Unsafe r0 = defpackage.gq.a
            long r2 = defpackage.jb1.P
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L75
        L74:
            return r8
        L75:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L69
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb1.h0(java.lang.Runnable):boolean");
    }

    public abstract Thread i0();

    public final boolean j0() {
        pp ppVar = this.K;
        if (ppVar != null ? ppVar.isEmpty() : true) {
            Unsafe unsafe = gq.a;
            ib1 ib1Var = (ib1) unsafe.getObjectVolatile(this, N);
            if (ib1Var != null && ib1Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, P);
            if (objectVolatile != null) {
                if (objectVolatile instanceof dr2) {
                    long longVolatile = unsafe.getLongVolatile((dr2) objectVolatile, dr2.h);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == qb.h) {
                }
            }
            return true;
        }
        return false;
    }

    public void k0(long j, hb1 hb1Var) {
        ir0.Q.l0(j, hb1Var);
    }

    public final void l0(long j, hb1 hb1Var) {
        jb1 jb1Var;
        int c;
        Unsafe unsafe;
        Thread i0;
        long j2 = N;
        Unsafe unsafe2 = gq.a;
        if (unsafe2.getIntVolatile(this, O) == 1) {
            jb1Var = this;
            c = 1;
        } else {
            ib1 ib1Var = (ib1) unsafe2.getObjectVolatile(this, j2);
            if (ib1Var == null) {
                ib1 ib1Var2 = new ib1();
                ib1Var2.c = j;
                while (true) {
                    unsafe = gq.a;
                    jb1Var = this;
                    if (!unsafe.compareAndSwapObject(jb1Var, N, (Object) null, ib1Var2) && unsafe.getObjectVolatile(jb1Var, j2) == null) {
                        this = jb1Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(jb1Var, j2);
                objectVolatile.getClass();
                ib1Var = (ib1) objectVolatile;
                unsafe2 = unsafe;
            } else {
                jb1Var = this;
            }
            c = hb1Var.c(j, ib1Var, jb1Var);
        }
        if (c != 0) {
            if (c == 1) {
                jb1Var.k0(j, hb1Var);
                return;
            } else {
                if (c == 2) {
                    return;
                }
                zy.i("unexpected result");
                return;
            }
        }
        ib1 ib1Var3 = (ib1) unsafe2.getObjectVolatile(jb1Var, j2);
        if (ib1Var3 != null) {
            synchronized (ib1Var3) {
                hb1[] hb1VarArr = ib1Var3.a;
                r12 = hb1VarArr != null ? hb1VarArr[0] : null;
            }
        }
        if (r12 != hb1Var || Thread.currentThread() == (i0 = jb1Var.i0())) {
            return;
        }
        LockSupport.unpark(i0);
    }

    @Override // defpackage.eb1
    public void shutdown() {
        hb1 d;
        x65.a.set(null);
        gq.a.putIntVolatile(this, O, 1);
        ep epVar = qb.h;
        while (true) {
            Object objectVolatile = gq.a.getObjectVolatile(this, P);
            if (objectVolatile == null) {
                if (jp0.z(this)) {
                    break;
                }
            } else if (objectVolatile instanceof dr2) {
                ((dr2) objectVolatile).b();
                break;
            } else {
                if (objectVolatile == epVar) {
                    break;
                }
                dr2 dr2Var = new dr2(8, true);
                dr2Var.a((Runnable) objectVolatile);
                if (jp0.A(this, objectVolatile, dr2Var)) {
                    break;
                }
            }
        }
        while (d0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            ib1 ib1Var = (ib1) gq.a.getObjectVolatile(this, N);
            if (ib1Var == null) {
                return;
            }
            synchronized (ib1Var) {
                d = ib1Var.b() > 0 ? ib1Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                k0(nanoTime, d);
            }
        }
    }

    public /* bridge */ cy0 y(long j, Runnable runnable, tk0 tk0Var) {
        return jp0.g(j, runnable, tk0Var);
    }
}
