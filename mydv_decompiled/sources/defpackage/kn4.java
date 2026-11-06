package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kn4 implements cy0 {
    public final mn4 I;
    public final long J;
    public final Object K;
    public final k10 L;

    public kn4(mn4 mn4Var, long j, Object obj, k10 k10Var) {
        this.I = mn4Var;
        this.J = j;
        this.K = obj;
        this.L = k10Var;
    }

    @Override // defpackage.cy0
    public final void dispose() {
        mn4 mn4Var = this.I;
        synchronized (mn4Var) {
            if (this.J >= mn4Var.n()) {
                Object[] objArr = mn4Var.P;
                objArr.getClass();
                long j = this.J;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    o7.N(objArr, j, o7.s);
                    mn4Var.i();
                }
            }
        }
    }
}
