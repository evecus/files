package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nn2 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ nn2(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                tm1 tm1Var = (tm1) t43Var.getValue();
                if (tm1Var != null) {
                    tm1Var.invoke(bool);
                    break;
                }
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ta1 ta1Var = on5.a;
                tm1 tm1Var2 = (tm1) t43Var.getValue();
                if (tm1Var2 != null) {
                    tm1Var2.invoke(bool2);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
