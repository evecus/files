package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u54 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ v54 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u54(v54 v54Var, byte b) {
        super(1);
        this.J = b;
        this.K = v54Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.J;
        v54 v54Var = this.K;
        switch (b) {
            case 0:
                return Double.valueOf(v54Var.n.b(ut0.p(((Number) obj).doubleValue(), v54Var.e, v54Var.f)));
            default:
                return Double.valueOf(ut0.p(v54Var.k.b(((Number) obj).doubleValue()), v54Var.e, v54Var.f));
        }
    }
}
