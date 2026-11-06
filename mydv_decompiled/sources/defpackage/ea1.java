package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ea1 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea1(Object obj, Object obj2, byte b) {
        super(1);
        this.J = b;
        this.K = obj;
        this.L = obj2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        ve1 ve1Var;
        ve1 ve1Var2;
        byte b = this.J;
        Object obj2 = this.K;
        Object obj3 = this.L;
        switch (b) {
            case 0:
                z95 z95Var = (z95) obj;
                aa1 aa1Var = aa1.I;
                aa1 aa1Var2 = aa1.J;
                if (z95Var.c(aa1Var, aa1Var2)) {
                    cd1 cd1Var = ((ta1) obj2).a.a;
                    return (cd1Var == null || (ve1Var2 = cd1Var.b) == null) ? ma1.b : ve1Var2;
                }
                if (!z95Var.c(aa1Var2, aa1.K)) {
                    return ma1.b;
                }
                cd1 cd1Var2 = ((bc1) obj3).a.a;
                return (cd1Var2 == null || (ve1Var = cd1Var2.b) == null) ? ma1.b : ve1Var;
            default:
                bn3 bn3Var = (bn3) obj2;
                float f = ((d16) obj3).I;
                ((an3) obj).f(bn3Var);
                bn3Var.d0(r22.c(0L, bn3Var.M), f, null);
                return wd5.a;
        }
    }
}
