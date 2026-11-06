package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fc implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ fc(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(1 & intValue, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    Object Q = go1Var.Q();
                    if (Q == de0.a) {
                        Q = new t5((byte) 4);
                        go1Var.o0(Q);
                    }
                    d4.c(new yo((tm1) Q, false), (hn1) t43Var.getValue(), go1Var, 0);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    p70.q(hc4.Q(), j42.c((String) t43Var.getValue(), "加载超时") ? "加载超时" : "加载失败", i42.D0(i13.a, 8.0f, 24.0f), "点击或按确定键重试", rw4.J, true, null, go1Var2, 224640, 64);
                    break;
                }
            default:
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                if (intValue3 > 0 && intValue4 > 0) {
                    t43Var.setValue(new z22((intValue4 & 4294967295L) | (intValue3 << 32)));
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
