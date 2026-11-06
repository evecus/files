package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x10 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tc0 J;

    public /* synthetic */ x10(tc0 tc0Var, byte b) {
        this.I = b;
        this.J = tc0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tc0 tc0Var = this.J;
        fe0 fe0Var = (fe0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int intValue = num.intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    ba0 a = z90.a(i42.d, q8.V, go1Var, 0);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, i13.a);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, a);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    tc0Var.invoke(ea0.a, go1Var, 6);
                    go1Var.q(true);
                    break;
                }
            case 1:
                int intValue2 = num.intValue();
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    tc0Var.invoke(ih1.a, go1Var2, 6);
                    break;
                }
            case 2:
                int intValue3 = num.intValue();
                go1 go1Var3 = (go1) fe0Var;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    tc0Var.invoke(go1Var3, 0);
                    break;
                }
            case 3:
                num.getClass();
                eu5.g(tc0Var, fe0Var, mu0.X(7));
                break;
            case 4:
                num.getClass();
                eu5.g(tc0Var, fe0Var, mu0.X(7));
                break;
            case 5:
                num.getClass();
                ci2.j(tc0Var, fe0Var, mu0.X(7));
                break;
            default:
                int intValue4 = num.intValue();
                go1 go1Var4 = (go1) fe0Var;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    go1Var4.W();
                    break;
                } else {
                    tc0Var.invoke(go1Var4, 0);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ x10(tc0 tc0Var, int i, byte b) {
        this.I = b;
        this.J = tc0Var;
    }
}
