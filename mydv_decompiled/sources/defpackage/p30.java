package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p30 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ rm1 K;
    public final /* synthetic */ ki1 L;

    public /* synthetic */ p30(rm1 rm1Var, rm1 rm1Var2, ki1 ki1Var) {
        this.I = (byte) 1;
        this.J = rm1Var;
        this.K = rm1Var2;
        this.L = ki1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        i13 i13Var = i13.a;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.L;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    p70.p(3078, 16, go1Var, this.J, j42.x(i13Var, ki1Var), "重试", true);
                    p70.p(3078, 20, go1Var, this.K, null, "设置", false);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    hx1 C = rt0.C();
                    rm1 rm1Var = this.J;
                    boolean g = go1Var2.g(rm1Var);
                    rm1 rm1Var2 = this.K;
                    boolean g2 = g | go1Var2.g(rm1Var2);
                    Object Q = go1Var2.Q();
                    if (g2 || Q == de0.a) {
                        Q = new ka(rm1Var, rm1Var2, (byte) 28);
                        go1Var2.o0(Q);
                    }
                    lq2.d(C, "查看主播主页", (rm1) Q, j42.x(i42.G0(i13.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), ki1Var), false, false, null, null, null, 0.0f, 0L, null, 0, 0, go1Var2, 48, 0, 16368);
                    break;
                }
                break;
            default:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    p70.p(3078, 16, go1Var3, this.J, j42.x(i13Var, ki1Var), "返回", true);
                    p70.p(3078, 20, go1Var3, this.K, null, "设置", false);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ p30(ki1 ki1Var, rm1 rm1Var, rm1 rm1Var2, byte b) {
        this.I = b;
        this.L = ki1Var;
        this.J = rm1Var;
        this.K = rm1Var2;
    }
}
