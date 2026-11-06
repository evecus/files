package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zn2 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ k80 L;

    public /* synthetic */ zn2(ki1 ki1Var, t43 t43Var, k80 k80Var, byte b) {
        this.I = b;
        this.J = ki1Var;
        this.K = t43Var;
        this.L = k80Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        jp jpVar = de0.a;
        i13 i13Var = i13.a;
        k80 k80Var = this.L;
        t43 t43Var = this.K;
        ki1 ki1Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    hx1 E = kb4.E();
                    l13 x = j42.x(i13Var, ki1Var);
                    Object Q = go1Var.Q();
                    if (Q == jpVar) {
                        Q = new sf(t43Var, (byte) 10);
                        go1Var.o0(Q);
                    }
                    lq2.d(E, "弹幕样式", (rm1) Q, x, false, false, null, null, p70.u0(-1060915111, new h30(k80Var, (byte) 3), go1Var), 0.0f, 0L, null, 0, 0, go1Var, 100663728, 0, 16112);
                    break;
                }
            default:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    hx1 E2 = kb4.E();
                    l13 x2 = j42.x(i13Var, ki1Var);
                    Object Q2 = go1Var2.Q();
                    if (Q2 == jpVar) {
                        Q2 = new il4(t43Var, (byte) 14);
                        go1Var2.o0(Q2);
                    }
                    lq2.d(E2, "弹幕设置", (rm1) Q2, x2, false, false, null, null, p70.u0(-1112042845, new h30(k80Var, (byte) 10), go1Var2), 0.0f, 0L, null, 0, 0, go1Var2, 100663728, 0, 16112);
                    break;
                }
        }
        return wd5Var;
    }
}
