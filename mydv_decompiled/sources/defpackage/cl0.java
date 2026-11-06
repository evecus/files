package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cl0 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater P = AtomicLongFieldUpdater.newUpdater(cl0.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Q = AtomicLongFieldUpdater.newUpdater(cl0.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(cl0.class, "_isTerminated$volatile");
    public static final ep S = new ep((Object) "NOT_IN_STACK", (byte) 25);
    public final int I;
    public final int J;
    public final long K;
    public final String L;
    public final wq1 M;
    public final wq1 N;
    public final o44 O;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public cl0(int i, int i2, long j, String str) {
        this.I = i;
        this.J = i2;
        this.K = j;
        this.L = str;
        if (i < 1) {
            s83.h(r7.z("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            s83.h(r7.x(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            s83.h(r7.z("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            s83.m("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.M = new wq1();
        this.N = new wq1();
        this.O = new o44((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void n(cl0 cl0Var, Runnable runnable, int i) {
        cl0Var.g(runnable, false, (i & 4) == 0);
    }

    public final boolean A() {
        cl0 cl0Var;
        ep epVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = P;
            long j = atomicLongFieldUpdater.get(this);
            al0 al0Var = (al0) this.O.b((int) (2097151 & j));
            if (al0Var == null) {
                al0Var = null;
                cl0Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = al0Var.c();
                while (true) {
                    epVar = S;
                    if (c == epVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    al0 al0Var2 = (al0) c;
                    i = al0Var2.b();
                    if (i != 0) {
                        break;
                    }
                    c = al0Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    cl0 cl0Var2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(cl0Var2, j, j2 | i);
                    cl0Var = cl0Var2;
                    if (compareAndSet) {
                        al0Var.g(epVar);
                    }
                    this = cl0Var;
                } else {
                    continue;
                }
            }
            if (al0Var == null) {
                return false;
            }
            if (al0.Q.compareAndSet(al0Var, -1, 0)) {
                LockSupport.unpark(al0Var);
                return true;
            }
            this = cl0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (r1 == null) goto L43;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl0.close():void");
    }

    public final int e() {
        synchronized (this.O) {
            try {
                if (R.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = Q;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.I) {
                    return 0;
                }
                if (i >= this.J) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.O.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                al0 al0Var = new al0(this, i3);
                this.O.c(i3, al0Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                al0Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n(this, runnable, 6);
    }

    public final void g(Runnable runnable, boolean z, boolean z2) {
        b25 d25Var;
        bl0 bl0Var;
        e25.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof b25) {
            d25Var = (b25) runnable;
            d25Var.I = nanoTime;
            d25Var.J = z;
        } else {
            d25Var = new d25(runnable, nanoTime, z);
        }
        boolean z3 = d25Var.J;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Q;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        al0 al0Var = currentThread instanceof al0 ? (al0) currentThread : null;
        if (al0Var == null || al0Var.P != this) {
            al0Var = null;
        }
        if (al0Var != null && (bl0Var = al0Var.K) != bl0.M && (d25Var.J || bl0Var != bl0.J)) {
            al0Var.O = true;
            ey5 ey5Var = al0Var.I;
            if (z2) {
                d25Var = ey5Var.a(d25Var);
            } else {
                ey5Var.getClass();
                b25 b25Var = (b25) gq.a(ey5Var, ey5.g, d25Var);
                d25Var = b25Var == null ? null : ey5Var.a(b25Var);
            }
        }
        if (d25Var != null) {
            if (!(d25Var.J ? this.N.a(d25Var) : this.M.a(d25Var))) {
                throw new RejectedExecutionException(hf1.z(new StringBuilder(), this.L, " was terminated"));
            }
        }
        if (z3) {
            if (A() || y(addAndGet)) {
                return;
            }
            A();
            return;
        }
        if (A() || y(atomicLongFieldUpdater.get(this))) {
            return;
        }
        A();
    }

    public final void t(al0 al0Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = P;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = al0Var.c();
                    while (true) {
                        if (c == S) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        al0 al0Var2 = (al0) c;
                        int b = al0Var2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = al0Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                cl0 cl0Var = this;
                if (atomicLongFieldUpdater.compareAndSet(cl0Var, j, j3)) {
                    return;
                } else {
                    this = cl0Var;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o44 o44Var = this.O;
        int a = o44Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            al0 al0Var = (al0) o44Var.b(i6);
            if (al0Var != null) {
                ey5 ey5Var = al0Var.I;
                ey5Var.getClass();
                Object objectVolatile = gq.a.getObjectVolatile(ey5Var, ey5.g);
                int b = ey5Var.b();
                if (objectVolatile != null) {
                    b++;
                }
                int ordinal = al0Var.K.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        s83.v();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = Q.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.L);
        sb4.append('@');
        sb4.append(o7.y(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.I;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.J);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.M.b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.N.b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean y(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.I;
        if (i < i2) {
            int e = e();
            if (e == 1 && i2 > 1) {
                e();
            }
            if (e > 0) {
                return true;
            }
        }
        return false;
    }
}
