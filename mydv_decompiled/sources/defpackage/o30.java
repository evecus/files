package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o30 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ rm1 K;

    public /* synthetic */ o30(ki1 ki1Var, rm1 rm1Var, byte b) {
        this.I = b;
        this.J = ki1Var;
        this.K = rm1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        i13 i13Var = i13.a;
        ki1 ki1Var = this.J;
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
                    p70.p(3078, 16, go1Var, this.K, j42.x(i13Var, ki1Var), "前往设置", true);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    l13 x = j42.x(i13Var, ki1Var);
                    rm1 rm1Var = this.K;
                    boolean g = go1Var2.g(rm1Var);
                    Object Q = go1Var2.Q();
                    if (g || Q == de0.a) {
                        Q = new mo0(rm1Var, (byte) 2);
                        go1Var2.o0(Q);
                    }
                    p70.p(3078, 16, go1Var2, (rm1) Q, x, "重试", true);
                    break;
                }
            default:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    p70.p(3078, 16, go1Var3, this.K, j42.x(i13Var, ki1Var), "去登录", true);
                    break;
                }
        }
        return wd5Var;
    }
}
