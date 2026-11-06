package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ij2 extends vk0 implements pt0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater O = AtomicIntegerFieldUpdater.newUpdater(ij2.class, "runningWorkers$volatile");
    public static final /* synthetic */ long P = gq.a.objectFieldOffset(ij2.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ pt0 I;
    public final vk0 J;
    public final int K;
    public final String L;
    public final br2 M;
    public final Object N;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public ij2(vk0 vk0Var, int i, String str) {
        pt0 pt0Var = vk0Var instanceof pt0 ? (pt0) vk0Var : null;
        this.I = pt0Var == null ? jr0.a : pt0Var;
        this.J = vk0Var;
        this.K = i;
        this.L = str;
        this.M = new br2();
        this.N = new Object();
    }

    @Override // defpackage.pt0
    public final void K(long j, k10 k10Var) {
        this.I.K(j, k10Var);
    }

    public final Runnable a0() {
        while (true) {
            Runnable runnable = (Runnable) this.M.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.N) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = O;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.M.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean b0() {
        synchronized (this.N) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = O;
            if (gq.a.getIntVolatile(this, P) >= this.K) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        Runnable a0;
        this.M.a(runnable);
        if (gq.a.getIntVolatile(this, P) >= this.K || !b0() || (a0 = a0()) == null) {
            return;
        }
        try {
            qb.d0(this.J, this, new hj2(this, a0));
        } catch (Throwable th) {
            O.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.vk0
    public final void dispatchYield(tk0 tk0Var, Runnable runnable) {
        Runnable a0;
        this.M.a(runnable);
        if (gq.a.getIntVolatile(this, P) >= this.K || !b0() || (a0 = a0()) == null) {
            return;
        }
        try {
            this.J.dispatchYield(this, new hj2(this, a0));
        } catch (Throwable th) {
            O.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.vk0
    public final vk0 limitedParallelism(int i, String str) {
        ut0.l(i);
        return i >= this.K ? str != null ? new x53(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.vk0
    public final String toString() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append(".limitedParallelism(");
        return hf1.y(sb, this.K, ')');
    }

    @Override // defpackage.pt0
    public final cy0 y(long j, Runnable runnable, tk0 tk0Var) {
        return this.I.y(j, runnable, tk0Var);
    }
}
