package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a85 implements dl0 {
    public final /* synthetic */ dl0 I;
    public final AtomicReference J = new AtomicReference(null);
    public final /* synthetic */ hn3 K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ hn1 M;
    public final /* synthetic */ AtomicReference N;

    public a85(dl0 dl0Var, hn3 hn3Var, dl0 dl0Var2, hn1 hn1Var, AtomicReference atomicReference) {
        this.K = hn3Var;
        this.L = dl0Var2;
        this.M = hn1Var;
        this.N = atomicReference;
        this.I = dl0Var;
    }

    public final long a() {
        Long l = (Long) this.J.get();
        if (l == null) {
            return t41.K;
        }
        long longValue = l.longValue();
        this.K.getClass();
        long currentTimeMillis = longValue - System.currentTimeMillis();
        jp jpVar = t41.J;
        return sp0.o0(currentTimeMillis, x41.MILLISECONDS);
    }

    public final void b(long j) {
        if (t41.d(j) <= 0) {
            i42.e0(this.L, new w75("Timed out immediately", this.M.hashCode()));
            return;
        }
        if (t41.c(a(), j) < 0) {
            return;
        }
        this.K.getClass();
        this.J.set(Long.valueOf(t41.d(j) + System.currentTimeMillis()));
        hn3 hn3Var = this.K;
        dl0 dl0Var = this.L;
        v52 v52Var = (v52) this.N.getAndSet(p70.g0(dl0Var, null, null, new n6((Object) this, (Object) hn3Var, (Object) dl0Var, (Object) this.M, (fj0) null, (byte) 17), 3));
        if (v52Var != null) {
            v52Var.e(null);
        }
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.I.getCoroutineContext();
    }
}
