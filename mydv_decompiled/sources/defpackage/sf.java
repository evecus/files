package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sf implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ sf(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                ca2 ca2Var = (ca2) t43Var.getValue();
                if (ca2Var == null) {
                    t02.d("Required value was null.");
                    zy.n();
                    break;
                } else {
                    break;
                }
            case 1:
                ca2 ca2Var2 = (ca2) t43Var.getValue();
                if (ca2Var2 == null) {
                    t02.d("Required value was null.");
                    zy.n();
                    break;
                } else {
                    break;
                }
            case 2:
                if (t43Var != null) {
                    break;
                }
                break;
            case 3:
                Boolean bool = (Boolean) t43Var.getValue();
                bool.booleanValue();
                break;
            case 4:
                t43Var.setValue(Boolean.TRUE);
                break;
            case 5:
                t43Var.setValue(Boolean.FALSE);
                break;
            case 6:
                t43Var.setValue(null);
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                t43Var.setValue(Boolean.TRUE);
                break;
            case 11:
                t43Var.setValue(Boolean.FALSE);
                break;
            case 12:
                break;
            case 13:
                t43Var.setValue(Boolean.FALSE);
                break;
            case 14:
                ca2 ca2Var3 = (ca2) t43Var.getValue();
                if (ca2Var3 == null) {
                    t02.d("Required value was null.");
                    zy.n();
                    break;
                } else {
                    break;
                }
            case 15:
                t43Var.setValue(null);
                break;
            case 16:
                t43Var.setValue(Boolean.FALSE);
                break;
            case 17:
                t43Var.setValue(Boolean.TRUE);
                break;
            case 18:
                t43Var.setValue(Boolean.TRUE);
                break;
            case 19:
                t43Var.setValue(null);
                break;
            case 20:
                t43Var.setValue(Boolean.TRUE);
                break;
            case 21:
                t43Var.setValue(null);
                break;
            case 22:
                t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                break;
            case 23:
                t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                break;
            case 24:
                t43Var.setValue(null);
                break;
            case 25:
                t43Var.setValue(Boolean.FALSE);
                break;
            case 26:
                t43Var.setValue(jx4.F((String) t43Var.getValue()));
                break;
            case 27:
                if (((String) t43Var.getValue()).length() < 6) {
                    t43Var.setValue(((String) t43Var.getValue()) + "0");
                    break;
                }
                break;
            case 28:
                t43Var.setValue(Boolean.FALSE);
                break;
            default:
                t43Var.setValue(Boolean.TRUE);
                break;
        }
        return wd5Var;
    }
}
