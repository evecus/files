package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pu2 implements yq3 {
    public final uu2 I;
    public z22 J;
    public da2 K;
    public z22 L;
    public r22 M;

    public pu2(uu2 uu2Var) {
        this.I = uu2Var;
    }

    @Override // defpackage.yq3
    public final long e(v22 v22Var, long j, da2 da2Var, long j2) {
        r22 r22Var = this.M;
        if (r22Var != null) {
            z22 z22Var = this.J;
            if ((z22Var == null ? false : z22.b(z22Var.a, j)) && this.K == da2Var) {
                z22 z22Var2 = this.L;
                if (z22Var2 != null ? z22.b(z22Var2.a, j2) : false) {
                    return r22Var.a;
                }
            }
        }
        long e = this.I.e(v22Var, j, da2Var, j2);
        this.J = new z22(j);
        this.K = da2Var;
        this.L = new z22(j2);
        this.M = new r22(e);
        return e;
    }
}
