package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ev4 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ k80 J;
    public final /* synthetic */ cw4 K;

    public /* synthetic */ ev4(k80 k80Var, cw4 cw4Var, byte b) {
        this.I = b;
        this.J = k80Var;
        this.K = cw4Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        cw4 cw4Var = this.K;
        k80 k80Var = this.J;
        switch (b) {
            case 0:
                return new x70(qb.T(k80Var.a, k80Var.d, ((Number) cw4Var.getValue()).floatValue()));
            case 1:
                return new x70(qb.T(k80Var.s, k80Var.d, ((Number) cw4Var.getValue()).floatValue()));
            default:
                return new x70(qb.T(k80Var.q, k80Var.d, ((Number) cw4Var.getValue()).floatValue()));
        }
    }
}
