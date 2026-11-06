package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ut1 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ut1(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                String str = (String) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    if (str == null) {
                        str = "";
                    }
                    p70.k(str, null, null, false, false, j16.w, go1Var, 196608, 30);
                    break;
                }
            case 1:
                tc0 tc0Var = (tc0) obj4;
                ui uiVar = (ui) obj;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                uiVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((go1) fe0Var2).g(uiVar) : ((go1) fe0Var2).i(uiVar) ? 4 : 2;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(1 & intValue2, (intValue2 & 19) != 18)) {
                    go1Var2.W();
                    break;
                } else {
                    mw2.b(bp3.a.a(uiVar), p70.u0(-511706730, new x10(tc0Var, (byte) 6), go1Var2), go1Var2, 48);
                    break;
                }
            case 2:
                ((hj4) obj4).c();
                break;
            default:
                rm1 rm1Var = (rm1) obj4;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((w74) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    p70.p(3078, 20, go1Var3, rm1Var, null, "前往设置", true);
                    break;
                }
        }
        return wd5Var;
    }
}
