package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class po2 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;

    public /* synthetic */ po2(rm1 rm1Var, byte b) {
        this.I = b;
        this.J = rm1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        rm1 rm1Var = this.J;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    p70.p(3078, 20, go1Var, this.J, null, "重新加载", true);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    qe4.f(rm1Var, null, go1Var2, 0);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 2:
                ww2 ww2Var = (ww2) obj;
                pw2 pw2Var = (pw2) obj2;
                dh0 dh0Var = (dh0) obj3;
                float f = ((r11) rm1Var.invoke()).I;
                bn3 u = pw2Var.u(dh0.a(dh0Var.a, 0, 0, eh0.f(r11.c(f, Float.NaN) ? 0 : ww2Var.X(f), dh0Var.a), 0, 11));
                return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 11));
            default:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    p70.p(390, 24, go1Var3, this.J, nq4.e(i13.a, 1.0f), "加载更多评论", false);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
        }
    }
}
