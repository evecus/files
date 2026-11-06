package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ra1 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ sa1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra1(sa1 sa1Var, byte b) {
        super(1);
        this.J = b;
        this.K = sa1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        ve1 ve1Var;
        ve1 ve1Var2;
        byte b = this.J;
        aa1 aa1Var = aa1.K;
        aa1 aa1Var2 = aa1.J;
        aa1 aa1Var3 = aa1.I;
        sa1 sa1Var = this.K;
        switch (b) {
            case 0:
                z95 z95Var = (z95) obj;
                boolean c = z95Var.c(aa1Var3, aa1Var2);
                Object obj2 = null;
                if (c) {
                    i20 i20Var = sa1Var.M.a.c;
                    if (i20Var != null) {
                        obj2 = i20Var.c;
                    }
                } else if (z95Var.c(aa1Var2, aa1Var)) {
                    i20 i20Var2 = sa1Var.N.a.c;
                    if (i20Var2 != null) {
                        obj2 = i20Var2.c;
                    }
                } else {
                    obj2 = ma1.e;
                }
                return obj2 == null ? ma1.e : obj2;
            default:
                z95 z95Var2 = (z95) obj;
                if (z95Var2.c(aa1Var3, aa1Var2)) {
                    xq4 xq4Var = sa1Var.M.a.b;
                    return (xq4Var == null || (ve1Var2 = xq4Var.b) == null) ? ma1.d : ve1Var2;
                }
                if (!z95Var2.c(aa1Var2, aa1Var)) {
                    return ma1.d;
                }
                xq4 xq4Var2 = sa1Var.N.a.b;
                return (xq4Var2 == null || (ve1Var = xq4Var2.b) == null) ? ma1.d : ve1Var;
        }
    }
}
