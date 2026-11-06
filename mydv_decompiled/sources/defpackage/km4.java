package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class km4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ki1 J;

    public /* synthetic */ km4(ki1 ki1Var, byte b) {
        this.I = b;
        this.J = ki1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.J;
        switch (b) {
            case 0:
                ei1 ei1Var = (ei1) obj;
                ei1Var.getClass();
                ei1Var.b(ki1Var);
                break;
            default:
                ei1 ei1Var2 = (ei1) obj;
                ei1Var2.getClass();
                ei1Var2.b(ki1Var);
                break;
        }
        return wd5Var;
    }
}
