package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cv implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;

    public /* synthetic */ cv(tm1 tm1Var, t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        int ordinal;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        t43 t43Var2 = this.K;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                d55 d55Var = (d55) obj;
                t43Var2.setValue(d55Var);
                boolean c = j42.c((String) t43Var.getValue(), d55Var.a.J);
                oj ojVar = d55Var.a;
                t43Var.setValue(ojVar.J);
                if (!c) {
                    tm1Var.invoke(ojVar.J);
                }
                return wd5Var;
            default:
                int intValue = ((Integer) obj).intValue();
                if (((String) t43Var2.getValue()).length() >= 4) {
                    return wd5Var;
                }
                String str = ((String) t43Var2.getValue()) + intValue;
                t43Var2.setValue(str);
                t43Var.setValue(Boolean.FALSE);
                if (str.length() != 4 || (ordinal = ((wm3) tm1Var.invoke(str)).ordinal()) == 0) {
                    return wd5Var;
                }
                if (ordinal != 1) {
                    s83.v();
                    return null;
                }
                t43Var2.setValue("");
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
        }
    }
}
