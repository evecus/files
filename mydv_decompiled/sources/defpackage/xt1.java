package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xt1 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ float J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ xt1(float f, lq1 lq1Var, i80 i80Var, i80 i80Var2, int i) {
        this.J = f;
        this.K = lq1Var;
        this.L = i80Var;
        this.M = i80Var2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                ab4 ab4Var = (ab4) obj5;
                hu2 hu2Var = (hu2) obj4;
                t43 t43Var = (t43) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z = (intValue & 3) != 2;
                int i = 1 & intValue;
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(i, z)) {
                    go1Var.W();
                    break;
                } else {
                    boolean e = go1Var.e(ab4Var.ordinal()) | go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    if (e || Q == de0.a) {
                        Q = new m6((Object) ab4Var, (Object) hu2Var, (Object) t43Var, (byte) 12);
                        go1Var.o0(Q);
                    }
                    ou2.b(ab4Var, (tm1) Q, null, this.J, go1Var, 0);
                    break;
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                e41.h(this.J, (lq1) obj5, (i80) obj4, (i80) obj3, (fe0) obj, mu0.X(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ou2.b((ab4) obj5, (tm1) obj4, (l13) obj3, this.J, (fe0) obj, mu0.X(1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ xt1(ab4 ab4Var, tm1 tm1Var, l13 l13Var, float f, int i) {
        this.K = ab4Var;
        this.L = tm1Var;
        this.M = l13Var;
        this.J = f;
    }

    public /* synthetic */ xt1(ab4 ab4Var, hu2 hu2Var, float f, t43 t43Var) {
        this.K = ab4Var;
        this.L = hu2Var;
        this.J = f;
        this.M = t43Var;
    }
}
