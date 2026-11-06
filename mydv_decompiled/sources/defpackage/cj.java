package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cj implements cw4 {
    public final ub5 I;
    public final jk3 J;
    public hj K;
    public long L;
    public long M;
    public boolean N;

    public cj(ub5 ub5Var, Object obj, hj hjVar, long j, long j2, boolean z) {
        hj hjVar2;
        this.I = ub5Var;
        this.J = ad4.w(obj);
        if (hjVar != null) {
            hjVar2 = i42.m0(hjVar);
        } else {
            hjVar2 = (hj) ub5Var.a.invoke(obj);
            hjVar2.d();
        }
        this.K = hjVar2;
        this.L = j;
        this.M = j2;
        this.N = z;
    }

    public final Object c() {
        return this.I.b.invoke(this.K);
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return this.J.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.J.getValue() + ", velocity=" + c() + ", isRunning=" + this.N + ", lastFrameTimeNanos=" + this.L + ", finishedTimeNanos=" + this.M + ")";
    }

    public /* synthetic */ cj(ub5 ub5Var, Object obj, hj hjVar, int i) {
        this(ub5Var, obj, (i & 4) != 0 ? null : hjVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
