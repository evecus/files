package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bd2 implements jn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tc0 J;

    public /* synthetic */ bd2(tc0 tc0Var, byte b) {
        this.I = b;
        this.J = tc0Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tc0 tc0Var = this.J;
        switch (b) {
            case 0:
                fd2 fd2Var = (fd2) obj;
                ((Integer) obj2).getClass();
                fe0 fe0Var = (fe0) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).g(fd2Var) ? 4 : 2;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 131) != 130)) {
                    go1Var.W();
                    break;
                } else {
                    tc0Var.invoke(fd2Var, go1Var, Integer.valueOf(intValue & 14));
                    break;
                }
            default:
                mg2 mg2Var = (mg2) obj;
                ((Integer) obj2).getClass();
                fe0 fe0Var2 = (fe0) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((go1) fe0Var2).g(mg2Var) ? 4 : 2;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 131) != 130)) {
                    go1Var2.W();
                    break;
                } else {
                    tc0Var.invoke(mg2Var, go1Var2, Integer.valueOf(intValue2 & 14));
                    break;
                }
        }
        return wd5Var;
    }
}
