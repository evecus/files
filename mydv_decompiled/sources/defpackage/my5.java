package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class my5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ oy5 J;
    public final /* synthetic */ o84 K;

    public /* synthetic */ my5(oy5 oy5Var, o84 o84Var, byte b) {
        this.I = b;
        this.J = oy5Var;
        this.K = o84Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        o84 o84Var = this.K;
        oy5 oy5Var = this.J;
        yp ypVar = (yp) obj;
        switch (b) {
            case 0:
                ypVar.getClass();
                oy5Var.a(o84Var, ypVar);
                break;
            default:
                ypVar.getClass();
                oy5Var.b(o84Var, ypVar);
                break;
        }
        return wd5Var;
    }
}
