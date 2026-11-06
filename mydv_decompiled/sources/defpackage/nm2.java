package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nm2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ nm2(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                t43Var.setValue(str);
                break;
            default:
                oi1 oi1Var = (oi1) obj;
                oi1Var.getClass();
                boolean b2 = oi1Var.b();
                k74 k74Var = qe4.a;
                t43Var.setValue(Boolean.valueOf(b2));
                break;
        }
        return wd5Var;
    }
}
