package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hi5 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ ii5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi5(ii5 ii5Var, byte b) {
        super(1);
        this.J = b;
        this.K = ii5Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        long j;
        byte b = this.J;
        ii5 ii5Var = this.K;
        switch (b) {
            case 0:
                z95 z95Var = (z95) obj;
                aa1 aa1Var = aa1.I;
                aa1 aa1Var2 = aa1.J;
                if (z95Var.c(aa1Var, aa1Var2)) {
                    da5 da5Var = ii5Var.J.a;
                    return ma1.c;
                }
                if (!z95Var.c(aa1Var2, aa1.K)) {
                    return ma1.c;
                }
                da5 da5Var2 = ii5Var.K.a;
                return ma1.c;
            default:
                int ordinal = ((aa1) obj).ordinal();
                if (ordinal == 0) {
                    da5 da5Var3 = ii5Var.J.a;
                    j = x70.f;
                } else if (ordinal == 1) {
                    da5 da5Var4 = ii5Var.J.a;
                    da5 da5Var5 = ii5Var.K.a;
                    j = x70.f;
                } else {
                    if (ordinal != 2) {
                        s83.v();
                        return null;
                    }
                    da5 da5Var6 = ii5Var.K.a;
                    j = ii5Var.L.e;
                }
                return new x70(j);
        }
    }
}
